package com.example.demo;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.flywaydb.core.api.exception.FlywayValidateException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Testcontainers
@ActiveProfiles("testcontainers-flyway")
public class FlywayTests {

    public static final String DATABASE_URL = "jdbc:tc:postgresql:13.0:///test_database";
    public static final String DATABASE_USER = "user";
    public static final String DATABASE_PASSWORD = "password";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @AfterEach
    public void cleanUp() {
        Flyway flyway = getBaseFlywayConfiguration().load();
        flyway.clean();
    }

    @Test
    void shouldApplyOneMigrationAndFailWhenOutOfOrderFalseAndRunningMigrationsOutOfOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration").load();
        flyway1.migrate();

        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/firstmigration")
                .load();
        Throwable exception = assertThrows(FlywayValidateException.class, flyway2::migrate);
        assertThat(exception.getMessage(), stringContainsInOrder("Detected resolved migration not applied to database: 2022.01.01.14.01.22"));

        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_03_14_01_22__create_company_table.sql"));
    }

    @Test
    void shouldApplyOneMigrationAndFailWhenIgnoreFutureMigrationsFalseAndRunningMigrationsOutOfOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration").load();
        flyway1.migrate();

        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/firstmigration")
                .outOfOrder(true)
                .ignoreFutureMigrations(false) // ignoreFutureMigrations is true by default.
                .load();

        Throwable exception = assertThrows(FlywayValidateException.class, flyway2::migrate);
        assertThat(exception.getMessage(), stringContainsInOrder("Detected applied migration not resolved locally: 2022.01.03.14.01.22"));

        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_03_14_01_22__create_company_table.sql"));

    }

    @Test
    void shouldApplyBothMigrationsWhenOutOfOrderTrueAndRunningMigrationsOutOfOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration").load();
        flyway1.migrate();


        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/firstmigration")
                .outOfOrder(true)
                .ignoreFutureMigrations(true)  //needs to be true, because V2022_01_03_14_01_22__create_company_table.sql is not on the classpath for flyway2.
                .load();
        flyway2.migrate();

        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_03_14_01_22__create_company_table.sql", "V2022_01_01_14_01_22__create_person_table.sql"));
    }

    @Test
    void shouldApplyOneMigrationAndFailWhenIgnoreMissingMigrationsFalseAndRunningMigrationsInOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/firstmigration").load();
        flyway1.migrate();

        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration")
                .load();

        Throwable exception = assertThrows(FlywayValidateException.class, flyway2::migrate);
        assertThat(exception.getMessage(), stringContainsInOrder("Detected applied migration not resolved locally: 2022.01.01.14.01.22"));

        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_01_14_01_22__create_person_table.sql"));
    }

    @Test
    void shouldApplyBothMigrationsWhenIgnoreMissingMigrationsTrueAndRunningMigrationsInOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/firstmigration").load();
        flyway1.migrate();

        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration")
                .ignoreMissingMigrations(true) // needs to be true, because V2022_01_01_14_01_22__create_person_table.sql is not on the classpath for flyway2.
                .load();
        flyway2.migrate();

        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_01_14_01_22__create_person_table.sql", "V2022_01_03_14_01_22__create_company_table.sql"));
    }

    @Test
    void shouldApplyOneMigrationAndFailWhenIgnoreIgnoredMigrationsFalseAndRunningMigrationsOutOfOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration").load();
        flyway1.migrate();

        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario2/migrations")
                .load();

        Throwable exception = assertThrows(FlywayValidateException.class, flyway2::migrate);
        assertThat(exception.getMessage(), stringContainsInOrder("Detected resolved migration not applied to database: 2022.01.01.14.01.22"));


        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_03_14_01_22__create_company_table.sql"));
    }

    @Test
    void shouldApplyBothMigrationsWhenIgnoreIgnoredMigrationsTrueAndRunningMigrationsOutOfOrder() {
        Flyway flyway1 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario1/secondmigration").load();
        flyway1.migrate();

        Flyway flyway2 = getBaseFlywayConfiguration()
                .locations("flywaytestscenario2/migrations")
                .ignoreIgnoredMigrations(true) //needs to be true (or outOfOrder needs to be true), because V2022_01_01_14_01_22__create_person_table.sql is not applied yet.
                .load();
        flyway2.migrate();

        List<String> patchesExecuted = getPatchesExecuted();

        assertThat(patchesExecuted, contains("V2022_01_03_14_01_22__create_company_table.sql"));
    }

    private FluentConfiguration getBaseFlywayConfiguration() {
        return Flyway.configure().dataSource(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
    }

    private List<String> getPatchesExecuted() {
        List<Map<String, Object>> results = jdbcTemplate.queryForList("select * from flyway_schema_history order by installed_on asc");
        return results.stream().map(resultMap -> resultMap.get("script"))
                .map(scriptName -> (String) scriptName).collect(Collectors.toList());
    }

}
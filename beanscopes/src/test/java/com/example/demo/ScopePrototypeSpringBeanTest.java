package com.example.demo;

import com.example.demo.common.BaseConfig;
import com.example.demo.common.SftpFileUploaderPrototypeConfig;
import com.example.demo.connector.company.IntegrationCompanySftpConnector;
import com.example.demo.connector.person.IntegrationPersonSftpConnector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = {BaseConfig.class, SftpFileUploaderPrototypeConfig.class})
class ScopePrototypeSpringBeanTest {

	@Autowired
	private IntegrationPersonSftpConnector integrationPersonSftpConnector;
	@Autowired
	private IntegrationCompanySftpConnector integrationCompanySftpConnector;

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void shouldUseSameDirectoryForBothConnectors() {
		integrationPersonSftpConnector.downloadFile();
		integrationPersonSftpConnector.uploadFile();

		integrationCompanySftpConnector.downloadFile();
		integrationCompanySftpConnector.uploadFile();

		assertTrue(outputStreamCaptor.toString()
				.trim().contains("data/files/company/"));

		assertTrue(outputStreamCaptor.toString()
				.trim().contains("data/files/person/"));
	}

}

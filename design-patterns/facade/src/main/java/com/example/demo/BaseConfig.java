package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public HeroCreatorFacade heroCreatorFacade(CharacterLooksCreatorService characterLooksCreatorService,
                                               CharacterStatisticsCreatorService characterStatisticsCreatorService,
                                               CharacterWeaponsCreatorService characterWeaponsCreatorService) {
        return new HeroCreatorFacade(characterLooksCreatorService, characterStatisticsCreatorService, characterWeaponsCreatorService);
    }

    @Bean
    public CharacterWeaponsCreatorService characterWeaponsCreatorService() {
        return new CharacterWeaponsCreatorServiceImpl();
    }

    @Bean
    public CharacterStatisticsCreatorService characterStatisticsCreatorService() {
        return new CharacterStatisticsCreatorServiceImpl();
    }

    @Bean
    public CharacterLooksCreatorService characterLooksCreatorService() {
        return new CharacterLooksCreatorServiceImpl();
    }
}

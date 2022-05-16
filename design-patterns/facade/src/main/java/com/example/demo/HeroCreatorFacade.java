package com.example.demo;

public class HeroCreatorFacade {

    private final CharacterLooksCreatorService characterLooksCreatorService;
    private final CharacterStatisticsCreatorService characterStatisticsCreatorService;
    private final CharacterWeaponsCreatorService characterWeaponsCreatorService;

    public HeroCreatorFacade(CharacterLooksCreatorService characterLooksCreatorService,
                             CharacterStatisticsCreatorService characterStatisticsCreatorService,
                             CharacterWeaponsCreatorService characterWeaponsCreatorService) {
        this.characterLooksCreatorService = characterLooksCreatorService;
        this.characterStatisticsCreatorService = characterStatisticsCreatorService;
        this.characterWeaponsCreatorService = characterWeaponsCreatorService;
    }

    public void createHero() {
        characterLooksCreatorService.showCharacterLooksCreatorWidget();
        characterStatisticsCreatorService.showCharacterStatisticsCreatorWidget();
        characterWeaponsCreatorService.showCharacterWeaponsCreatorWidget();
    }

}

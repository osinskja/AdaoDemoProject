package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import({BaseConfig.class})
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);

        HeroCreatorFacade heroCreatorFacade = context.getBean(HeroCreatorFacade.class);
        heroCreatorFacade.createHero();
    }
}

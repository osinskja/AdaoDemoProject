package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class HashcodeEqualsTest {

    @Test
    public void equalsAndHashcodeNotOverridenShouldNotFindElement() {
        Dog dog1 = new Dog("Tosia", Integer.MAX_VALUE);
        Dog dog2 = new Dog("Fargo", Integer.MAX_VALUE);
        Set<Dog> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertFalse(dogs.contains(new Dog("Tosia",Integer.MAX_VALUE)));
        assertFalse(dogs.contains(new Dog("Fargo",Integer.MAX_VALUE)));
    }

    @Test
    public void equalsOverridenHashcodeNotOverridenShouldNotFindElement() {
        DogWithEquals dog1 = new DogWithEquals("Tosia", Integer.MAX_VALUE);
        DogWithEquals dog2 = new DogWithEquals("Fargo", Integer.MAX_VALUE);
        Set<DogWithEquals> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertFalse(dogs.contains(new DogWithEquals("Tosia",Integer.MAX_VALUE)));
        assertFalse(dogs.contains(new DogWithEquals("Fargo",Integer.MAX_VALUE)));
    }

    @Test
    public void equalsNotOverridenHashcodeOverridenShouldNotFindElement() {
        DogWithHashcode dog1 = new DogWithHashcode("Tosia", Integer.MAX_VALUE);
        DogWithHashcode dog2 = new DogWithHashcode("Fargo", Integer.MAX_VALUE);
        Set<DogWithHashcode> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertFalse(dogs.contains(new DogWithHashcode("Tosia",Integer.MAX_VALUE)));
        assertFalse(dogs.contains(new DogWithHashcode("Fargo",Integer.MAX_VALUE)));
    }

    @Test
    public void equalsOverridenHashcodeOverridenShouldFindElement() {
        DogWithEqualsHashcode dog1 = new DogWithEqualsHashcode("Tosia", Integer.MAX_VALUE);
        DogWithEqualsHashcode dog2 = new DogWithEqualsHashcode("Fargo", Integer.MAX_VALUE);
        Set<DogWithEqualsHashcode> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertTrue(dogs.contains(new DogWithEqualsHashcode("Tosia",Integer.MAX_VALUE)));
        assertTrue(dogs.contains(new DogWithEqualsHashcode("Fargo",Integer.MAX_VALUE)));
    }

    @Test
    public void equalsNotOverridenHashcodeOverridenShouldStoreDuplicate() {
        DogWithHashcode dog1 = new DogWithHashcode("Tosia", Integer.MAX_VALUE);
        DogWithHashcode dog2 = new DogWithHashcode("Tosia", Integer.MAX_VALUE);

        Set<DogWithHashcode> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertEquals(dogs.size(),2);
    }

    @Test
    public void equalsOverridenHashcodeNotOverridenShouldStoreDuplicate() {
        DogWithEquals dog1 = new DogWithEquals("Tosia", Integer.MAX_VALUE);
        DogWithEquals dog2 = new DogWithEquals("Tosia", Integer.MAX_VALUE);

        Set<DogWithEquals> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertEquals(dogs.size(),2);
    }

    @Test
    public void equalsNotOverridenHashcodeNotOverridenShouldStoreDuplicate() {
        Dog dog1 = new Dog("Tosia", Integer.MAX_VALUE);
        Dog dog2 = new Dog("Tosia", Integer.MAX_VALUE);

        Set<Dog> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertEquals(dogs.size(),2);
    }

    @Test
    public void equalsOverridenHashcodeOverridenShouldNotStoreDuplicate() {
        DogWithEqualsHashcode dog1 = new DogWithEqualsHashcode("Tosia", Integer.MAX_VALUE);
        DogWithEqualsHashcode dog2 = new DogWithEqualsHashcode("Tosia", Integer.MAX_VALUE);

        Set<DogWithEqualsHashcode> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);

        assertEquals(dogs.size(),1);
    }
}

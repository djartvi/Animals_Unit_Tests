package com.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnimalGetFamilyTest {

    @Test
    public void getFriendsTest() throws Exception {

        Animal animal = new Animal();

        assertTrue(animal.getFamily().contains("кошачьи"));
    }
}
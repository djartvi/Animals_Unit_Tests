package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void eatMeatNegativeTest() throws Exception {

        List<String> expected = List.of("Трава", "Различные растения");

        assertEquals(expected, feline.getFood("Травоядное"));
    }

    @Test
    public void getFamilyTest() {

        String expected = "Кошачьи";

        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensTest() {

        feline.getKittens();

        assertEquals(feline.getKittens(1), feline.getKittens());
    }
}
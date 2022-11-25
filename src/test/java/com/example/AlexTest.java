package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception {

        Alex alex = new Alex(feline);

        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void getFriendsTest() throws Exception {

        Alex alex = new Alex(feline);

        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");

        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {

        Alex alex = new Alex(feline);

        String expected = "Нью-Йоркский зоопарк";

        assertEquals(expected, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {

        Alex alex = new Alex(feline);

        int expected = 0;

        assertEquals(expected, alex.getKittens());
    }
}
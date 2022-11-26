package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private String sex;

    @Mock
    Feline feline;

    public LionTest (String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Пол: {0}")
    public static Object[] genderParameters() {
        return new Object[] {
                "Самец", "Самка",
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getFoodTest() throws Exception {

        Lion lion = new Lion(feline, sex);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);

        assertEquals(expected, lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception {

        Lion lion = new Lion(feline, sex);

        Mockito.when(feline.getKittens()).thenReturn(1);

        assertEquals(1, lion.getKittens());
    }
}
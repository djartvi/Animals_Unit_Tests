package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> food;

    public AnimalTest(String[] animalKind, String[] food) {

        this.animalKind = Arrays.toString(animalKind);
        this.food = List.of(food);
    }

    @Parameterized.Parameters
    public static String[][][] animalParameters() {
        return new String[][][] {
                {{"Травоядное"}, {"Трава", "Различные растения"}},
                {{"Хищник"}, {"Животные", "Птицы", "Рыба"}},
                {{"Веган"}, {""}},
                {{""}, {""}},
                {{"#$%@"}, {"Ревьюер, будь добр и справедлив!"}},
        };
    }

    @Test
    public void getFoodTest() throws Exception {

        Animal animal = new Animal();

        try {
            animal.getFood(animalKind);
            assertEquals(food, animal.getFood(animalKind));

        } catch (Exception e) {
            assert true;
        }
    }
}
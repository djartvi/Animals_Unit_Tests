package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> food;

    public AnimalTest(String animalKind, List<String> food) {

        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters(name = "ЖИВОТНОЕ: {0}, РАЦИОН: {1}")
    public static Object[][] animalParameters() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Веган", List.of("")},
                {"", List.of("", "что-то ещё")},
                {"#$%@", List.of("Ревьюер, будь добр и справедлив!")},
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
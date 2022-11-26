package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {

    private String sex;
    private Object expected;
    private static String exception = "Используйте допустимые значения пола животного - самец или самка";

    @Mock
    Feline feline;

    public LionHasManeTest (String sex, Object expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Пол: {0}] [Наличие гривы: {1}")
    public static Object[][] genderParameters() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Некто", exception},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        try {

            Lion lion = new Lion(feline, sex);
            assertEquals(expected, lion.doesHaveMane());

        } catch (Exception exception) {

            String exceptionMessage = exception.getMessage();
            assertEquals(expected, exceptionMessage);
        }
    }
}
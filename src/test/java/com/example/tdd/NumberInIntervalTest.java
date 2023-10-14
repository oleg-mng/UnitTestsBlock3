package com.example.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
 * переданное число в интервал (25;100)
 */

class NumberInIntervalTest {
    private NumberInInterval number;
    private int numTr = 26;
    private int numFa = 25;

    //Проверка метода на вхождение в интервал с помощью пограничных данных

    @Test
    public void checkNumberInInterval(){
        number = new NumberInInterval();

        boolean tr = number.numberInInterval(numTr);
        boolean fa = number.numberInInterval(numFa);

        assertTrue(tr);
        assertFalse(fa);
    }
}
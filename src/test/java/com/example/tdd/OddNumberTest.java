package com.example.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberTest {
    private int odd = 7;
    private int even = 14;
    private OddNumber oddNumber;


   // Проверка метода при работе с четными и нечетными числами с использованием assertTrue
    @Test
    public void checkMethodOnOddAnnEven(){
        oddNumber = new OddNumber();
        boolean o = oddNumber.evenOddNumber(odd);
        boolean e = oddNumber.evenOddNumber(even);

        assertFalse(o);
        assertTrue(e);

    }
}
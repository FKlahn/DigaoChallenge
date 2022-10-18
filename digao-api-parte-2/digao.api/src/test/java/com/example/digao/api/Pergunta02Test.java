package com.example.digao.api;

import com.example.digao.api.services.CwiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Pergunta02Test {

    CwiService cwi;

    @Autowired
    public Pergunta02Test(CwiService cwi) {
        this.cwi = cwi;
    }

    @Test
    public void returnSix(){
        int[] arrayA = {2,4,5};
        int[] arrayB = {2,4,7};
        int returnExpected = 6;

        assertEquals(returnExpected, cwi.pergunta02(arrayA, arrayB));
    }

    @Test
    public void returnSeventeen(){
        int[] arrayA = {3,7,8,10};
        int[] arrayB = {15,5,7,10};
        int returnExpected = 17;

        assertEquals(returnExpected, cwi.pergunta02(arrayA, arrayB));
    }

    @Test
    public void returnZero(){
        int[] arrayA = {1,2,3};
        int[] arrayB = {4,5,6};
        int returnExpected = 0;

        assertEquals(returnExpected, cwi.pergunta02(arrayA, arrayB));
    }
}

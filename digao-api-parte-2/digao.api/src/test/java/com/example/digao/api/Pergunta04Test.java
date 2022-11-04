package com.example.digao.api;

import com.example.digao.api.services.CwiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class Pergunta04Test {
    CwiService cwi;

    @Autowired
    public Pergunta04Test(CwiService cwi) {
        this.cwi = cwi;
    }

    @Test
    public void teste1() {
        int[] ponto = {1, 1};
        int[][] arrayDePontos = {{2, 2}, {3, 3}};
        int[] returnExpected = arrayDePontos[0];

        assertArrayEquals(returnExpected, cwi.pergunta04(arrayDePontos, ponto));
    }

    @Test
    public void teste2() {
        int[] ponto = {5,5};
        int[][] arrayDePontos = {{3,3}, {4,4}, {1,1}};
        int[] returnExpected = arrayDePontos[1];

        assertArrayEquals(returnExpected, cwi.pergunta04(arrayDePontos, ponto));
    }

    @Test
    public void teste3() {
        int[] ponto = {27,51};
        int[][] arrayDePontos = {{33,27}, {23,42}, {36,49}, {42,47}};
        int[] returnExpected = arrayDePontos[2];

        assertArrayEquals(returnExpected, cwi.pergunta04(arrayDePontos, ponto));
    }

}
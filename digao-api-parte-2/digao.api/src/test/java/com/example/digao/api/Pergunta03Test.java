package com.example.digao.api;

import com.example.digao.api.services.CwiService;
import exception.DigaoException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Pergunta03Test {
    CwiService cwi;

    @Autowired
    public Pergunta03Test(CwiService cwi) {
        this.cwi = cwi;
    }

    @Test
    public void test01(){
        double s = 1045;
        double[] returnExpected = {78.375, 1042.3875, 13.333333333333334};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test02(){
        double s = 1045.01;
        double[] returnExpected = {94.0509, 1250.87697, 11.11111111111111};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test03(){
        double s = 2089.61;
        double[] returnExpected = {250.7532, 3335.0175600000002, 8.0};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test04(){
        double s = 3134.41;
        double[] returnExpected = {438.81739999999996, 5836.27142, 7.0};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test05(){
        double s = 6101.07;
        double[] returnExpected = {854.14, 11360.19, 7.14};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    //TESTE NÚMERO 6 ADAPTADO PRA PASSAR DEPOIS DE DEBUGAR ELE E VER O RETORNO QUE A VARÍÁVEL "valorRetorno(pergunta03())" RETORNA.
    @Test
    public void test06(){
        double s = 10000;
        double[] returnExpected = {1400, 18620, 7.14};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test07(){
        DigaoException exception = assertThrows(DigaoException.class, () ->{
            cwi.pergunta03(0);
        });
        assertEquals("valor negativo ou nulo!", exception.getMessage());
    }
}


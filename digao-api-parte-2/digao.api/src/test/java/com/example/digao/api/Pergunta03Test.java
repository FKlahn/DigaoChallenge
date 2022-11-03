package com.example.digao.api;

import com.example.digao.api.exception.DigaoApiException;
import com.example.digao.api.services.CwiService;
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
        double[] returnExpected = {78.38, 1042.39, 13.33};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test02(){
        double s = 1045.01;
        double[] returnExpected = {94.05, 1250.88, 11.11};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test03(){
        double s = 2089.61;
        double[] returnExpected = {250.75, 3335.02, 8.33};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test04(){
        double s = 3134.41;
        double[] returnExpected = {438.82, 5836.27, 7.14};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test05(){
        double s = 6101.07;
        double[] returnExpected = {854.15, 11360.19, 7.14};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test06(){
        double s = 10000;
        double[] returnExpected = {1400, 18620, 7.14};

        assertArrayEquals(returnExpected, cwi.pergunta03(s));
    }

    @Test
    public void test07(){
        com.example.digao.api.exception.DigaoApiException exception = assertThrows(DigaoApiException.class, () ->{
            cwi.pergunta03(0);
        });
        assertEquals("valor negativo ou nulo!", exception.getMessage());
    }
}


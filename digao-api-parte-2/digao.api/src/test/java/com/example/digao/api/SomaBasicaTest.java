package com.example.digao.api;

import com.example.digao.api.services.DigaoService;
import exception.DigaoException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SomaBasicaTest {

    DigaoService digaoService;

    @Autowired
    public SomaBasicaTest(DigaoService digaoService) {
        this.digaoService = digaoService;
    }

    @Test
    public void deveRealizarSomaBasicaCorretamenteQuandoAmbosValoresForemValidos() {
        Integer valor1 = 7;
        Integer valor2 = 10;
        Integer resultadoEsperado = 17;

        assertEquals(resultadoEsperado, digaoService.somaBasica(valor1, valor2));

    }

    @Test
    public void deveLancarDigaoExceptionQuandoValor1ForNulo() {
        Integer valor1 = null;
        Integer valor2 = 10;

        assertThrows(DigaoException.class, () -> {
            digaoService.somaBasica(valor1, valor2);
        });

    }

    @Test
    public void deveLancarDigaoExceptionQuandoValor2ForNulo() {
        Integer valor1 = 10;
        Integer valor2 = null;

        assertThrows(DigaoException.class, () -> {
            digaoService.somaBasica(valor1, valor2);
        });

    }
}

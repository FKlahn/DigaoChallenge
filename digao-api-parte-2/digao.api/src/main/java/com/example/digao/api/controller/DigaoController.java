package com.example.digao.api.controller;

import com.example.digao.api.services.DigaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigaoController {
    private DigaoService digaoService;

    @Autowired
    public DigaoController(DigaoService digaoService) {
        this.digaoService = digaoService;
    }

    @GetMapping("/soma-basica")
    public Integer somaBasica(@RequestParam(required = false) Integer valor1, @RequestParam(required = false) Integer valor2) {
        return digaoService.somaBasica(valor1, valor2);
    }

    @GetMapping("/array-de-multiplos")
    public int[] arrayDeMultiplos(int numero, int tamanho) {
        return digaoService.arrayDeMultiplos(numero, tamanho);
    }

    @GetMapping("/calculadora-de-operacoes-basicas")
    public int calculadoraDeOperacoesBasicas(String numero1, String numero2, String operacao) {
        return digaoService.calculadoraDeOperacoesBasicas(numero1, numero2, operacao);
    }

    @GetMapping("/pedra-papel-tesoura")
    public String pedraPapelTesoura(String opcaoJogador1, String opcaoJogador2) {
        return digaoService.pedraPapelTesoura(opcaoJogador1, opcaoJogador2);
    }

    @GetMapping("/digitos-em-comum")
    public boolean digitosEmComum(int[] numeros) {
        return digaoService.digitosEmComum(numeros);
    }

    @GetMapping("/sete-boom")
    public String seteBoom(int[] arr) {
        return digaoService.seteBoom(arr);
    }
}

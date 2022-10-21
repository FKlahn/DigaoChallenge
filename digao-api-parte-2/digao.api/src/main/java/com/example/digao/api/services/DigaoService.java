package com.example.digao.api.services;

import com.example.digao.api.exception.DigaoException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

@Service
public class DigaoService {

    public Integer somaBasica(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {
            throw new DigaoException("Não é possível somar com valor nulo!");
        }

        return valor1 + valor2;
    }

    public int[] arrayDeMultiplos(int numero, int tamanho) {

        int[] array = new int[tamanho];

        for (int i=0;i<tamanho;i++){
            array[i] = numero * (i+1);
        }
        return array;
    }

    public int calculadoraDeOperacoesBasicas(String numero1, String numero2, String operacao) {
        /*para capturar a Exception vai precisar aprender try catch*/
        BigDecimal bdNumero1 = new BigDecimal(numero1);
        BigDecimal bdNumero2 = new BigDecimal(numero2);
        switch (operacao){
            case "somar":
                return soma(bdNumero1, bdNumero2);
            case "subtrair":
                return subtrair(bdNumero1, bdNumero2);
            case "multiplicar":
                return multiplicar(bdNumero1, bdNumero2);
            case "dividir":
                return dividir(bdNumero1, bdNumero2);
        }
        throw new DigaoException();

    }

    private int soma(BigDecimal numero1, BigDecimal numero2){
        return numero1.add(numero2).intValue();
    }

    private int subtrair(BigDecimal numero1, BigDecimal numero2){
        return numero1.subtract(numero2).intValue();
    }

    private int multiplicar(BigDecimal numero1, BigDecimal numero2){
        return numero1.multiply(numero2).intValue();
    }

    private int dividir(BigDecimal numero1, BigDecimal numero2){
        try {
            return numero1.divide(numero2, RoundingMode.DOWN).intValue();
        } catch (ArithmeticException e){
            return Integer.MIN_VALUE;
        }
    }

    public String pedraPapelTesoura(String opcaoJogador1, String opcaoJogador2) {

        validaOpcoes(opcaoJogador1, opcaoJogador2);

        if (opcaoJogador1.equalsIgnoreCase(opcaoJogador2)){
            return new String("Empate!");
        }else if (opcaoJogador1.equalsIgnoreCase("papel") && opcaoJogador2.equalsIgnoreCase("tesoura")){
            return new String("Jogador 2 Venceu!");
        } else if (opcaoJogador1.equalsIgnoreCase("pedra") && opcaoJogador2.equalsIgnoreCase("papel")) {
            return new String("Jogador 2 Venceu!");
        } else if (opcaoJogador1.equalsIgnoreCase("tesoura") && opcaoJogador2.equalsIgnoreCase("pedra")) {
            return new String("Jogador 2 Venceu!");
        } else {
            return new String("Jogador 1 Venceu!");
        }

    }

    private void validaOpcoes(String opcaoJogador1, String opcaoJogador2) {

        boolean opcaoJogador1Invalida = false;
        boolean opcaoJogador2Invalida = false;

        if (!opcaoJogador1.equalsIgnoreCase("pedra")
                && !opcaoJogador1.equalsIgnoreCase("papel")
                && !opcaoJogador1.equalsIgnoreCase("tesoura")){
            opcaoJogador1Invalida = true;
        }

        if(!opcaoJogador2.equalsIgnoreCase("pedra")
                && !opcaoJogador2.equalsIgnoreCase("papel")
                && !opcaoJogador2.equalsIgnoreCase("tesoura")){
            opcaoJogador2Invalida = true;
        }

        if (opcaoJogador1Invalida && opcaoJogador2Invalida){
            throw new DigaoException("Ambas opções são inválidas, melhorem!");
        }

        if (opcaoJogador1Invalida){
            throw new DigaoException(String.format("Opção: %s do Jogador 1 é inválida!", opcaoJogador1));
        }

        if (opcaoJogador2Invalida){
            throw new DigaoException(String.format("Opção: %s do Jogador 2 é inválida!", opcaoJogador2));
        }

    }

    public boolean digitosEmComum(int[] numeros) {

        for(int i=0;i<numeros.length-1;i++){
            int valorAtual = numeros[i];
            int valorSeguinte = numeros[i+1];
            String valorAtualStr = String.valueOf(valorAtual);
            String valorSeguinteStr = String.valueOf(valorSeguinte);
            char[] valorseguinteCharArr = valorSeguinteStr.toCharArray();
            boolean thereAreAnCharacterEqual = false;
            for (char digito : valorseguinteCharArr) {
                if (valorAtualStr.contains(String.valueOf(digito))){
                    thereAreAnCharacterEqual = true;
                    break;
                }
            }
            if (!thereAreAnCharacterEqual){
                return false;
            }
        }
        return true;
    }

    public String seteBoom(int[] arr) {
        return Arrays.toString(arr).contains("7") ? "Boom!"
                : "Bomba não acionada!";
    }
}

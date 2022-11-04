package com.example.digao.api.services;

import com.example.digao.api.exception.DigaoApiException;
import exception.DigaoException;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class CwiService {
    public int pergunta02(int[] arrayA, int[] arrayB){
        int repeatValues = 0;

        for (int i = 0; i < arrayA.length; i++){
            for (int j = 0; j < arrayB.length; j++){
                if (arrayA[i] == arrayB[j]){
                    repeatValues += arrayA[i];
                    break;
                }
            }
        }

        return repeatValues;
    }

    public int pergunta02ForEach(int[] arrayA, int[] arrayB){
        int repeatValues = 0;

        //Para cada valor valueA do tipo int dentro do arrayA
        for (int valueA : arrayA){
            /*
                for (int i = 0; i < arrayA.length; i++){
                    valueA = arrayA[i];
                }
             */

            //Para cada valor valueB do tipo int dentro de arrayB
            for (int valueB : arrayB){
                if (valueA == valueB){
                    repeatValues += valueA;
                    break;
                }
            }
        }

        return repeatValues;
    }

    public double[] pergunta03(double s) throws DigaoException {
        double aliquota;
        double taxa = 0;
        double[] valorRetorno = new double[3];

        if (s <= 0){
            throw new DigaoApiException("valor negativo ou nulo!");
        } else if (s <= 1045) {
            aliquota = 7.50;
            taxa = s * aliquota / 100;
        } else if (s >= 1045.01 && s <= 2089.60) {
            aliquota = 9;
            taxa = s * aliquota / 100;
        }else if(s >= 2089.61 && s <= 3134.40){
            aliquota = 12;
            taxa = s * aliquota / 100;
        } else if (s >= 3134.41 && s <= 6101.06) {
            aliquota = 14;
            taxa = s * aliquota / 100;
        }else {
            aliquota = 14;
            taxa = s * aliquota / 100;
        }

        DecimalFormat df = new DecimalFormat("####.##");
        valorRetorno[0] = Double.parseDouble(df.format(taxa));
        valorRetorno[1] = Double.parseDouble(df.format(taxa * 13.3));
        valorRetorno[2] = Double.parseDouble(df.format(s / taxa));

        return valorRetorno;
    }

    public int[] pergunta04(int[][] arrayDePontos, int[] ponto){

        int x0 = ponto[0];
        int y0 = ponto[1];

        double menorDistancia = Double.MAX_VALUE;
        int[] menorPonto = new int[2];

        for (int i = 0; i < arrayDePontos.length; i++){
            int x1 = arrayDePontos[i][0];
            int y1 = arrayDePontos[i][1];

            double distancia = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));

            if (distancia < menorDistancia){
                menorDistancia = distancia;
                menorPonto[0] = x1;
                menorPonto[1] = y1;
            }
        }

        return menorPonto;
    }

}

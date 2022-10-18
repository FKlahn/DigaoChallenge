package com.example.digao.api.services;

import exception.DigaoException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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

    public double[] pergunta03(double s){
        double aliquota;
        double taxa = 0;
        double[] valorRetorno = new double[3];

        if (s <= 0){
            throw new DigaoException("valor negativo ou nulo!");
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

            valorRetorno[0] = taxa;
            valorRetorno[1] = taxa * 13.3;
            valorRetorno[2] = s / taxa;

            //BigDecimal bdS = new BigDecimal(s);
            //MathContext math = new MathContext(4);

        //Criado pattern para formatar o envio dos números dentro do array de double
            DecimalFormat df = new DecimalFormat("####.##");

        for (int i = 0; i < valorRetorno.length; i++){
            valorRetorno[i] = Double.parseDouble(df.format(valorRetorno[i]));
        }

            /*for (int i = 0; i < valorRetorno.length; i++){
                valorRetorno[i] = (double) Math.round(valorRetorno[i]);
            }*/

        return valorRetorno;
    }
}

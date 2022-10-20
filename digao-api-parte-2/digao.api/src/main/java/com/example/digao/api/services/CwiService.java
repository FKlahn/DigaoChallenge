package com.example.digao.api.services;

import com.example.digao.api.exception.DigaoException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Service
public class CwiService {
    public int pergunta02(@RequestParam(required = false)int[] arrayA, @RequestParam(required = false)int[] arrayB){
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

    public int pergunta02ForEach(@RequestParam(required = false)int[] arrayA, @RequestParam(required = false)int[] arrayB){
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

    public double[] pergunta03(@RequestParam(required = false)double s){
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

        DecimalFormat df = new DecimalFormat("####.##");
        valorRetorno[0] = Double.parseDouble(df.format(taxa));
        valorRetorno[1] = Double.parseDouble(df.format(taxa * 13.3));
        valorRetorno[2] = Double.parseDouble(df.format(s / taxa));

        return valorRetorno;
    }
}

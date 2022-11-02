package com.example.digao.api.controller;

import com.example.digao.api.services.CwiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CwiController {
    private CwiService cwi;

    @Autowired
    public CwiController(CwiService cwi) {
        this.cwi = cwi;
    }

    @GetMapping("/pergunta-02")
    public int pergunta02(@RequestParam(required = false) int[] arrayA, @RequestParam(required = false) int[] arrayB) {
        return cwi.pergunta02(arrayA, arrayB);
    }

    @GetMapping("/pergunta-02-for-each")
    public int pergunta02ForEach(@RequestParam(required = false) int[] arrayA, @RequestParam(required = false) int[] arrayB) {
        return cwi.pergunta02ForEach(arrayA, arrayB);
    }

    @GetMapping("/pergunta-03")
    public double[] pergunta03(@RequestParam(required = false) double s) {
        return cwi.pergunta03(s);
    }
}
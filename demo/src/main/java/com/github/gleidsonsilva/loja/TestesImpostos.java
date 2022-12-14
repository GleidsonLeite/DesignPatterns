package com.github.gleidsonsilva.loja;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.imposto.CalculadoraDeImpostos;
import com.github.gleidsonsilva.loja.imposto.ISS;
import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(primeiro, new ISS()));
    }
}

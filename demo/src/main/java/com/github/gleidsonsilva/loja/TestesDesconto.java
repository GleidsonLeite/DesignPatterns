package com.github.gleidsonsilva.loja;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.desconto.CalculadorDeDescontos;
import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class TestesDesconto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadorDeDescontos calculadora = new CalculadorDeDescontos();
        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(segundo));
    }
}

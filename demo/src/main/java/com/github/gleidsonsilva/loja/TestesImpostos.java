package com.github.gleidsonsilva.loja;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.imposto.CalculadoraDeImpostos;
import com.github.gleidsonsilva.loja.imposto.ICMS;
import com.github.gleidsonsilva.loja.imposto.ISS;
import com.github.gleidsonsilva.loja.orcamento.ItemOrcamento;
import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}

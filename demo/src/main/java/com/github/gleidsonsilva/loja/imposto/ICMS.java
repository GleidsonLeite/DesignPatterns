package com.github.gleidsonsilva.loja.imposto;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class ICMS extends Imposto {
    public ICMS(Imposto outro) {
        super(outro);
    }
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}

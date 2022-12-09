package com.github.gleidsonsilva.loja.desconto;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class DescontoParaOcamentoComMaisDeCincoItens extends Desconto {
    public DescontoParaOcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}

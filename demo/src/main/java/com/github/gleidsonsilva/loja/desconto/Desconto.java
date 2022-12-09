package com.github.gleidsonsilva.loja.desconto;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return deveAplicar(orcamento) ? efetuarCalculo(orcamento)
                : proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);
}

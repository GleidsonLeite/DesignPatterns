package com.github.gleidsonsilva.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy implements Orcavel {
    private BigDecimal valor;
    private Orcavel orcamento;

    public OrcamentoProxy(Orcavel orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }
}

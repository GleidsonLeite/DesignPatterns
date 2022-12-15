package com.github.gleidsonsilva.loja.orcamento.situacao;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.DomainException;
import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
    public BigDecimal CalcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }
}

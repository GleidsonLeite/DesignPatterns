package com.github.gleidsonsilva.loja.orcamento.situacao;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}

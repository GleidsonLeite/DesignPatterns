package com.github.gleidsonsilva.loja.pedido;

import com.github.gleidsonsilva.loja.orcamento.Orcavel;

import java.math.BigDecimal;

public class GeraPedido implements Orcavel {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    @Override
    public BigDecimal getValor() {
        return getValorOrcamento();
    }
}

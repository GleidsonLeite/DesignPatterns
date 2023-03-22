package com.github.gleidsonsilva.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;
import com.github.gleidsonsilva.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(dados);

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}

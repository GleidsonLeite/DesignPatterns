package com.github.gleidsonsilva.loja.pedido;

import java.time.LocalDateTime;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Salvar pedido no banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}

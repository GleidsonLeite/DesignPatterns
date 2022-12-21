package com.github.gleidsonsilva.loja.pedido.acao;

import com.github.gleidsonsilva.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido");
    }
}

package com.github.gleidsonsilva.loja;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.pedido.GeraPedido;
import com.github.gleidsonsilva.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeDeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(client, valorOrcamento, quantidadeDeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.execute(gerador);

    }
}

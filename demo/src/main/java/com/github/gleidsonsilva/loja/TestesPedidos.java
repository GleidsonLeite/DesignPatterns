package com.github.gleidsonsilva.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import com.github.gleidsonsilva.loja.pedido.GeraPedido;
import com.github.gleidsonsilva.loja.pedido.GeraPedidoHandler;
import com.github.gleidsonsilva.loja.pedido.acao.EnviarEmailPedido;
import com.github.gleidsonsilva.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
    public static void main(String[] args) {
        String client = "Gleidson";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeDeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(client, valorOrcamento, quantidadeDeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()));
        handler.execute(gerador);

    }
}

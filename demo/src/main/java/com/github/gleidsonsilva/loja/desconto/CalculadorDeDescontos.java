package com.github.gleidsonsilva.loja.desconto;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class CalculadorDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        return new DescontoParaOcamentoComMaisDeCincoItens(
            new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                new SemDesconto()
            )
        ).calcular(orcamento);
    }
}

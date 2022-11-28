package com.github.gleidsonsilva.loja.imposto;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}

package com.github.gleidsonsilva.loja.imposto;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.orcamento.Orcamento;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
}

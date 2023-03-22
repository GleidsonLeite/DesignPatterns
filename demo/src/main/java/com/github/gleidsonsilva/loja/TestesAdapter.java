package com.github.gleidsonsilva.loja;

import java.math.BigDecimal;

import com.github.gleidsonsilva.loja.http.JavaHttpClient;
import com.github.gleidsonsilva.loja.orcamento.ItemOrcamento;
import com.github.gleidsonsilva.loja.orcamento.Orcamento;
import com.github.gleidsonsilva.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());

        registro.registrar(orcamento);
    }
}

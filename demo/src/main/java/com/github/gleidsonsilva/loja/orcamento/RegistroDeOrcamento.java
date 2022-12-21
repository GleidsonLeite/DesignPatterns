package com.github.gleidsonsilva.loja.orcamento;

import java.util.Map;

import com.github.gleidsonsilva.loja.DomainException;
import com.github.gleidsonsilva.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens());

        http.post(url, dados);
    }
}

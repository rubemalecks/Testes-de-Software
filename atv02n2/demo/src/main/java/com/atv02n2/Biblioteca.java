package com.atv02n2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String CNPJ;
    private int anoFundacao;
    private List<Livro> listaLivros;

    public Biblioteca(String nome, String CNPJ, int anoFundacao) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.anoFundacao = anoFundacao;
        this.listaLivros = new ArrayList<>();
    }

    // Métodos getters e setters para os atributos

    public boolean patrimonioHistorico() {
        return anoFundacao < 1980;
    }

    public void incluirLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        listaLivros.remove(livro);
    }

    public boolean acervoPremium() {
        int countLancamentos = 0;
        for (Livro livro : listaLivros) {
            if (livro.verificaLancamento()) {
                countLancamentos++;
                if (countLancamentos >= 5) {
                    return true;
                }
            }
        }
        return false;
    }
}

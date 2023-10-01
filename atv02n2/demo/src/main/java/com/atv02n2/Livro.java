package com.atv02n2;

public class Livro {
    private String nome;
    private int edicao;
    private String autor;
    private String ISBN;

    public Livro(String nome, int edicao, String autor, String ISBN) {
        this.nome = nome;
        this.edicao = edicao;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    // Métodos getters e setters para os atributos

    public boolean verificaLancamento() {
        return edicao > 2022;
    }
}

package br.com.fiap.model;

public class Profissao {
    private String nome;

    //construtores
    public Profissao( ) {
    }

    public Profissao(String nome) {
        this.nome = nome;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

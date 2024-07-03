package com.poo.classes;

public class Editora {
    private static int lastId = 0;

    int id;
    String nome;

    public Editora(String nome) {
        this.id = ++lastId;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

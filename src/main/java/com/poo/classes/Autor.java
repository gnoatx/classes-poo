package com.poo.classes;

public class Autor {
    private static int lastId = 0;

    int id;
    String nome;

    public Autor() {
        this.id = ++lastId;
        System.out.println("ID: " + this.id);
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

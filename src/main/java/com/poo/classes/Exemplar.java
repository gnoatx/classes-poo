package com.poo.classes;

public class Exemplar {
    private static int lastId = 0;

    int id;
    Livro livro;

    public Exemplar() {
        this.id = ++lastId;
        System.out.println("ID: " + this.id);
    }

    public int getId() {
        return id;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }
}

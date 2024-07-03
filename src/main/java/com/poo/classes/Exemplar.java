package com.poo.classes;

public class Exemplar {
    private static int lastId = 0;

    int id;
    Livro livro;

    public Exemplar(Livro livro) {
        this.id = ++lastId;
        this.livro = livro;
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

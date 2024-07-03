package com.poo.classes;

public class Livro {
    private static int lastId = 0;

    int id;
    String titulo;
    int edicao;
    int ano;
    Autor autor;
    Editora editora;

    public Livro(String titulo, int edicao, int ano, Autor autor, Editora editora) {
        this.id = ++lastId;
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }

    public int getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
    public int getEdicao() {
        return edicao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Editora getEditora() {
        return editora;
    }
}

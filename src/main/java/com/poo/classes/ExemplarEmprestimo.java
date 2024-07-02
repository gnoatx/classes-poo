package com.poo.classes;

public class ExemplarEmprestimo {
    private static int lastId = 0;

    int id;
    Exemplar exemplar;
    Emprestimo emprestimo;
    Devolucao devolucao;

    public ExemplarEmprestimo() {
        this.id = ++lastId;
        System.out.println("ID: " + this.id);
    }

    public int getId() {
        return id;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }
}

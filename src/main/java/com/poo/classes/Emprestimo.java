package com.poo.classes;
import java.time.LocalDate;

public class Emprestimo {
    private static int lastId = 0;

    int id;
    LocalDate dataEmprestimo = LocalDate.now();
    LocalDate dataPrevistaDevolucao = LocalDate.now().plusDays(30);
    Pessoa pessoa;

    public Emprestimo() {
        this.id = ++lastId;
        System.out.println("ID: " + this.id);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}

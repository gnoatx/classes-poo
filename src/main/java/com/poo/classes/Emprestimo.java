package com.poo.classes;
import java.time.LocalDate;

public class Emprestimo {
    private static int lastId = 0;

    int id;
    LocalDate dataEmprestimo = LocalDate.now();
    LocalDate dataPrevistaDevolucao = LocalDate.now().plusDays(30);
    Pessoa pessoa;

    public Emprestimo(Pessoa pessoa, LocalDate dataEmprestimo) {
        this.id = ++lastId;
        this.dataEmprestimo = dataEmprestimo;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
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

package com.poo.classes;
import java.time.LocalDate;

public class Devolucao {
    private static int lastId = 0;

    int id;
    LocalDate dataDevolucao = LocalDate.now();

    public Devolucao(LocalDate dataDevolucao) {
        this.id = ++lastId;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}

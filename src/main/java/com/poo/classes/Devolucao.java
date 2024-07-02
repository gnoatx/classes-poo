package com.poo.classes;
import java.time.LocalDate;

public class Devolucao {
    private static int lastId = 0;

    int id;
    LocalDate dataDevolucao = LocalDate.now();

    public Devolucao() {
        this.id = ++lastId;
        System.out.println("ID: " + this.id);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}

package com.poo.classes;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private static int lastId = 0;

    private int id;

    public Cliente(String nome, String cpf, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }
}

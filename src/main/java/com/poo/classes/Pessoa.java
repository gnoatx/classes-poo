package com.poo.classes;

public class Pessoa {
    private static int lastId = 0;

    private int id;
    private String rg;
    private String cpf;
    private String nome;
    private Endereco endereco;

    public Pessoa() {
        this.id = ++lastId;
        System.out.println("ID: " + this.id);
    }

    public int getId() {
        return id;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        if (isCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public boolean isCpf(String cpf) {
        if (cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

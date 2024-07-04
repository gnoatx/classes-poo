package com.poo.classes;
import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {
    private static int lastId = 0;

    private int id;
    protected String rg;
    protected String cpf;
    protected String nome;
    protected LocalDate dataNascimento;
    protected int idade;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.id = ++lastId;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = Period.between(dataNascimento, LocalDate.now()).getYears();
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

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        return idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

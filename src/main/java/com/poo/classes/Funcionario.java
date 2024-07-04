package com.poo.classes;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private static int lastId = 0;

    private int id;
    private String ctps;
    private String fgts;
    private String inss;
    private String login;
    private String senha;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, String ctps, String fgts, String inss)  {
        super(cpf, nome, dataNascimento);
        this.id = ++lastId;
        this.ctps = ctps;
        this.fgts = fgts;
        this.inss = inss;
    }

    public int getId() {
        return id;
    }

    public String getCtps() {
        return ctps;
    }

    public void setFgts(String fgts) {
        this.fgts = fgts;
    }

    public String getFgts() {
        return fgts;
    }

    public void setInss(String inss) {
        this.inss = inss;
    }

    public String getInss() {
        return inss;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
}

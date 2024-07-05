package com.poo.classes;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private static int lastId = 0;
    private static double salarioMinimo = 1412.00;
    private static double fgts = 0.08;

    private int id;
    private String ctps;
    private double salarioBase;
    private String login;
    private String senha;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, String ctps, double salarioBase)  {
        super(cpf, nome, dataNascimento);
        this.id = ++lastId;
        this.ctps = ctps;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public String getCtps() {
        return ctps;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
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

    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public double calculaFgts() {
        return salarioBase * fgts;
    }

    public double calculaInss() {
        double aliquota;

        if (salarioBase <= salarioMinimo) {
            aliquota = 0.075;
        } else if (salarioBase <= 2666.68) {
            aliquota = 0.09;
        } else if (salarioBase <= 4000.03) {
            aliquota = 0.12;
        } else if (salarioBase <= 7786.02) {
            aliquota = 0.14;
        } else if (salarioBase <= 13333.48) {
            aliquota = 0.145;
        } else if (salarioBase <= 26666.94) {
            aliquota = 0.165;
        } else if (salarioBase <= 52000.54) {
            aliquota = 0.19;
        } else {
            aliquota = 0.22;
        }

        return salarioBase * aliquota;
    }
}

package com.poo.classes;
import java.time.LocalDate;

public class Emprestimo {
    int id;
    LocalDate dataEmprestimo = LocalDate.now();
    LocalDate dataPrevistaDevolucao = LocalDate.now().plusDays(30);
    Pessoa pessoa;
}

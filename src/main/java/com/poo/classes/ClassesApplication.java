package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
		limpa();

		// Livro livro1 = new Livro();
		// Endereco enderecoMaria = new Endereco();
		// Pessoa maria = new Pessoa();
	}

    void menu() {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("===== Menu =====");
        System.out.println("1. Login");
        System.out.println("");
    }

	static void limpa() {
		try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if(System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}

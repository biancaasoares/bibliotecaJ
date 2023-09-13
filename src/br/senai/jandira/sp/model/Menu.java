package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    Usuario usuario = new Usuario();
    Biblioteca biblioteca = new Biblioteca();

    boolean continuar = true;

    public void menu() {

        while (continuar) {

            System.out.println("------- Bem Vindo á biblioteca ----------");
            System.out.println("  Escolha uma das opções:   ");
            System.out.println("1 - Se cadastre ");
            System.out.println("2 - Cadastrar Livros ");
            System.out.println("3 - Consultar Livros ");
            System.out.println("4 - Sair ");
            System.out.println("------------------------------------------");

            int userOption = teclado.nextInt();

            Livro livro = new Livro();

            switch (userOption) {
                case 1:
                    usuario.CadastroUsuario();
                    break;

                case 2:
                    livro.CadastroLivro();
                    biblioteca.adicionarLivro(livro);
                    break;

                case 3:
                    biblioteca.ConsultarLivro();
                    break;

                case 4:
                    System.out.println("   saindo do programa...  ");
                    continuar = false;
                    break;
            }
        }
    }


}
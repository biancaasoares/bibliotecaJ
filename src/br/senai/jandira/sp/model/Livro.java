package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Livro {

    Scanner teclado = new Scanner(System.in);
    public String titulo;
    public String autor;
    public int ISBN;
    public String genero;

    public void CadastroLivro (){
        System.out.println("------------ Cadastro do livro ---------------");
        System.out.println(" Insira o nome do livro que deseja cadastrar: ");
        titulo = teclado.nextLine();
        System.out.println(" Insira o autor do livro: ");
        autor = teclado.nextLine();
        System.out.println(" Insira o gênero do livro: ");
        genero = teclado.nextLine();
        System.out.println(" Insira o ISBN do livro: ");
        ISBN = teclado.nextInt();
        teclado.nextLine();
    }
}

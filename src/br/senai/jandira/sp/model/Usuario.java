package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Usuario {

    Scanner teclado = new Scanner(System.in);
    public String nome;
    public String endereco;
    public int contato;


  public void CadastroUsuario() {
      System.out.println("--------------- Cadastro do Usuário -------------");
      System.out.println(" Insira o seu nome: ");
      nome = teclado.nextLine();
      System.out.println(" Insira seu e-mail: ");
      endereco = teclado.nextLine();
      System.out.println(" Insira seu contato: ");
      contato = teclado.nextInt();


  }

}

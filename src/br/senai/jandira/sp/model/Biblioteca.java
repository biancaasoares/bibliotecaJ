package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    List<Livro> listLivros = new ArrayList<>();


    public void adicionarLivro (Livro livro){
        listLivros.add(livro);
        System.out.println("Livro adicionado com sucesso!!");
    }

    public void ConsultarLivro(){
        System.out.println(" Estes são os livros da sua lista:" );
        for(Livro livro : listLivros){
            System.out.println(livro.titulo);
        }


    }

}



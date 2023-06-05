package Aula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class UsoDeListas 
{
	public static void main(String[] args) {
	       
        String livro1 = "Java – Como Programar";
        String livro2 = "Desbravando Java e Orientação a Objetos";
        String livro3 = "Estrutura de Dados e Algoritmos";

        List<String> livros = new ArrayList<>();
       
   //Adicionar elementos em uma List:
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
//      livros.add("f");
//      livros.add("a");
        System.out.println("Lista: ");
        System.out.println(livros);
        System.out.println("**********************************************************************************");
       
//      System.out.println("Digite o tamanho da lista de nomes: ");
//      

      
        //Remover elementos da List:
        //livros.remove(0);

        //Acessando elementos da lista:
        //String primeiroLivro = livros.get(0);
        //System.out.println(primeiroLivro);
       
        //System.out.println(livros.get(3));
       
        //Percorrendo uma lista:
       
//      for (int i = 0; i < livros.size(); i++) {  
//          System.out.println(livros.get(i));
//      }
       
//      for(String meusLivros : livros) {  
//          System.out.println(meusLivros);
//      }
       
        //Ordenando a lista:
        //Collections.sort(livros);
       
//      System.out.println("\nLista ordenada: ");
//      for (int i = 0; i < livros.size(); i++) {  
//          System.out.println(livros.get(i));
//      }
        //System.out.println(livros);
        
       
       
    }
}
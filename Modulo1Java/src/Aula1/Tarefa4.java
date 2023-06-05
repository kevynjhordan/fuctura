package Aula1;
import java.util.Scanner;

public class Tarefa4 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("digite o seu nome: ");
		String nome = scanner.nextLine();
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("digite um valor: ");
		String valor1 = scanner2.nextLine();
		
		double valor1convertido = Double.parseDouble(valor1);
		
		Scanner scanner3 = new Scanner(System.in);
		
		System.out.println("digite outro valor: ");
		String valor2 = scanner3.nextLine();
		
		double valor2convertido = Double.parseDouble(valor2);
		
		System.out.println("nome: "+ nome);
		System.out.println("adição: " + (valor1convertido + valor2convertido));
		System.out.println("subtração: " + (valor1convertido - valor2convertido));
		System.out.println("multiplicação: " + (valor1convertido * valor2convertido));
		System.out.println("divisão: " + (valor1convertido / valor2convertido));

		scanner.close();
		scanner2.close();
		scanner3.close();
	}

}
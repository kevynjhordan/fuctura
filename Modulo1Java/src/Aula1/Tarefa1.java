package Aula1;
import java.util.Scanner;

public class Tarefa1 
{

	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("digite o seu nome: ");
		String nome = scanner.nextLine();
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("digite o seu sobrenome:");
		String sobrenome = scanner2.nextLine();
		
		System.out.println("nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		
		scanner.close();
		scanner2.close();
	}

}
package Aula1;
import java.util.Scanner;

public class Tarefa2 
{

	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		String numero = scanner.nextLine();
		
		int numeroconvertido = Integer.parseInt(numero);
		
		int sucessor = numeroconvertido + 1;
		int antecessor = numeroconvertido - 1;
		
		System.out.println("sucessor: " + sucessor);
		System.out.println("antecessor: " + antecessor);
		
		scanner.close();
	}
}
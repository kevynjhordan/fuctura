package Aula2;
import java.util.Scanner;

public class Tarefa1 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o número: ");
		String numero = scanner.nextLine();

		int numeroconvertido = Integer.parseInt(numero);
		
		if (numeroconvertido % 2 == 0) 
		{
		
			System.out.println("Número par");
		}
		
		else
		{
			System.out.println("Número ímpar");
		}
		
		scanner.close();
	}

}
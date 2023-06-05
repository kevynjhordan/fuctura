package Aula2;
import java.util.Scanner;

public class Tarefa2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String numero = scanner.nextLine();
		
		int numeroconvertido = Integer.parseInt(numero);
		
		if(numeroconvertido % 5 == 0)
		{
			System.out.println("o numero " + numeroconvertido + " é múltiplo de 5");
		}
		
		else
		{
			System.out.println("o numero " + numeroconvertido + " não é múltiplo de 5");
		}
		
		scanner.close();
	}

}
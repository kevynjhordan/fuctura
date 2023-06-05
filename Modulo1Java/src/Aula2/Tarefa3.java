package Aula2;
import java.util.Scanner;

public class Tarefa3
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String numero = scanner.nextLine();
		
		int numeroconvertido = Integer.parseInt(numero);
		
		if(numeroconvertido > 0)
		{
			System.out.println("o número" + numeroconvertido + " é positivo");
		}
		
		else if (numeroconvertido == 0)
		{
			System.out.println("o número " + numeroconvertido + " não é negativo nem positivo");
		} 
		
		else
			
		{
			System.out.println("o número " + numeroconvertido + " é negativo");
		}
		
		scanner.close();
	}

}
package Aula2;
import java.util.Scanner;

public class Tarefa4 
{

	public static void main(String[] args) 
	{
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		String valor1 = scanner1.nextLine();
		
		int valor1convertido = Integer.parseInt(valor1);
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Digite outro valor: ");
		String valor2 = scanner2.nextLine();
		
		int valor2convertido = Integer.parseInt(valor2);
		
		if(valor1convertido > valor2convertido)
		{
			System.out.println(valor1convertido);
		}
		
		else
		{
			System.out.println(valor2convertido);
		}
			
		scanner1.close();
		scanner2.close();
	}

}
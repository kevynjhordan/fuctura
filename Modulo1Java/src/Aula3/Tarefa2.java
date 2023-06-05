package Aula3;
import java.util.Scanner;

public class Tarefa2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite M para homem ou F para mulher: ");
		String genero = scanner.next();
		
		if (genero.equalsIgnoreCase("M"))
			
		{
			System.out.println("Seja  bem-vindo,  Senhor!");
		}
		
		else if (genero.equalsIgnoreCase("F"))
			
		{
			System.out.println("Seja bem-vinda, Senhora!");
		}
			
		scanner.close();
	}

}

package Aula1;
import java.util.Scanner;

public class Tarefa3 
{

	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("quantos dólares: ");
		String dolares= scanner.nextLine();
		
		double numeroconvertido = Double.parseDouble(dolares);
		double reais = numeroconvertido *4.99;
		
		System.out.println(reais);
		
		scanner.close();
	}

}
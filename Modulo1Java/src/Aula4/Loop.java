package Aula4;
import java.util.Scanner;

public class Loop 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int dia;
		
		do
		{
			
			System.out.println("digite um número de 1 a 7: ");
			dia = scanner.nextInt();
			
		switch (dia)
			{
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("sexta-feira");
			break;
		case 7:
			System.out.println("sábado");
			break;
		default:
			System.out.println("número inválido");
			}
		}
		
		while (dia > 7 || dia < 1);
		
		scanner.close();
	}
}
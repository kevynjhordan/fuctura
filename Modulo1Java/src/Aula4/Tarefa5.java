package Aula4;
import java.util.Scanner;
public class Tarefa5 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um número para exibir a sua tabuada: ");
		int num = entrada.nextInt();
		
		for (int contador = 1; contador <= 10 ; contador ++)
		{
			int multiplicaçao = num * contador;
			System.out.printf("%d x %d = %d %n", num, contador, multiplicaçao);
		}
		
		entrada.close();
	}

}
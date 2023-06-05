package Aula5;
import java.util.Scanner;

public class Tarefa1 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		int vetor [] = new int [10];
		//int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int contagem = 0;
				
		while (contagem < vetor.length)
			
		{
			System.out.println("digite um valor: ");
			vetor [contagem] = entrada.nextInt();
			
			contagem ++;
		}
		
		contagem = 0;
		
		while (contagem <= 9)
			
		{
			System.out.print(vetor[contagem] + " ");
			contagem ++;
		}
		
		entrada.close();
	}
}
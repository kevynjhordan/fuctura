package Aula5;
import java.util.Scanner;

public class Tarefa4alternativa 
{	
	public static void main(String argrs[])
	{
		Scanner entrada = new Scanner(System.in);
		
		int vetor [] = new int [10];
	
		for (int contagem = 0; contagem < vetor.length; contagem ++)
			
		{
			System.out.print("Digite o valor do índice " + contagem + ": ");
			vetor[contagem] = entrada.nextInt();
		}
		
		int maior = vetor[0];
		int menor = vetor[0];
		
		for (int contagem = 0; contagem <= 9; contagem ++)
			
		{
			if (menor > vetor[contagem])
			{
				menor = vetor[contagem];
			}
		}
		
		for(int contagem = 0; contagem < vetor.length; contagem++)
		{
		
			if (maior < vetor[contagem])
			{
				maior = vetor[contagem];
			}
		}
		
		System.out.println("este é o maior valor: " + maior + "\neste é o menor valor: " + menor);
		
		entrada.close();
	}
}
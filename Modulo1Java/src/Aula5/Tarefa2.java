package Aula5;
import java.util.Scanner;
public class Tarefa2 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe quantos valores pretende usar: ");
		
		int contagem = 0;
		
		int tamanho = entrada.nextInt();
		
		int vetor [] = new int [tamanho];
		
		int soma = 0;
		
		while (contagem <= (tamanho - 1))
		
		{
			System.out.println("informe um valor: ");
			vetor[contagem] = entrada.nextInt();
	
			contagem ++;
		}
		
		contagem = 0;
		
				
		while (contagem < vetor.length)
			
		{
			soma += vetor [contagem];
			
			contagem ++;
		}
		
		System.out.println("a soma dos valores é: " + soma);
		
		entrada.close();
	}
}
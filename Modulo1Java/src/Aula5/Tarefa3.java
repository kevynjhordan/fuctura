package Aula5;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		int [] vetor = new int [10];
		
		int contagem = 0;
		
		while (contagem < vetor.length)
		
		{
			System.out.println("informe um valor: ");
			vetor[contagem] = entrada.nextInt();
			
			contagem ++;
		}
		
		contagem = 0;
		
		while (contagem <= 9)
			
		{
			System.out.print(vetor[contagem] + " ");
			
			contagem++;
		}
		
		contagem = 9;
		
		while(contagem >= 0)
			
		{
			System.out.print(vetor[contagem] + " ");
			
			contagem --;
		}
		
		entrada.close();
	}
}
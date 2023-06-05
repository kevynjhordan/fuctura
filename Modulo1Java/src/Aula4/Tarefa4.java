package Aula4;
import java.util.Scanner;

public class Tarefa4
{

	public static void main(String[] args) 
	{
		int numero = 0;
		int pares = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		for (int contador = 1; contador <= 10; contador ++)
		{
			System.out.printf("digite o %dº número: ", contador);
			numero = entrada.nextInt();
			
			if (numero % 2 == 0)
				
			{
				pares ++;
			}
			
			else
				
			{
				continue;
			}
		}
		
		System.out.printf("%d são pares", pares);
		
		entrada.close();
	}
}
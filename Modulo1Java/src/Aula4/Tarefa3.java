package Aula4;
import java.util.Scanner;

public class Tarefa3

{

public static void main(String[] args)

	{

	int N = 0;

	int soma = 0;
	
	Scanner entrada = new Scanner(System.in);

	for (int contador = 1; N >= 0; contador++)
	 
		{
		
			System.out.printf("Digite o %dº valor: ", contador);
			N = entrada.nextInt();

			if (N != 0)
			
			{
				soma = soma + N;
			}

			else
				
			{
				break;
			}
		}

		System.out.printf("A soma dos valores digitados é: %d", soma);

		entrada.close();

	}
}
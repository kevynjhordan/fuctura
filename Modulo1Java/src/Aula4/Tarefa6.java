package Aula4;
import java.util.Scanner;

public class Tarefa6 
{

	public static void main(String[] args) 
	{
		int idade = 0;
		int media = 0;
		int maioridade = 0;
		int menoridade = 0;
		int maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int contador = 1 ;contador <= 10; contador ++)
			
		{
			System.out.printf("Digite a %dº idade: ", contador);
			idade = entrada.nextInt();
			
			if (idade >= 18)
			{
				maioridade = maioridade + 1;
				media = (media + idade);
				
				if (idade > maior)
				{
					maior = idade;
				}
				else
				{
					continue;
				}
			}
			else
			{
				menoridade = menoridade + 1;
				media = (media + idade);	
				
				if (idade > maior)
				{
					maior = idade;
				}
				else
				{
					continue;
				}
			}
		}
		
		media = media / 10;
		
		System.out.printf("a média de idades é: %d %n %d pessoas são maiores de idade."
				+ " %n %d pessoas são menores de idade. %n %d foi a maior idade registrada",
				media, maioridade, menoridade, maior);
		
		entrada.close();
	}
}
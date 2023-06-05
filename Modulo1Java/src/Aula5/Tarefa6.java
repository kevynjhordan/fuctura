package Aula5;

import java.util.Scanner;

public class Tarefa6 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		double [] notas = new double [4];
		double nota = 0;
		
		for (int contagem = 0; contagem < notas.length; contagem ++)
		
		{
			System.out.println("Informe a nota: ");
			notas[contagem] = entrada.nextDouble();
			nota += notas[contagem];
		}
		
		double media = nota / 4;
		
		if (media >= 7 && media <= 10)
		
		{
			System.out.println("com a media " + media + " o aluno está aprovado!");
		}
		
		else if (media > 3 && media < 6.9)
			
		{
			System.out.println("com a média " + media +" o aluno está em recuperação");
		}
		
		else if (media < 3)
			
		{
			System.out.println("com a média " + media + " o aluno está reprovado");		
		}
		
		else
			
		{
			System.out.println("informe notas válidas");
		}
		
		entrada.close();
	}
}
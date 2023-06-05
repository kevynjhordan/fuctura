package Aula2;
import java.util.Scanner;

public class Tarefa8 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner triangulo = new Scanner(System.in);
		
		System.out.println("digite o valor de um dos lados do triângulo: ");
		double valor1 = triangulo.nextDouble();
		
		
		System.out.println("novamente digite o valor de um dos lados do triângulo: ");
		double valor2= triangulo.nextDouble();
		
		System.out.println("finalmente digite o valor de um dos lados do triângulo: ");
		double valor3= triangulo.nextDouble();
		
		if (valor1 == valor2 && valor1 == valor3)
		{
			System.out.println("se trata de um triângulo equilátero");
		}
		else if (valor1 == valor2 && valor1 != valor3 || valor1 == valor3 && valor1 != valor2 || valor2 == valor3 && valor2 != valor1)
		{
			System.out.println("se trata de um triângulo isósceles");
		}
		else
		{
			System.out.println("se trata de um triângulo escaleno");
		}
	}

}
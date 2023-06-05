package Aula2;
import java.util.Scanner;

public class Tarefa7 
{

	public static void main(String[] args) 
	{
		Scanner triangulo = new Scanner(System.in);
		
		System.out.println("digite a base do triângulo: ");
		int base = triangulo.nextInt();
		
		System.out.println("digite a altura do triângulo: ");
		int altura = triangulo.nextInt();
		
		System.out.println("a área do triângulo é: " + base * altura / 2);
		
		triangulo.close();
	}

}
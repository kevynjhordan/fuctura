package Aula1;
import java.util.Scanner;

public class Tarefa5 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o valor do salário: ");
		String salario = scanner.nextLine();
		
		double salarioconvertido = Double.parseDouble(salario);
		double porcentagem = (10*salarioconvertido)/ 100;
		
		System.out.println("Salário com acréscimo de 10%: " + (salarioconvertido + porcentagem));
		scanner.close();
	}

}
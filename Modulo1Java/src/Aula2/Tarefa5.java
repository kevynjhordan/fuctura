package Aula2;
import java.util.Scanner;

public class Tarefa5 
{

	public static void main(String[] args) 
	{
		Scanner scanneraluno = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		String aluno = scanneraluno.nextLine();
		
		System.out.println("primeira nota: ");
		int nota1 = scanneraluno.nextInt();
		
		System.out.println("segunda nota: ");
		int nota2 = scanneraluno.nextInt();
		
		if((nota1 + nota2) /2 >= 7)
		{
			System.out.printf("o aluno %s foi aprovado", aluno);
		}
		
		else
		{
			System.out.printf("o aluno %s foi reprovado ", aluno);
		}
		
		scanneraluno.close();
	}

}
package Aula3;
import java.util.Scanner;

public class Tarefa4 
{

	public static void main(String[] args) 
	{

Scanner scanneraluno = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		String aluno = scanneraluno.nextLine();
		
		System.out.println("primeira nota: ");
		double nota1 = scanneraluno.nextInt();
		
		System.out.println("segunda nota: ");
		double nota2 = scanneraluno.nextInt();
		
		if((nota1 + nota2) /2 >= 7 && (nota1 + nota2) /2 <= 10)
		{
			System.out.printf("o aluno %s foi aprovado", aluno);
		}
		
		else if ((nota1 + nota2) /2 >= 3 && (nota1 + nota2) /2 <=6.9)
			
		{
			System.out.printf("o aluno %s está em recuperação", aluno);
		}
		
		else if ((nota1 + nota2) /2 < 3)
			
		{
			System.out.printf("o aluno %s foi reprovado ", aluno);
		}
		
		else
		{
			System.out.println("Digite uma nota válida");
		}
		scanneraluno.close();
	}
}
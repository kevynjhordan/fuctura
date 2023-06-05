package Aula3;
import java.util.Scanner;

public class Tarefa3
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite segundo valor: ");
		int y = scanner.nextInt();
		
		System.out.println("Digite um terceiro valor: ");
		int z = scanner.nextInt();
		
		if (z > x && z < y)
		
		{
			System.out.printf("%d está no intervalo entre %d e %d", z, x, y);
		}
		
		else
			
		{
			System.out.printf("%d não está no intervalo entre %d e %d", z, x, y);
		}
		
		scanner.close();
	}

}
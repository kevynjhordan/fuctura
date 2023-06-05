package Aula3;
import java.util.Scanner;

public class Tarefa1 

{

	public static void main(String[] args) 

	{

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite graus celsius: ");
		int celsius = scanner.nextInt();
		
		int fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.printf("%d graus celsius são %d graus fahrenheit" , celsius, fahrenheit);
		
		scanner.close();
	}

}
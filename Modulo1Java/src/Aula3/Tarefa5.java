package Aula3;
import java.util.Scanner;

public class Tarefa5 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um número para exibir a sua tabuada: ");
		int numero = scanner.nextInt();
		int multiplicadopor1 = numero * 1;
		int multiplicadopor2 = numero * 2;
		int multiplicadopor3 = numero * 3;
		int multiplicadopor4 = numero * 4;
		int multiplicadopor5 = numero * 5;
		int multiplicadopor6 = numero * 6;
		int multiplicadopor7 = numero * 7;
		int multiplicadopor8 = numero * 8;
		int multiplicadopor9 = numero * 9;
		int multiplicadopor10 = numero * 10;
		
		System.out.printf("a tabuada de %d é: %n %d x 1 = %d %n %d x 2 = %d %n %d x 3 = %d "
				+ "%n %d x 4 = %d %n %d x 5 = %d %n %d x 6 = %d %n %d x 7 = %d %n %d x 8 = %d "
				+ "%n %d x 9 = %d %n %d x 10 = %d %n "
				,numero, numero, multiplicadopor1, numero, multiplicadopor2, numero,
				multiplicadopor3, numero, multiplicadopor4, numero, multiplicadopor5, numero,
				multiplicadopor6, numero, multiplicadopor7, numero, multiplicadopor8, numero,
				multiplicadopor9, numero, multiplicadopor10);
		
		scanner.close();
	}

}
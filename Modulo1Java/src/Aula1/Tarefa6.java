package Aula1;
import java.util.Scanner;
public class Tarefa6 
{

	public static void main(String[] args) 
	{
		Scanner scannera = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		String A = scannera.nextLine();
		
		int aconvertido = Integer.parseInt(A);
		
		Scanner scannerb = new Scanner(System.in);
		
		System.out.println("Digite o valor de B: ");
		String B = scannerb.nextLine();
		
		int bconvertido = Integer.parseInt(B);
		
		aconvertido = aconvertido ^ bconvertido ^ (bconvertido = aconvertido);
		
		System.out.println("Valor de A: " + aconvertido);
		System.out.println("Valor de B: " + bconvertido);
		
		scannera.close();
		scannerb.close();
	}

}
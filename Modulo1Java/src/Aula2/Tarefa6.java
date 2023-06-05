package Aula2;
import java.util.Scanner;

public class Tarefa6 
{

	public static void main(String[] args) 
	{
		Scanner scannercliente = new Scanner (System.in);
		
		System.out.println("nome do cliente: ");
		@SuppressWarnings("unused")
		String cliente = scannercliente.nextLine();
		
		System.out.print("gênero: ");
		String genero = scannercliente.nextLine();
		
		System.out.print("preço da compra: ");
		double preço = scannercliente.nextDouble();
		double descontohomem = (8*preço)/100;
		double descontomulher = (15*preço)/100;
		
		if (genero.equals("homem")) //equalsIgnoreCase("homem")
		{
			System.out.println(preço - descontohomem);
		}
		
		else if (genero.equals("mulher")) //equalsIgnoreCase("mulher")
		{
			System.out.println(preço - descontomulher);
		}
		
		scannercliente.close();
	}

}
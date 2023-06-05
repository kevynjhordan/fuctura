package Aula4;

public class Tarefa7 
{

	public static void main(String[] args) 
	{
		int contagem = 105;
		for (@SuppressWarnings("unused")
		int contador = 0; contagem > 0; contador ++)
		{
			contagem = contagem - 5;
			System.out.println(contagem);
		}
		
		System.out.println("fim do programa!");
	}

}
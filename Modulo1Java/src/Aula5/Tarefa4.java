package Aula5;

public class Tarefa4 {

	public static void main(String[] args) 
	{
		int [] vetor = new int [5];
		
		vetor [0] = 420;
		vetor [1] = 250;
		vetor [2] = 90;
		vetor [3] = 180;
		vetor [4] = 360;
		
		int menor = 421;
		int maior = 0;
		
		int contagem = 0;
		
		while (contagem < vetor.length)
		
		{
			if (maior < vetor[contagem])
			{
				maior = vetor[contagem];
			}

			contagem ++;
		}
		
		contagem = 0;
			
		while (contagem <= 4)
		
		{
			if (menor > vetor[contagem])
				
			{
				menor = vetor[contagem];
			}
				
			contagem++;
		}
		
		 System.out.println("este é o maior valor: " + maior + "\neste é o menor valor: " + menor);
	}
}
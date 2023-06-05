package Aula5;

public class Tarefa5 
{

	public static void main(String[] args) 
	{
		int [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] vetor2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int [] vetor3 = {vetor1[0] + vetor2[0], vetor1[1] + vetor2[1], vetor1[2] + vetor2[2],
				vetor1[3] + vetor2[3], vetor1[4] + vetor2[4], vetor1[5] + vetor2[5],
				vetor1[6] + vetor2[6], vetor1[7] + vetor2[7], vetor1[8] + vetor2[8],
				vetor1[9] + vetor2[9]};
		
		for (int contagem = 0; contagem < vetor3.length; contagem ++)
		{
			System.out.print(vetor3[contagem] + " ");
		}
	}
}
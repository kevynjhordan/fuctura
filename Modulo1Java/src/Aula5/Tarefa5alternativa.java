package Aula5;

public class Tarefa5alternativa 
{
	public static void main(String argrs[])
	{
		int [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] vetor2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] vetor3 = new int[10];
		
		for (int contagem = 0; contagem < vetor3.length; contagem++)
		{
			vetor3[contagem] = vetor1[contagem] + vetor2[contagem];
			System.out.printf("vetor3[%d] = %d%n",contagem, vetor3[contagem]);
		}
	}
}

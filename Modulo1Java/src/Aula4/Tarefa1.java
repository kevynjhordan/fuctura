package Aula4;

public class Tarefa1

{

	public static void main(String[] args) 
	{
		for (int i = 1; i <=300; i++)
		{
			if (i % 5 == 0)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}
		
	}

}
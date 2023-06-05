package OO;

public class CalculadoraaTeste 

{
	public static void main(String args[])
	{
		Calculadoraa calc = new Calculadoraa();
		
		double soma = calc.somar(10, 50);
		double subtracao = calc.subtrair(50, 50);
		double multiplicacao = calc.multiplicar(100,3);
		double divisao = calc.dividir(80, 40);
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}
}
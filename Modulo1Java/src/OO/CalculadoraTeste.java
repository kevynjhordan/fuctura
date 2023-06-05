package OO;

public class CalculadoraTeste 
{
	public static void main(String argrs[])
	{
		Calculadora calc = new Calculadora();
		calc.setNumero1(100);
		calc.setNumero2(50);
		
		System.out.println(calc.somar());
		
		System.out.println(calc.subtrair());
		
		System.out.println(calc.multiplicar());
		
		System.out.println(calc.dividir());
	}
}
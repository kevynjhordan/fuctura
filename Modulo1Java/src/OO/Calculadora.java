package OO;

public class Calculadora 
{
	double numero1;
	double numero2;
	
	double somar()
	{
		return this.numero1 + this.numero2;
	}
	
	double subtrair()
	{
		return this.numero1 - this.numero2;
	}
	
	double multiplicar()
	{
		return this.numero1 * this.numero2;
	}
	
	double dividir()
	{ 
		return this.numero1 / this.numero2;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
}
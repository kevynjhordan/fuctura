package OO;

public class Motosserra
{	
	private String modelo;
	private double peso;
	private double tamanho;
	private double potencia;
	private double cilindrada;
	private double nivelSonoro;
	private double potenciaSonora;
	
	Motosserra(String modelo,double peso, double tamanho, double potencia, double cilindrada, double nivelSonoro, double potenciaSonora)
	{
		this.modelo = modelo;
		this.peso = peso;
		this.tamanho = tamanho;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		this.nivelSonoro = nivelSonoro;
		this.potenciaSonora = potenciaSonora;
	}
	
	void ligar(String barulho)
	{
		int i = 0;
		do{
			System.out.print("RENDENDENDENDENDEN");
			System.out.println("RENDENDENDENDENDEN");
			i++;
		}
		while (i < 50);
	}

	public String getModelo() {
		return modelo;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getTamanho() {
		return tamanho;
	}

	public double getPotencia() {
		return potencia;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public double getNivelSonoro() {
		return nivelSonoro;
	}

	public double getPotenciaSonora() {
		return potenciaSonora;
	}
}
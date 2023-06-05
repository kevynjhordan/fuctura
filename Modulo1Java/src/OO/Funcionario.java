package OO;

public class Funcionario 
{
	private String nome;
	private int matricula;
	private double salario;
	
	Funcionario(String nome, int matricula, double salario)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	double AumentarSalario()
	{
		return this.salario += ((salario * 15) / 100 );
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getSalario() {
		return salario;
	}
}
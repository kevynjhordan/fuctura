package FucturaBank;

public abstract class CONTAS 

{
	private int numeroDaConta;
	private String nomeDoTitular;
	protected double saldoDisponivel;
	
	void mostrarDadosCadastrais()
	
	{
		System.out.println("Nome do titular: " + getNomeDoTitular());
		System.out.println("Numero da conta: " + getNumeroDaConta());
	}
	
	abstract void fazerDeposito(double valorDoDeposito);
	
	void mostrarSaldos(CONTA_CORRENTE contaCorrente, CONTA_POUPANCA contaPoupanca)
	{
		System.out.println("Saldo em conta corrente: " + contaCorrente.getSaldoDisponivel());
		System.out.println("Saldo em conta poupança: " + contaPoupanca.getSaldoDisponivel());
	}
	
	
	public int getNumeroDaConta() 
	{
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) 
	{
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoTitular() 
	{
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) 
	{
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getSaldoDisponivel()
	{
		return saldoDisponivel;
	}

	abstract void mostrarSaldo();
}
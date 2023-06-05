package FucturaBank;

public class CONTA_POUPANCA extends CONTAS
{
	@Override
	void fazerDeposito(double valorDoDeposito) 
	{
		
	}
	
	@Override
	void mostrarSaldo()
	{
		System.out.println("Seu saldo na poupança é: " + getSaldoDisponivel());
	}
	
	void resgatar(double valorDoResgate, CONTA_CORRENTE contaCorrente)
	{
		if (saldoDisponivel > 0 & saldoDisponivel >= valorDoResgate)
			  
	  	{ 
			saldoDisponivel -= valorDoResgate;
			contaCorrente.saldoDisponivel += valorDoResgate;
			System.out.printf("o resgate no valor de: %f foi realizado%n", valorDoResgate);
	  	}
	  
	  else 
	  
	  	{ 
		  System.out.println("saldo insuficiente");
	  	}
	}

}
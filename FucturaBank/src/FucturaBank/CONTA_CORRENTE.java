package FucturaBank;

public class CONTA_CORRENTE extends CONTAS 
{
	@Override
	void fazerDeposito(double valorDoDeposito)
	{	
		saldoDisponivel += valorDoDeposito;
	    System.out.printf("o deposito no valor de: %f foi realizado%n", valorDoDeposito);
	}
	
	@Override
	void mostrarSaldo()
	{
		System.out.println(getSaldoDisponivel());
	}

	void sacar(double valorDoSaque) 
		{

			if (saldoDisponivel > 0 & saldoDisponivel >= valorDoSaque)
			{	
				saldoDisponivel -= valorDoSaque;
				System.out.printf("o saque no valor de: %f foi realizado%n", valorDoSaque);
			}

			else 
			
			{
				System.out.println("saldo insuficiente");
			}
		
		}

	
		
	void aplicar(double valorDaAplicacao, CONTA_POUPANCA contaPoupanca)
		{
		  
			if (saldoDisponivel > 0 & saldoDisponivel >= valorDaAplicacao)
		  
		  	{ 
				saldoDisponivel -= valorDaAplicacao;
				contaPoupanca.saldoDisponivel += valorDaAplicacao;
				System.out.printf("a aplicação no valor de: %f foi realizada%n", valorDaAplicacao);
		  	}
		  
		  else 
		  
		  	{ 
			  System.out.println("saldo insuficiente");
		  	}
		  
		}
		  
	void iniciarComZero()
		{
			saldoDisponivel = 0;
		}
}
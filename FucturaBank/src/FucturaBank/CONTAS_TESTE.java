package FucturaBank;
import java.util.Scanner;
public class CONTAS_TESTE
{
	public static void main(String argrs[])
	{
		CONTA_POUPANCA cp = new CONTA_POUPANCA();
		CONTA_CORRENTE cc = new CONTA_CORRENTE();
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("iniciando cadastro\n");
		
		System.out.println("informe o seu nome: ");
		String nomeDoTitular = entrada.nextLine();
		cc.setNomeDoTitular(nomeDoTitular);
		cp.setNomeDoTitular(nomeDoTitular);
		
		System.out.println("informe o número da conta: ");
		int numeroDaConta = entrada.nextInt();
		
		cc.setNumeroDaConta(numeroDaConta);
		cp.setNumeroDaConta(numeroDaConta);
		
		entrada.nextLine();
		
		System.out.println("deseja realizar um depósito inicial? tecle e confirme S ou N");
		String resposta = entrada.nextLine();
		
		if (resposta.equalsIgnoreCase("S"))
			{		
				System.out.println("digite o valor do depósito: ");
				cc.fazerDeposito(entrada.nextDouble());
			}
		else
		{
			cc.iniciarComZero();
		}
			
		int opcao;
		
		do
		{
			System.out.println("\nselecione uma das opções:\n\n1 - exibir dados da conta\t\t2-"
					+ " realizar um depósito\t3 - exibir saldo da conta corrente\n4 - exibir "
					+ "saldo da conta poupança\t5 - realizar um saque\t6 - aplicar na conta poupança"
					+ "\n7 - resgatar da conta poupança\t\t0 - sair do menu");
			opcao = entrada.nextInt();
			
		switch (opcao)
			{
		case 1:
			cc.mostrarDadosCadastrais();
			System.out.println("\nvoltando para menu o principal\n");
			break;
		case 2:
			System.out.println("digite o valor do depósito: ");
			cc.fazerDeposito(entrada.nextDouble());
			System.out.println("\nvoltando para menu o principal\n");
			break;
		case 3:
			cc.mostrarSaldo();
			System.out.println("\nvoltando para menu o principal\n");
			break;
		case 4:
			cp.mostrarSaldo();
			System.out.println("\nvoltando para menu o principal\n");
			break;
		case 5:
			System.out.println("digite o valor do saque: ");
			cc.sacar(entrada.nextDouble());
			System.out.println("\nvoltando para menu o principal\n");
			break;
		case 6:
			System.out.println("digite o valor da aplicação: ");
			cc.aplicar(entrada.nextDouble(), cp);
			System.out.println("\nvoltando para menu o principal\n");
			break;
		case 7:
			System.out.println("digite o valor do resgate: ");
			cp.resgatar(entrada.nextDouble(), cc);
			System.out.println("\nvoltando para menu o principal\n");
			break;
		default:
			
			}
		
		} 
		
		while (opcao != 0);
		
		entrada.close();
	}
}
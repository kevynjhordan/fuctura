package OO;

public class PessoaTeste 
{
	
	public static void main(String argrs[])
	{
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Pedro");
		p1.setIdade(42);
		p1.setProfissao("Motorista");
		
		p2.setNome("Roberto");
		p2.setIdade(32);
		p2.setProfissao("Eletricista");
		
		p1.apresentar();
		p2.apresentar();
	}
}
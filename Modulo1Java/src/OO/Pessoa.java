package OO;

public class Pessoa 
{
	private String nome;
	private int idade;
	private String profissao;
	
	public String getNome()
	
	{
		return nome;
	}
	public void setNome(String nome)
	
	{
		this.nome = nome;
	}
	
	public int getIdade()
	
	{
		return idade;
	}
	public void setIdade(int idade)
	
	{
		this.idade = idade;
	}
	
	public String getProfissao()
	
	{
		return profissao;
	}
	public void setProfissao(String profissao)
	
	{
		this.profissao = profissao;
	}
	
	void apresentar()
	
	{
		System.out.printf("nome: %s%nidade: %d%nprofissão: %s%n", nome, idade, profissao);
	}
}
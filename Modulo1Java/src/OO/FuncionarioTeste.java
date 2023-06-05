package OO;

public class FuncionarioTeste 
{
	
	public static void main(String args[])
	{
		Funcionario fo = new Funcionario("Paulo", 1202, 2200.0);
		
		System.out.println(fo.getNome());
		System.out.println(fo.getMatricula());
		System.out.println(fo.getSalario());
		fo.AumentarSalario();
	}
}
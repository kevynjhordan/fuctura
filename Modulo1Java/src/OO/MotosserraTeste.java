package OO;

public class MotosserraTeste 
{
	public static void main(String args[])
	{
		Motosserra klb799 = new Motosserra("klb799", 9.8, 130.0, 7.0, 130.0, 110.0, 120.0);
		
		System.out.println("modelo: " + klb799.getModelo());
		System.out.println("peso: " + klb799.getPeso() + " kg");
		System.out.println("tamanho: " + klb799.getTamanho() + " cm");
		System.out.println("potência: " + klb799.getPotencia() + " kw");
		System.out.println("cilindrada: " + klb799.getCilindrada() + " cm3");
		System.out.printf("nível sonoro: %f db%n", klb799.getNivelSonoro());
		System.out.printf("potência sonora: %f db%n%n", klb799.getPotenciaSonora());
		
		klb799.ligar("RENDENDENDENDENDEN");
	}
}
package Aula6;

public class TratamentoDeExcecao 
{
	public static void main(String[] args) {
	       
        int a = 15;
        int b = 0;
        int soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;

        @SuppressWarnings("unused")
		int i = 0;
        try {//Tenta executar o que tiver dentro do bloco
            soma = a + b;
            subtracao = a - b;
            multiplicacao = a * b;
            divisao = a / b;

        } catch (Exception e) {//se existir erro será capturado pelo cacth. Dentro do bloco faz o tratamento do erro.
            System.out.println("mensagem:" + e.getMessage());
            System.out.println("divisao por zero, ninguem atingiu a meta");//Se precisar que exista a divisão por zero. Coloque uma mensagem amigável.
         //   b = 1;//pode fazer a alteração do valaor da váriavel para nao da erro de divisão por zero
        //    divisao = a / b;

        }
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

   
  //Exemplo com mais de uma exceção
      
//        int[] vet = new int[]  { 6, 24, 98, 122, 91, 85};
//        int[] vet2 = new int[] { 0,  2,  7,  0,  13 };
//
//        for (i = 0; i < vet.length; i++) {
//            try {
//                System.out.println(vet[i] + "/" + vet2[i] + " = " + vet[i] /vet2[i]);
//
//            } catch (ArithmeticException e) {
//                if (vet2[i] == 0) {
//                    System.out.println("divisao por zero no indice: " + i);
//                     }
//                
//            
//           } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("tamanho do array");
//            System.out.println(e.getMessage());
//            
//        }

           
//        }
    }

}
package av2;

import java.util.Scanner;

public class Q3_MatheusAlves {
	
		  public static void main(String[] args) {
		    Scanner screen = new Scanner(System.in);
		    
		    System.out.println("Digite quantos numeros voce deseja somar");
		    int qtd = screen.nextInt();
		    
		    
		    int soma = 0;
		    int[] valores = new int[qtd];
		    
		    for(int i = 1; i <= qtd; i++) {

		      System.out.println("Digite " + i + "° valor:");
		            int valorLendo = screen.nextInt();
		            soma += valorLendo;
		            

		    }
		    System.out.println("resultado: " + soma);

		    
		  }
}
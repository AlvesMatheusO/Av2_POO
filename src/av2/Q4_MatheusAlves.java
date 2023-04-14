package av2;


import java.util.Scanner;

public class Q4_MatheusAlves {
	public static void main (String [] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Digite o texto:");
		        String texto = scanner.nextLine();
		        String[] palavras = texto.split(" ");
		        int cont = 0;
		        for (String palavra : palavras) {
		            if (palavra.startsWith("s") || palavra.startsWith("S")) {
		                cont++;
		            }
		        }
		        System.out.println("O texto contém " + cont + " palavras que começam com a letra 's'.");
		    }
		
	
}
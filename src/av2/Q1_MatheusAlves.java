package av2;

import java.util.Scanner;

public class Q1_MatheusAlves {
	public static void main (String [] args) {
		Scanner screen = new Scanner(System.in);
		
		System.out.println("Digite o numero 1 para soma");
		int a = screen.nextInt();
		
		System.out.println("Digite o numero 2 para soma");
		int b = screen.nextInt();		
		
		System.out.println("O resultado da soma eh = " + (a+b));
	}
}
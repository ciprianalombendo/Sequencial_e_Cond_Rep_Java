/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		calcule a seguinte expressão: 
		r = (a+b) * (a+b)
		s = (b+c) * (b+c)
		d = (r + s)/2
	*/
package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercicioSequencial04 {

	public static void main(String[] args) {
	
	
	 Scanner leia = new Scanner(System.in);
		int a, b, c, d, r, s;
		

		System.out.println("Escreva A: ");
		a = leia.nextInt();

		System.out.println("Escreva B: ");
		b = leia.nextInt();

		System.out.println("Escreva C: ");
		c = leia.nextInt();
		r = (a+b) * (a+b);
		s = (b+c) * (b+c);
		d = (r + s)/2;

		System.out.println("O resultado da expressão é: " + d);
		

	}
	
}

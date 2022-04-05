//7.Escreva um algoritmo que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y:
package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercicioSequencial07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		  
 		System.out.println("Digite o valor de a: ");
 		a = leia.nextInt();
 		
 		System.out.println("Digite o valor de b: ");
 		b = leia.nextInt();

 		System.out.println("Digite o valor de c: ");
 		c = leia.nextInt();
 
 		System.out.println("Digite o valor de d: ");
 		d = leia.nextInt();
 
 		System.out.println("Digite o valor de e: ");
 		e = leia.nextInt();
 
 		System.out.println("Digite o valor de f: ");
 		f = leia.nextInt();
 
 		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
 
		System.out.println("O valor de x é " + x + " e y é " + y);

	}

}

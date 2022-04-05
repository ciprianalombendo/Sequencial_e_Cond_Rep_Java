/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		respectivamente.
	*/

package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercicioSequencial05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double n1, n2, n3, p1, p2, p3, media;

	   	System.out.println("Programa: Média ponderada. \n\n");
	   	System.out.println("Insira o valor da primeira nota: ");
		n1 = leia.nextDouble();

		System.out.println("Insira o peso da primeira nota: ");
	   	p1 = leia.nextDouble();

	   	System.out.println("Insira o valor da segunda nota: ");
	  	n2 = leia.nextDouble();

	  	System.out.println("Insira o peso da segunda nota: ");
	   	p2 = leia.nextDouble();

	   	System.out.println("Insira o valor da terceira nota: ");
	   	n3 = leia.nextDouble();

	   	System.out.println("Insira o peso da terceira nota: ");
	   	p3 = leia.nextDouble();

	   	media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
	   	System.out.println("A média final é: " + media);

	}

}

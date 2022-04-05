/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
		quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
		que efetua tal cálculo é: d = √(x2-x1)² + (y2-y1)² ----> onde √ é o simbolo que 	reprenseta a raiz quadrada*/

package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercicoSequencial06 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double x1, x2, y1, y2, p1, p2, d;
			

			System.out.println("Digite o valor de x do primeiro ponto:\n"); 
			x1 = ler.nextDouble();

			System.out.println("Digite o valor de y do primeiro ponto:\n");  
			y1 = ler.nextDouble();
			
			System.out.println("Digite o valor de x do segundo ponto:\n");  
			x2 = ler.nextDouble();

			System.out.println("Digite o valor de y do segundo ponto:\n");  
			y2 = ler.nextDouble();

			p1 = Math.pow((x2-x1), 2.0);
			p2 = Math.pow((y2-y1), 2.0);
			d = Math.sqrt(p1 + p2);
			System.out.println("A distância entre eles é: " );
			System.out.printf("%.2f", d);
		}

	}

}

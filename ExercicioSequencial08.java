/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.
	*/
package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercicioSequencial08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de Fábrica: ");
		custoFabrica = leia.nextInt();

		distribuidor = custoFabrica + (custoFabrica*0.28);//custo Fabrica + porcentagem distribuidor
		custoConsumidor = distribuidor + (distribuidor*0.45);//custo distribuidor + impostos

		System.out.println("Custo do consumidor: " + custoConsumidor);
	}

}

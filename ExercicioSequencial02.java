package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercicioSequencial02 {

	public static void main(String[] args) {
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		//expressa em anos, meses e dias.

		Scanner leia = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		
		
		System.out.println("Digite sua idade expressa em dias: \n");
		totalDias = leia.nextInt();
		
		idadeAnos = totalDias/365;

		totalDias = totalDias%365;

		idadeMeses = totalDias/30;

		totalDias = totalDias%30;

		idadeDias = totalDias;
		
		
		System.out.println("Sua idade em anos é: " + idadeAnos  + "anos");
		System.out.println("\nA quantidade de meses é : " + idadeMeses + " meses");
		System.out.println("\nA quantidade de dias é : " + idadeDias + " dias");
		leia.close();
	}

}

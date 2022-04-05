package br.com.generation.exercicio01;

import java.util.Scanner;

public class ExercioSequencial01 {

	public static void main(String[] args) {
		//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.

		Scanner leia = new Scanner(System.in);
		int idAno, idMes, idDias, idade;
		
		System.out.println("Digite sua idade expressa em anos: ");
		idAno = leia.nextInt();
		
		System.out.println("Digite sua idade expressa em meses: ");
		idMes = leia.nextInt();
		
		System.out.println("Digite sua idade expressa em dias: ");
		idDias = leia.nextInt();
		
		idDias = idAno*365 + idMes*30 + idDias;
		
		System.out.println("Sua idade em dias é: " + idDias);
		leia.close();

	}

}

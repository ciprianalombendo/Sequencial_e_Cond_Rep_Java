package br.com.generation.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//1- Fa�a um programa que recebe tr�s inteiros e digite qual deles � maior.
		
		Scanner ler = new Scanner(System.in);
		int a, b, c, maior;
		
		System.out.println("Digite o n�mero 1: ");
		a = ler.nextInt();
		
		System.out.println("Digite o n�mero 2: ");
		b = ler.nextInt();
		
		System.out.println("Digite o n�mero 3: ");
		c = ler.nextInt();
		
		if(a>b && a>c) {
			maior = a;
		}
		else if(b>a && b>c)	{
			maior = b;
		}
		else {
			maior = c;
		}
		System.out.println("O maior n�mero �: " + maior);
	}
    
}

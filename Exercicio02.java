package br.com.generation.exercicio01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
     //2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		 Scanner ler = new Scanner(System.in);
	        int n1, n2, n3; //dados de entrada

	        System.out.println("Digite três numeros: ");
	        n1 = ler.nextInt();
	        n2 = ler.nextInt();
	        n3 = ler.nextInt();

	        if(n1 <= n2 && n2<= n3) {
	            System.out.println("A ordem crescente: \n" + n1 + "\n" + n2 + "\n" + n3);
	        }
	        else if (n1 <= n3 && n3 <= n2) {
	            System.out.println("A ordem crescente: \n" + n1 + n3 + n2);
	        }
	        else if(n2 <= n1 && n1 <= n3) {
	            System.out.println("A ordem crescente: \n" + n2 + n1 + n3);
	        }
	        else if(n2 <= n3 && n3 <= n1) {
	            System.out.println("A ordem crescente: \n" + n2 + n3 + n1);
	        }
	        else if(n3 <= n1 && n1 <= n2) {
	            System.out.println("A ordem crescente: \n" + n3 + n1 + n2);
	        }
	        else if(n3 <= n2 && n2 <= n1) {
	            System.out.println("A ordem crescente: \n" + n3 + n2 + n1);
	}

	}
}

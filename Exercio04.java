package br.com.generation.exercicio01;

import java.util.Scanner;


public class Exercio04 {

	public static void main(String[] args) {
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
				//ímpar exiba o número elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
         double numero;
         
         System.out.println("Digite o número: ");
         numero = leia.nextDouble();
         
         if(numero % 2 == 0) {
        	 numero = Math.sqrt(numero);
        	 
        	 System.out.println("\nO número é par! A sua raiz é: " + numero);
         }
	
         else {
         	 numero =  Math.pow(numero, 2);
             System.out.println("\nO número é ímpar! Ele elevado ao quadrado fica: " + numero);
             leia.close();

         }

	}
}

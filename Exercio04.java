package br.com.generation.exercicio01;

import java.util.Scanner;


public class Exercio04 {

	public static void main(String[] args) {
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
				//�mpar exiba o n�mero elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
         double numero;
         
         System.out.println("Digite o n�mero: ");
         numero = leia.nextDouble();
         
         if(numero % 2 == 0) {
        	 numero = Math.sqrt(numero);
        	 
        	 System.out.println("\nO n�mero � par! A sua raiz �: " + numero);
         }
	
         else {
         	 numero =  Math.pow(numero, 2);
             System.out.println("\nO n�mero � �mpar! Ele elevado ao quadrado fica: " + numero);
             leia.close();

         }

	}
}

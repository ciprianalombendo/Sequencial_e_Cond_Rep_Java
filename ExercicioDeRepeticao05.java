/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
package br.com.generation.repeticao;

import java.util.Scanner;

public class ExercicioDeRepeticao05 {

	public static void main(String[] args) {
    
		Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int numero = 0, soma = 0; // declaração de variáveis

        // Recebe e calcula se o número é par ou ímpar
        do {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();

            if (numero != 0)
                soma += numero;

        } while (numero != 0);

        System.out.println("A soma dos números é: " + soma);
        ler.close();
	}

}

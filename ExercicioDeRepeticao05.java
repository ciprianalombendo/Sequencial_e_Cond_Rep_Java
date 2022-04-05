/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/
package br.com.generation.repeticao;

import java.util.Scanner;

public class ExercicioDeRepeticao05 {

	public static void main(String[] args) {
    
		Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int numero = 0, soma = 0; // declara��o de vari�veis

        // Recebe e calcula se o n�mero � par ou �mpar
        do {
            System.out.print("Digite um n�mero: ");
            numero = ler.nextInt();

            if (numero != 0)
                soma += numero;

        } while (numero != 0);

        System.out.println("A soma dos n�meros �: " + soma);
        ler.close();
	}

}

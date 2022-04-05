/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */

package br.com.generation.repeticao;

import java.util.Scanner;

public class ExercicioDeRepeticao06 {

	public static void main(String[] args) {

		   Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
	        int numero = 0, soma = 0, Contador = 0; // declara��o de vari�veis

	        // Recebe e calcula se o n�mero � par ou �mpar
	        do {
	            System.out.print("Digite um n�mero: ");
	            numero = ler.nextInt();

	            if (numero != 0) {
	                if (numero % 3 == 0) {
	                    soma += numero;
	                    Contador++;
	                }
	            }

	        } while (numero != 0);

	        System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + (soma / Contador));
	        ler.close();
	}

}

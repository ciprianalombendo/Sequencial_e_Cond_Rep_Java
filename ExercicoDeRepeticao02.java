package br.com.generation.repeticao;

import java.util.Scanner;

public class ExercicoDeRepeticao02 {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
        Scanner ler = new Scanner(System.in); // cria um objeto do tipo Scanner
        int numero, ContadorPar = 0, ContadorImpar = 0; // declara��o de vari�veis

        // Recebe e calcula se o n�mero � par ou �mpar
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um n�mero: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                ContadorPar++;
            } else {
                ContadorImpar++;
            }
        }

        // Imprime o resultado
        System.out.println("Quantidade de n�meros pares: " + ContadorPar);
        System.out.println("Quantidade de n�meros �mpares: " + ContadorImpar);
        ler.close();
	}

}

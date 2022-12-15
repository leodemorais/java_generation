package lacodedecisao;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		// Faça um programa que receba três números inteiros e retorne qual deles é o maior.

		int num1, num2, num3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe 3 valores: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 +" é o maior número!");
		} else if (num2 > num3) {
			System.out.println(num2 +" é o maior número!");
		} else {
			System.out.println(num3 +" é o maior número!");
		}
		System.out.println("Fim!");
	}

}

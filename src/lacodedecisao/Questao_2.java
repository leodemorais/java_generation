package lacodedecisao;

import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e os coloque em ordem crescente.

		int num1, num2, num3, cont;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: \n ");
		num1 = entrada.nextInt();
		System.out.println("Informe um número: \n ");
		num2 = entrada.nextInt();
		System.out.println("Informe um número: \n ");
		num3 = entrada.nextInt();
		
		
		if(num1 > num2) {
			cont = num2;
			num2 = num1;
			num1 = cont;
		}
		if(num1 > num3) {
			cont = num3;
			num3 = num1;
			num1 = cont;
		}
		if(num2 > num3) {
			cont = num3;
			num3 = num2;
			num2 = cont;
			}
		System.out.println("A numeração em ordem crescente é: " +num1+" "+num2+" "+num3);
	}
}

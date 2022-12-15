package lacodedecisao;

import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de uma pessoa e mostre
		//na saída em qual categoria ela se encontra: 10-14, infantil; 
		//15-17, juvenil; 18-25, adulto

		int idade;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua idade? \n ");
		idade = entrada.nextInt();
		
		entrada.nextLine();
		System.out.println("Qual e o seu nome?");
		nome = entrada.nextLine();
		
		if(idade > 0 && idade <=14) {
			System.out.println(nome +", você pertence à categoria infantil porque tem "+idade+" anos.");
		} else if (idade >=15 && idade <= 17){
			System.out.println(nome +", você pertence à categoria juvenil porque tem "+idade+" anos.");
			} else if (idade > 18)
			System.out.println(nome +", você pertence à categoria adulto porque tem "+idade+" anos ou mais.");
		}
		
	}


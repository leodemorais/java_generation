package programacaosequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa
em dias e a mostre expressa em anos, meses e dias.*/


public class Questao_2 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias;
		try(Scanner entrada = new Scanner(System.in)){
			System.out.println("Informe a sua idade em quantidade de dias: \n");
			idadeDias = entrada.nextInt();
		}
		
		idadeAnos = (idadeDias / 365);
		System.out.println("A idade informada é de " + idadeAnos + " anos. \n");
		
		idadeMeses = (idadeDias * 12) / 365;
		System.out.println("A idade informada é de " + idadeMeses + " meses. \n");
		
	}

}

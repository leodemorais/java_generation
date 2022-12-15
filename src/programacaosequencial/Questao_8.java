package programacaosequencial;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica
 com a percentagem do distribuidor e doss impostos (aplicados ao custo de fábrica).
 Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 escreva um sistema que leia o custo de fábrica de um carro e apresente o 
 custo ao consumidor.*/

public class Questao_8 {

	public static void main(String[] args) {
		
		double custoFabrica, porcentDistribuidor, imposto, precoCarNovo;
		try(Scanner entrada = new Scanner(System.in)){
			System.out.println("Qual o valor de fábrica?");
			custoFabrica = entrada.nextFloat();
		}

		porcentDistribuidor = (custoFabrica * 0.28);
		imposto = (custoFabrica * 0.45);
		
		precoCarNovo = (custoFabrica + porcentDistribuidor + imposto);
		
		System.out.println("O valor final do carro é de: " + precoCarNovo);
		
		
	}

}

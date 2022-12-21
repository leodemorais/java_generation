package lacoderepeticao;

import java.util.Scanner;

public class Questao_3 {

	// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99. (WHILE)
	
	public static void main(String[] args) {
		
		int idade = 0, contMenos = 0, contMais = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite a idade desejada: ");
			idade = entrada.nextInt();
			
			if(idade < 21) {
				contMenos++;
			}
			if(idade > 50) {
				contMais++;
			}
		}
	System.out.println("\n A quantidade de pessoas com idade superior a 50 anos é: "+contMais);	
	System.out.println("\n A quantidade de pessoas com idade inferior a 21 anos é: "+contMenos);
	System.out.println("\n Fim da execução! O nº -99 foi digitado!");
	}

}

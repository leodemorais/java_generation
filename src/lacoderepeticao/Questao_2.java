package lacoderepeticao;

import java.util.Scanner;

public class Questao_2 {

	// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nº1: ");
		int nº1 = entrada.nextInt();
		System.out.println("Digite o nº2: ");
		int nº2 = entrada.nextInt();
		System.out.println("Digite o nº3: ");
		int nº3 = entrada.nextInt();
		System.out.println("Digite o nº4: ");
		int nº4 = entrada.nextInt();
		System.out.println("Digite o nº5: ");
		int nº5 = entrada.nextInt();
		System.out.println("Digite o nº6: ");
		int nº6 = entrada.nextInt();
		System.out.println("Digite o nº7: ");
		int nº7 = entrada.nextInt();
		System.out.println("Digite o nº8: ");
		int nº8 = entrada.nextInt();
		System.out.println("Digite o nº9: ");
		int nº9 = entrada.nextInt();
		System.out.println("Digite o nº10: ");
		int nº10 = entrada.nextInt();
		
		int [] numeros = { nº1, nº2, nº3, nº4, nº5, nº6, nº7, nº8, nº9, nº10};
		
		int i;
		
		for ( i = 1; i < numeros.length; i++) {
			
			if (numeros[i] % 2 == 0) System.out.println("O número " + numeros[i] + " é par.");
			else System.out.println("O número " + numeros[i] + " é impar.");
		}
				
	}

}

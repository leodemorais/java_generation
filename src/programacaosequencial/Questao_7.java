package programacaosequencial;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo ax + by = c // dx + ey = f
 pode ser resolvido conforme a fórumla a seguir:
 
 x = ce - bff / ae - bd // y = af - cd / ae - bd
 
 Escreva um sistema que leia os coeficientes a,b,c,d,E, e f 
 e calcula e mostra os valores de x e y.
 */

public class Questao_7 {

	public static void main(String[] args) {
	
		double a, b, c, d, E, f, x, y;
		try(Scanner ler = new Scanner(System.in)){
			System.out.println("Digite os valores: \n");
			
			a = ler.nextDouble();
			b = ler.nextDouble();
			c = ler.nextDouble();
			d = ler.nextDouble();
			E = ler.nextDouble();
			f = ler.nextDouble();
		}
		
		x = ((c * E ) - (b * f))/((a * E) - (b *d));
		y = ((a * f ) - (c * d))/((a * E) - (b *d));
		
		System.out.println("Conclui-se que x = "+ x +" e y = " +y);		

	}

}

package lacoderepeticao;

public class Questao_1 {

	//Informar todos os números de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5. (FOR)
	
	
	public static void main(String[] args) {
		
		for (int i = 1000; i < 11999; i++) {
			if (i % 13 ==5) System.out.println(i);
		}

	}

}

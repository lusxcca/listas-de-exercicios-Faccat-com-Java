package faccat;

import java.util.Scanner;

public class L02E15_PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Solicite um valor: ");
		int valor = sc.nextInt();
		
		if (valor>=0) {
			System.out.println("O valor digitado é positivo");
		} else {
			System.out.println("O valor digitado é negativo");
		}
		sc.close();

	}

}

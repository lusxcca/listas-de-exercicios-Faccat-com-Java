package faccat;

import java.util.Scanner;

public class L02E19_MaiorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();
		if (valor1>valor2) {
			System.out.println("Dos valores informados, o maior é o valor: "+valor1);
		} else {
			System.out.println("Dos valores informados, o maior é o valor: "+valor2);
		}
		sc.close();

	}

}

package faccat;

import java.util.Scanner;

public class L02E20_OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Informe outro valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1>valor2) {
			System.out.println("A ordem crescente dos valores informados é de: "+valor1+", "+valor2);
		} else {
			System.out.println("A ordem crescente dos valores informados é de: "+valor2+", "+valor1);
		}
		sc.close();
		
	}

}

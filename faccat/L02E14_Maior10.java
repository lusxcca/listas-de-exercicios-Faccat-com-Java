package faccat;

import java.util.Scanner;

public class L02E14_Maior10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();
		
		if (valor>10) {
			System.out.println("O valor informado � maior que 10");
		} else {
			System.out.println("O valor informado n�o � maior que 10");
		}
		sc.close();

	}

}

package faccat;

import java.util.Scanner;

public class L01F_AreaRetangulo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a base do retângulo: ");
		int base = sc.nextInt();
		System.out.println("Informe a altura do retângulo");
		int altura = sc.nextInt();
		int areaR = base*altura;
		System.out.println("A área do retângulo correspondente é: "+areaR);
		sc.close();
	}
	
}

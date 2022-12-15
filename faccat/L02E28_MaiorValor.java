package faccat;

import java.util.Scanner;

public class L02E28_MaiorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		byte a = sc.nextByte();
		System.out.println("Informe o segundo valor: ");
		byte b = sc.nextByte();
		System.out.println("Informe o terceiro valor: ");
		byte c = sc.nextByte();
		
		if ((a>b) && (a>c)) {
			System.out.println("Dos valores informados, o maior valor é A");
		} else if ((b>a) && (b>c)) {
			System.out.println("Dos valores informados, o maior valor é B");
		} else {
			System.out.println("Dos valores informados, o maior valor é C");
		}
		sc.close();
	}

}

package faccat;

import java.util.Scanner;

public class L02E31_FormarTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		byte valor1 = sc.nextByte();
		System.out.println("Informe o segundo valor: ");
		byte valor2 = sc.nextByte();
		System.out.println("Informe o terceiro valor: ");
		byte valor3 = sc.nextByte();

		if ((valor1<valor2+valor3) && (valor2<valor1+valor3) && (valor3<valor2+valor1)) {
			System.out.println("De acordo com os valores informados, é possível formar um triângulo: ");
		} else {
			System.out.println("De acordo com os valores informados, não é possível formar um triângulo: ");
		}
		sc.close();
	}

}

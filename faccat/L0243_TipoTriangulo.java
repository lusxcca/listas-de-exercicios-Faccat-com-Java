package faccat;

import java.util.Scanner;

public class L0243_TipoTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro lado: ");
		byte a = sc.nextByte();
		System.out.println("Informe o valor do segundo lado: ");
		byte b = sc.nextByte();
		System.out.println("Informe o valor do terceiro lado: ");
		byte c = sc.nextByte();
		
		if ((a < (b+c)) && (b < (a+c)) && (c < (a+b))) {
			if ((a == b) && (b == c)) {
				System.out.println("Triângulo Equilátero");
			} else if ((a==b) || (b == c) || (a == c)) {
				System.out.println("Triângulo Isóceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é possível formar um triângulo");
		}
		
		/* A(1), B(2), C(3) = Não é possível formar um triângulo;
		 * A(3), B(4), C(5) = Triângulo Escanelo;
		 * A(2), B(2), C(4) = Não é possível formar um triângulo;
		 * A(4), B(4), C(4) = Triângulo Equilátero;
		 * A(5), B(3), C(3) = Triângulo Isóceles;
		 */
		
		sc.close();
	}

}

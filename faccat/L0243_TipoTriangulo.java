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
				System.out.println("Tri�ngulo Equil�tero");
			} else if ((a==b) || (b == c) || (a == c)) {
				System.out.println("Tri�ngulo Is�celes");
			} else {
				System.out.println("Tri�ngulo Escaleno");
			}
		} else {
			System.out.println("N�o � poss�vel formar um tri�ngulo");
		}
		
		/* A(1), B(2), C(3) = N�o � poss�vel formar um tri�ngulo;
		 * A(3), B(4), C(5) = Tri�ngulo Escanelo;
		 * A(2), B(2), C(4) = N�o � poss�vel formar um tri�ngulo;
		 * A(4), B(4), C(4) = Tri�ngulo Equil�tero;
		 * A(5), B(3), C(3) = Tri�ngulo Is�celes;
		 */
		
		sc.close();
	}

}

package faccat;

import java.util.Scanner;

public class L02E16_MacasComprar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantas maçãs você comprou: ");
		int Qmacas = sc.nextInt();
		float macas = 1.30f;
		float resultado;
		if (Qmacas <= 12) {
			resultado = Qmacas*macas;
		} else {
			macas = 1.00f;
			resultado = Qmacas*macas;
		}
		System.out.println("Você comprou com "+Qmacas+" e gastou no total: %.2f "+resultado);
		sc.close();
		
	}

}

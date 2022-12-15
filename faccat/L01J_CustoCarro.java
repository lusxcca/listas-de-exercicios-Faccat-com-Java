package faccat;

import java.util.Scanner;

public class L01J_CustoCarro {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o custo de fábrica do carro: ");
		float custoFabrica = sc.nextInt();
		float distribuidor = custoFabrica*28/100;
		float imposto = custoFabrica*45/100;
		float total = custoFabrica+distribuidor+imposto;
		System.out.println("O valor a ser pago no carro é de: "+total);
		sc.close();
	}

}

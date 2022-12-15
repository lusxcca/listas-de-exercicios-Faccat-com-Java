package faccat;

import java.util.Scanner;

public class L02E35_AlcoolEGasolina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe a quantidade de litros que foram vendidos: ");
		byte litros = sc.nextByte();
		System.out.println("Informe o tipo de combustível que foi comprado");
		char combustivel = sc.next().charAt(0);
		
		float alcool = 2.90f;
		float gasolina = 3.30f;
		float litrosVendidos_A;
		float litrosVendidos_G;
		
		if (combustivel == 'A') {
			if (litros <= 20) {
				litrosVendidos_A = litros*alcool-((litros*alcool)*3/100);
				System.out.println("O valor total a ser pago na compra é: "+litrosVendidos_A);
			} else {
				litrosVendidos_A = litros*alcool-((litros*alcool)*5/100);
				System.out.println("O valor total a ser pago na compra é: "+litrosVendidos_A);
			}
		} else {
			if (litros < 20) {
				litrosVendidos_G = litros*gasolina-((litros*gasolina)*3/100);
				System.out.println("O valor total a ser pago na compra é: "+litrosVendidos_G);
			} else {
				litrosVendidos_G = litros*gasolina-((litros*gasolina)*5/100);
				System.out.println("O valor total a ser pago na compra é: "+litrosVendidos_G);
			}
		}
		sc.close();
		
	}

}

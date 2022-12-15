package faccat;

import java.util.Scanner;

public class L02E37_Fruteira {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade em KG comprados de morangos: ");
		byte pesoMorango = sc.nextByte();
		System.out.println("Informe a quantidade em KG comprados de maçãs: ");
		byte pesoMacas = sc.nextByte();
		
		float morango = 2.50f;
		float maca = 1.80f;
		
		if (pesoMorango>5) {
			morango = 2.20f;
		}
		
		if (pesoMacas>5) {
			maca = 1.50f;
		}
		
		float precoMorango = pesoMorango*morango;
		float precoMaca = pesoMacas*maca;
		int pesoTotal = pesoMorango+pesoMacas;
		float valorTotal = precoMorango+precoMaca;
		
		if ((pesoTotal>8) || (valorTotal > 25)) {
			valorTotal = valorTotal-(valorTotal*10/100);
		}
		System.out.println("O valor total da compra foi de: "+valorTotal);
		sc.close();

	}

}

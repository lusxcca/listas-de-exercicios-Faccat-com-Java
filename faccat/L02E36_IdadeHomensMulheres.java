package faccat;

import java.util.Scanner;

public class L02E36_IdadeHomensMulheres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte maiorH = 0;
		byte menorH = 127;
		byte maiorM = 0;
		byte menorM = 127;
		
		byte homem;
		
		for (byte contadora = 1; contadora <= 2; contadora++) {
			
			System.out.println("Informe a idade do "+contadora+"º homem: ");
			homem = sc.nextByte();
			
			if (homem>maiorH) {
				maiorH = homem;
			}
			if (homem<menorH) {
				menorH = homem;
			}
		}
		
		for (byte contadora2 = 1; contadora2 <= 2; contadora2++) {
			
			System.out.println("Informe a idade da "+contadora2+"º mulher");
			byte mulher = sc.nextByte();
			
			if (mulher>maiorM) {
				maiorM = mulher;
			} 
			if (mulher<menorM) {
				menorM = mulher;
			}
		}
		int soma = maiorH + menorM;
		int produto = menorH * maiorM;
		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: "+soma);
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: "+produto);
		sc.close();
	}

}

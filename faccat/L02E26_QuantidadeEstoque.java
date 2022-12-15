package faccat;

import java.util.Scanner;

public class L02E26_QuantidadeEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do produto: ");
		String produto = sc.nextLine();
		System.out.println("Informe a quantidade atual deste produto no estoque: ");
		short qAtual = sc.nextShort();
		System.out.println("Qual a quantidade máxima que este produto pode ter: ");
		short qMaxima = sc.nextShort();
		System.out.println("Qual a quantidade mínima que se deve considerar deste produto: ");
		short qMinima = sc.nextShort();
		int qMedia = (qMaxima+qMinima)/2;
		if (qAtual>=qMedia) {
			System.out.println("Não efetuar a compra do produto: "+produto);
		} else {
			System.out.println("Efetuar a compra do produto: "+produto);
		}
		sc.close();
	}

}

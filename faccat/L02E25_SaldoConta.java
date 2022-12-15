package faccat;

import java.util.Scanner;

public class L02E25_SaldoConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número de sua conta: ");
		String conta = sc.nextLine();
		System.out.println("Informe seu saldo: ");
		short saldo = sc.nextShort();
		System.out.println("Informe sua quantia monetária em débito: ");
		short debito = sc.nextShort();
		System.out.println("Informe sua quantia monetária em crédito: ");
		short credito = sc.nextShort();
		int saldoAtual = saldo-debito+credito;
		if (saldoAtual>=0) {
			System.out.println("Número da Conta: "+conta);
			System.out.println("Seu saldo atual é de: "+saldoAtual+" e, portanto, positivo.");
		} else {
			System.out.println("Número da Conta: "+conta);
			System.out.println("Seu saldo atual é de "+saldoAtual+" e, portanto, negativo");
		}
		sc.close();
	}

}

package faccat;

import java.util.Scanner;

public class L02E24_VendedorSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário fixo: ");
		short salario = sc.nextShort();
		System.out.println("Informe o valor total de suas vendas: ");
		short totalVendas = sc.nextShort();
		if (totalVendas<=1500) {
			int novoSalario = salario+(totalVendas*3/100);
			System.out.println("Seu salário ao final do mês será de: "+novoSalario);
		} else {
			int novoSalario = salario+(totalVendas*5/100);
			System.out.println("Seu salario ao final do mês será de: "+novoSalario);
		}
		sc.close();

	}

}

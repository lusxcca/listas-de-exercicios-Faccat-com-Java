package faccat;

import java.util.Scanner;

public class L01K_RevendedoraCarros {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do sal�rio fixo: ");
		int salario = sc.nextInt();
		System.out.println("Informe a comiss�o para cada carro: ");
		int comissao = sc.nextInt();
		System.out.println("Informe a quantidade de carros vendidos: ");
		int vendidos = sc.nextInt();
		System.out.println("Informe o valor total das vendas: ");
		int valorVendas = sc.nextInt();
		
		float salarioVendedor = salario+(vendidos/comissao)+(valorVendas*5/100);
		
		System.out.println("Seu sal�rio este m�s ser�: "+salarioVendedor);
		sc.close();
	}

}

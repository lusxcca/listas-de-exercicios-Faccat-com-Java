package faccat;

import java.util.Scanner;

public class L01I_SalarioNovo {

	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Informe seu salário: ");
		float salario = sc.nextFloat();
		System.out.println("Informe o percentual de reajuste: ");
		int reajuste = sc.nextInt();
		float novoSalario = salario+(salario/reajuste);
		System.out.println("Seu novo salário será: "+novoSalario);
		sc.close();
		
	}
}

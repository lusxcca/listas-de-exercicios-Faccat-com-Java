package faccat;

import java.util.Scanner;

public class L02E22_SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas o funcionário trabalhou: ");
		int horas = sc.nextInt();
		System.out.println("Qual é o valor do salário por hora: ");
		int salario = sc.nextInt();
		float salarioNovo = 160*salario;
		float extra;
		if (horas>160) {
			extra = horas-160;
			float salario2 = extra*salario;
			salarioNovo= salarioNovo+(salario2/2);
			System.out.println("O salário que irá ganhar esse mês será: "+salarioNovo);
		} else {
			System.out.println("O salário que irá ganhar esse mês será: "+salarioNovo);
		}
		
		
		sc.close();
		

	}

}

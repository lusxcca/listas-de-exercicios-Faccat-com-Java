package faccat;

import java.util.Scanner;

public class L02E29_SomaMaiores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		byte a = sc.nextByte();
		System.out.println("Informe o segundo valor: ");
		byte b = sc.nextByte();
		System.out.println("Informe o terceiro valor: ");
		byte c = sc.nextByte();
		int soma;
		
		if ((a>b) && (b>c)) {
			soma = a+b;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		} else if ((a>c) && (c>b)) {
			soma = a+c;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		} else if ((b>a) && (a>c)) {
			soma = b+a;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		} else if ((b>c) && (c>a)) {
			soma = b+c;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		} else if ((c>a) && (a>b)) {
			soma = c+a;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		} else {
			soma = c+b;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		}
		// 123, 132, 213, 231, 321, 312
		sc.close();
	}

}

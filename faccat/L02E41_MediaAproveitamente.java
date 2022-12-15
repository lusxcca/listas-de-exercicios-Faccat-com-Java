package faccat;

import java.util.Scanner;

public class L02E41_MediaAproveitamente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nome = sc.next();
		
		System.out.println("Informe a primeira nota deste aluno: ");
		byte nota1 = sc.nextByte();
		System.out.println("Informe a segunda nota deste aluno: ");
		byte nota2 = sc.nextByte();
		System.out.println("Informe a terceira nota deste aluno: ");
		byte nota3 = sc.nextByte();
		System.out.println("Informe a nota deste aluno na média dos exercícios: ");
		byte exercicios = sc.nextByte();
		
		float media = (nota1+nota2*2+nota3*3+exercicios)/7;
		
		if (media>=9) {
			System.out.println("O aproveitamento do aluno "+nome+" foi A");
		} else if (media>=7.5 &&  media < 9) {
			System.out.println("O aproveitamento do aluno "+nome+" foi B");
		} else if (media >= 6 && media < 7.5)  {
			System.out.println("O aproveitamento do aluno "+nome+" foi C");
		} else {

			System.out.println("O aproveitamento do aluno "+nome+" foi D");
		}
		sc.close();
		
	}

}

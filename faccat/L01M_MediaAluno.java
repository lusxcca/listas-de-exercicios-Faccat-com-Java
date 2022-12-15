package faccat;

import java.util.Scanner;

public class L01M_MediaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe a primeira nota do aluno: ");
		int nota1 = sc.nextInt();
		System.out.println("Infome a segunda nota do aluno: ");
		int nota2 = sc.nextInt();
		System.out.println("Informe a terceira nota do aluno: ");
		int nota3 = sc.nextInt();
		float media = (nota1*2+nota2*3+nota3*5)/10;
		System.out.println("A média deste aluno é de: "+media);
		sc.close();
	}

}

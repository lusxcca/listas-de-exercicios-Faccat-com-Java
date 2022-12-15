package faccat;

import java.util.Scanner;

public class L01E_Antecessr {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja saber do antecessor: ");
		int antecessor = sc.nextInt() - 1;
		System.out.println("O antecessor do número informado é: "+antecessor);
		sc.close();
	}
}

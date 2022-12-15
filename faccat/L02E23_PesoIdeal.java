package faccat;

import java.util.Scanner;

public class L02E23_PesoIdeal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe seu gênero: ");
		String genero = sc.nextLine();
		System.out.println("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		if (genero == "M") {
			double peso_ideal = (72.2f * altura) - 58;
			System.out.println("O peso ideal da pessoa "+nome+" é: "+peso_ideal);
		} else {
			double peso_ideal = (62.1f * altura) - 44.7d;
			System.out.println("O peso ideal da pessoa "+nome+" é: "+peso_ideal);
		}
		sc.close();
	}

}


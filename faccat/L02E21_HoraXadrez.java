package faccat;

import java.util.Scanner;

public class L02E21_HoraXadrez {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Informe a hora em que a partida começou: ");
		int horaInicio = sc.nextInt();
		System.out.println("Informe a hora em que a partida terminou: ");
		int horaTermino = sc.nextInt();
		int duracao;
		if (horaInicio>horaTermino) {
			duracao = horaTermino-horaInicio+24;
			System.out.println("duracao: "+duracao);
		} else {
			duracao = horaTermino-horaInicio;
			System.out.println("duracao: "+duracao);
		}
		sc.close();

	}

}

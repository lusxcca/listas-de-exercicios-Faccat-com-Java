package faccat;

import java.util.Scanner;

public class L02E32_ResultadoPartida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome do primeiro time: ");
		String time1 = sc.next();
		System.out.println("Quantos gols o time "+time1+" fez? ");
		byte gols1 = sc.nextByte();
		System.out.println("Qual o nome do segundo time: ");
		String time2 = sc.next();
		System.out.println("Quantos gols o time "+time2+" fez? ");
		byte gols2 = sc.nextByte();

		if (gols1>gols2) {
			System.out.println("O time vencedor é o "+time1);
		} else if (gols1==gols2) {
			System.out.println("Deu empate");
		} else {
			System.out.println("O time vencedor é o "+time2);
		}
		sc.close();
	}

}

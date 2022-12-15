package faccat;

import java.util.Scanner;

public class L02E34_TesteMesa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de x: ");
		short x = sc.nextShort();
		System.out.println("Informe o valor de y: ");
		short y = sc.nextShort();
		int z = x*y + 5;
		char resposta;
		if (z <= 0) {
			resposta = 'A';
			System.out.println("O resultado é: "+z+" e a resposta é: "+resposta);
		} else if (z<=100) {
			resposta = 'B';
			System.out.println("O resultado é: "+z+" e a resposta é: "+resposta);
		} else {
			resposta = 'C';
			System.out.println("O resultado é: "+z+" e a resposta é: "+resposta);
		}
		sc.close();
		/* 
		 * 3 * 2 =   Z(11) e a  resposta(B);
		 * 150 * 3 = Z(455) e a resposta(C);
		 * 7 * -1 =  Z(-2) e a  resposta(A);
		 * -2 * 5 =  Z(-5) e a  resposta(A);
		 * 50 * 3 =  Z(155) e a resposta(C);
		 * */
	}

}

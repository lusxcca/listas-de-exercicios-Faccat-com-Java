package faccat;

import java.util.Scanner;

public class L02E38_Cadastro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu código de usuário: ");
		short usuario = sc.nextShort();
		System.out.println("Informe sua senha: ");
		short senha = sc.nextShort();
		
		if (usuario != 1234) {
			System.out.println("Usuário incorreto!");
		} else if (senha != 9999) {
			System.out.println("Senha incorreta!");
		} else {
			System.out.println("Acesso permitido!");
		}
		
		sc.close();
	}

}

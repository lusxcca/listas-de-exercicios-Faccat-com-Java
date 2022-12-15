package faccat;

public class L01A_TrocarValores {

	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 20;
		int auxiliar;
		System.out.println("No momento, o valor da primeira variável é: " + valor1);
		System.out.println("No momento, o valor da segunda variável é: " + valor2);
	
		auxiliar = valor1;
		valor1 = valor2;
		valor2 = auxiliar;
		
		System.out.println();
		System.out.println("Agora o valor da primeira variável é: "+valor1);
		System.out.println("Agora o valor da segunda variável é: "+valor2);
	}

}

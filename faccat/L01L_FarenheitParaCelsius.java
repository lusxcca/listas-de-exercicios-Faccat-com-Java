package faccat;

import java.util.Scanner;

public class L01L_FarenheitParaCelsius {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em farenheit: ");
		int fahrenheit = sc.nextInt();
		float celsius = (fahrenheit-32)*5/9;
		System.out.println("Esta mesma temperatura em graus celsius é de: "+celsius);
		sc.close();
	}
	
}

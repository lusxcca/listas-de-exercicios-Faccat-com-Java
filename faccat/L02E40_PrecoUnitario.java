package faccat;

import java.util.Scanner;

public class L02E40_PrecoUnitario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		String nome = sc.next();
		System.out.println("Informe a quantidade adquirida do mesmo: ");
		byte quantidade = sc.nextByte();
		System.out.println("Informe o preço unitário deste produto: ");
		float preco = sc.nextFloat();
		
		float compra = quantidade*preco;
		
		float total;
		
		if (quantidade <= 5) {
			total = compra-(compra*2/100);
			System.out.println("O valor total da compra do produto"+nome+"  foi de: "+total);
		} else if (quantidade > 5 && quantidade<=10) {
			total = compra-(compra*3/100);
			System.out.println("O valor total da compra do produto"+nome+"  foi de: "+total);
		} else {
			total = compra-(compra*5/100);
			System.out.println("O valor total da compra do produto"+nome+"  foi de: "+total);
		}
		sc.close();
		
	}

}

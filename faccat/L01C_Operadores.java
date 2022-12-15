package faccat;

public class L01C_Operadores {

	public static void main(String[] args) {
		
		int A = (4/2)+(2/4);
		int A2 = 4/2+2/4;
		int B = 4/(2+2/4);
		int B2 = 4/2+2/4;
		int C = (4+2)*2-4;
		int C2 = 4+2*2-4;
		
		System.out.println("(4/2)+(2/4) = "+A);
		System.out.println("4/2+2/4 = "+A2);
		System.out.println("4/(2+2/4) = "+B);
		System.out.println("4/2+2/4 = "+B2);
		System.out.println("(4+2)*2-4 = "+C);
		System.out.println("4+2*2-4 = "+C2);

	}

}

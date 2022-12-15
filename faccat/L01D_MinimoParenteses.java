package faccat;

public class L01D_MinimoParenteses {

	public static void main(String[]args) {
		int A = 6*(3+2);
		int B = 2+(6*(3+2));
		int C = 2+(3*6)/(2+4);
		int D = 2*(8/(3+1));
		int E = 3+(16-2)/(2*(9-2));
		int F = (6/3)+(8/2); 
		int G = ((3+(8/2))*4)+(3*2);
		int H = (6*(3*3)+6)-10;
		int I = (((10*8)+3)*9);
		int J = ((-12)*(-4))+(3*(-4));
		
		int respA = 6*(3+2);
		int respB = 2+6*(3+2);
		int respC = 2+3*6/(2+4);
		int respD = 2*(8/(3+1));
		int respE = 3+(16-2)/(2*(9-2));
		int respF = 6/3+8/2;
		int respG = (3+8/2)*4+3*2;
		int respH = 6*(3*3)+6-10;
		int respI = (10*8+3)*9;
		int respJ = -12*-4+3*-4;
		
		System.out.println("6*(3+2) = "+A);
		System.out.println("2+(6*(3+2)) = "+B);
		System.out.println("2+(3*6)/(2+4) = "+C);
		System.out.println("2*(8/(3+1)) = "+D);
		System.out.println("3+(16-2)/(2*(9-2)) = "+E);
		System.out.println("(6/3)+(8/2) = "+F);
		System.out.println("((3+(8/2))*4)+(3*2) = "+G);
		System.out.println("(6*(3*3)+6)-10 = "+H);
		System.out.println("(((10*8)+3)*9) = "+I);
		System.out.println("((-12)*(-4))+(3*(-4)) = "+J);
		
		System.out.println();
		System.out.println("6*(3+2) = "+respA);
		System.out.println("2+6*(3+2) = "+respB);
		System.out.println("2+3*6/(2+4) = "+respC);
		System.out.println("2*(8/(3+1)) = "+respD);
		System.out.println("3+(16-2)/(2*(9-2)) = "+respE);
		System.out.println("6/3+8/2 = "+respF);
		System.out.println("(3+8/2)*4+3*2 = "+respG);
		System.out.println("6*(3*3)+6-10 = "+respH);
		System.out.println("(10*8+3)*9 = "+respI);
		System.out.println("-12*-4+3*-4 = "+respJ);
	}
	
}

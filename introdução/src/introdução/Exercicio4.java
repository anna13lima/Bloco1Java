package introdução;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a, b, c, r, s, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("gigite o valor de A: ");
		a=ler.nextInt();
		System.out.print("gigite o valor de B: ");
		b=ler.nextInt();
		System.out.print("gigite o valor de C: ");
		c=ler.nextInt();
		r=Math.pow(a+b,2.0);
		s=Math.pow(a+b,2.0);
		d=(r+s)/2;
		
		System.out.print("\nO resultado é: "+d);
				
		
		
	
		

	}

}

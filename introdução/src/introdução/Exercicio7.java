package introdu��o;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, i, f, x, y;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("digite os valores de A,B,C,D,E e F: ");
		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();
		d=ler.nextInt();
		i=ler.nextInt();
		f=ler.nextInt();
		x=(c*i-b*f)/(a*i-b*d);
		y=(a*f-c*d)/(a*i-b*d);
		
		System.out.println(("\nOs valores de X e Y s�o respectivamente: "+ x +" e "+y));
		
	}

}

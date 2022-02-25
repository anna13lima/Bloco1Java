package introdução;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("digite as cordenadas do ponto de partida:");
		x1=ler.nextInt();
		y1=ler.nextInt();
		System.out.print("digite as cordenadas do ponto de destino:");
		x2=ler.nextInt();
		y2=ler.nextInt();
		d=Math.abs(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2.0));
		
		System.out.print("\nA distancia entre os doid pontos é: "+d);
		
		
		
	}

}

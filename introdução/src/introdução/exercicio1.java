package introdução;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int anos , meses , dias , resp;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("quantos anos você tem?: ");
		anos=ler.nextInt();
		System.out.println("\nquantos meses você tem?: ");
		meses=ler.nextInt();
		System.out.println("\nquantos dias você tem?: ");
		dias=ler.nextInt();
		resp=anos*365+meses*30+dias;
		System.out.println("\nsua idade em dias é: "+resp);
		
		

	}

}

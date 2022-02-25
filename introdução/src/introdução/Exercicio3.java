package introdução;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int ev, h, m, s, r;
		Scanner ler =new Scanner(System.in);
		
		System.out.println("digite os segundos:");
		ev=ler.nextInt();
		h=ev/3600;
		r=ev%3600;
		m=r/60;
		s=r%60;
		
		System.out.print("\nO tempo de duração é: "+h+"horas"+m+"minutos e"+s+"segundos");
				
				
				

	}

}

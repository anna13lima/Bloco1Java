package introdução;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
    
		double cf, dist, imp, cc;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite o valor de fabrica do veiculo: ");
		cf= ler.nextInt();
		dist=cf*0.28;
		imp=cf*0.45;
		cc=cf+dist+imp;
		
		System.out.print("\no valor de venda do veiculo é: "+cc);
		
	}

}

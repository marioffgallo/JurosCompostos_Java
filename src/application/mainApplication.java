package application;

import java.util.Scanner;

public class mainApplication {

	public static void main(String[] args) {
		
		Double m;
		Double i = 1.0;
		Double t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor aplicado: ");
		Double p = sc.nextDouble();
		
		System.out.print("Quantas semanas: ");
		Double w = sc.nextDouble();
		
		System.out.print("Taxa de juros em %: ");
		Double j = sc.nextDouble() / 100;
		
		t = (w * 5)/256;
		i += j;
		m = Math.abs(p * (Math.pow(i, t)));
		
		System.out.println("Valor rendido: R$" + String.format("%.2f", (m - p)));
		System.out.println("Valor total poupado: R$" + String.format("%.2f", m));
		
		sc.close();
	}

}
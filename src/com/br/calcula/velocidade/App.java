package com.br.calcula.velocidade;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner f = new Scanner (System.in);

		// tempo gasto
		System.out.println("Qual é tempo gasto?");
		int tempo = f.nextInt();
       
        // velocidade
		System.out.println("Qual é velocidade atual?");
		int velocidade = f.nextInt();
       
		// valor da distancia
		double valor = (velocidade * tempo);

		double quantDLitros = (valor / 12);
		System.out.println("O valor em litros é " + quantDLitros);
/// 
		 System.out.println(" O tempo gasto é " + tempo);
			System.out.println(" velocidade media é " + velocidade);
	        System.out.println("valor da distancia é " +  valor);

	
	}


}

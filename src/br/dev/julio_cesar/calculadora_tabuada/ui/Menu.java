package br.dev.julio_cesar.calculadora_tabuada.ui;

import java.util.Scanner;

import br.dev.julio_cesar.calculadora_tabuada.model.Tabuada;

public class Menu {
	
	public void criarMenu() {
		Scanner leitor = new Scanner(System.in);
		Tabuada t1 = new Tabuada();
		
		System.out.print("Qual será o multiplicando: ");
		double multiplicando = leitor.nextDouble();
		t1.setMultiplicando(multiplicando);
		
		System.out.print("Qual será o minimo multiplicador: ");
		double minimoMultiplicador = leitor.nextDouble();
		t1.setMinimoMultiplicador(minimoMultiplicador);
		
		System.out.print("Qual será o máximo multiplicador: ");
		double maximoMultiplicador = leitor.nextDouble();
		t1.setMaximoMultiplicador(maximoMultiplicador);
		t1.mostrarTabuada();
	}

}

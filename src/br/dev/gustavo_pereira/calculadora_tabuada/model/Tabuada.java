package br.dev.gustavo_pereira.calculadora_tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	
	
	public void mostrarTabuada() {
		while (minimoMultiplicador <= maximoMultiplicador ) {
			double tabuada = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " X " + minimoMultiplicador + " = " + tabuada);
			minimoMultiplicador = minimoMultiplicador +1;
		}
		
		
	}
	
}
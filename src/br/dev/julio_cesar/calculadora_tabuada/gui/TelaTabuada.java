package br.dev.julio_cesar.calculadora_tabuada.gui;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.julio_cesar.calculadora_tabuada.model.Tabuada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	private JScrollPane scrollTabuada;
	
	private JList listTabuada;
	
	private void exibirTabuada() {
	}
	private void limparTabuada() {
	}
	public void criarTelaTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//Vamos criar os componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20,20,135,30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setText("");
		textMultiplicando.setBounds(300, 20, 50, 30);
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Minimo Multiplicador: ");
		labelMinMultiplicador.setBounds(20, 65, 135, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setText("");
		textMinMultiplicador.setBounds(300, 65, 50, 30);
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 110, 135, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setText("");
		textMaxMultiplicador.setBounds(300, 110, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 150, 130, 40);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(220, 150, 130, 40);
		
		// Criar o objeto scroll
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 205, 330, 350);
		
		// Obtemos o painel de conteúdo e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinMultiplicador);
		tela.getContentPane().add(textMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);
		
		// Adicionar ouvintes de eventos aos botões
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Tabuada tabuada = new Tabuada();
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);
				
				String min = textMinMultiplicador.getText();
				double minDouble = Double.valueOf(min);
				tabuada.setMinimoMultiplicador(minDouble);
				
				String max = textMaxMultiplicador.getText();
				double maxDouble = Double.valueOf(max);
				tabuada.setMaximoMultiplicador(maxDouble);
				
				tabuada.mostrarTabuada();
			
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textMultiplicando.setText("");
				textMinMultiplicador.setText("");
				textMaxMultiplicador.setText("");
				textMultiplicando.requestFocus();
			}
		});
		
		// Essa linha deve ser a última linha desse método
		tela.setVisible(true);
	}
}

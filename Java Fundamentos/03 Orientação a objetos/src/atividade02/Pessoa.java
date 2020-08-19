package atividade02;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos
	double peso, altura;
	
	// Cálculo de imc
	double calculo() {
		return peso / (altura * altura);
	}
	
	// Situação do IMC
	String situacao() {
		double imc = calculo();
		String situacao;
		
		if(imc <= 18.5) {
			situacao = "Abaixo do peso";
		}else if(imc <= 25) {
			situacao = "Peso normal";
		}else if(imc <= 30) {
			situacao = "Acima do peso";
		}else {
			situacao = "Obesidade";
		}
		
		return situacao;
	}
	
	// Mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, situacao()+" com um IMC de "+calculo());
	}
	
}

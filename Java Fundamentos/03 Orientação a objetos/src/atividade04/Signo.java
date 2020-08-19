package atividade04;

import javax.swing.JOptionPane;

public class Signo {
	
	// Atributos
	int dia, mes;
	
	// Retornar o signo
	String signo() {
		
		// Nome do signo
		String nome = "";
		
		// Áries
		if((dia >= 21 && dia <= 31) && mes == 3){
			nome = "Áries";
		}else if((dia >= 1 && dia <= 20) && mes == 4) {
			nome = "Áries";
		}
		
		// Touro
		if((dia >= 21 && dia <= 30) && mes == 4){
			nome = "Touro";
		}else if((dia >= 1 && dia <= 20) && mes == 5) {
			nome = "Touro";
		}
		
		// Gêmeos
		if((dia >= 21 && dia <= 30) && mes == 5){
			nome = "Gêmeos";
		}else if((dia >= 1 && dia <= 20) && mes == 6) {
			nome = "Gêmeos";
		}
		
		// Câncer
		if((dia >= 21 && dia <= 30) && mes == 6){
			nome = "Câncer";
		}else if((dia >= 1 && dia <= 22) && mes == 7) {
			nome = "Câncer";
		}
		
		// Leão
		if((dia >= 23 && dia <= 31) && mes == 7){
			nome = "Câncer";
		}else if((dia >= 1 && dia <= 22) && mes == 8) {
			nome = "Câncer";
		}
		
		// Virgem
		if((dia >= 23 && dia <= 31) && mes == 8){
			nome = "Virgem";
		}else if((dia >= 1 && dia <= 22) && mes == 9) {
			nome = "Virgem";
		}
		
		// Libra
		if((dia >= 23 && dia <= 30) && mes == 9){
			nome = "Libra";
		}else if((dia >= 1 && dia <= 22) && mes == 10) {
			nome = "Libra";
		}
		
		// Escorpião
		if((dia >= 23 && dia <= 31) && mes == 10){
			nome = "Escorpião";
		}else if((dia >= 1 && dia <= 21) && mes == 11) {
			nome = "Escorpião";
		}
		
		// Sagitário
		if((dia >= 22 && dia <= 30) && mes == 11){
			nome = "Sagitário";
		}else if((dia >= 1 && dia <= 21) && mes == 12) {
			nome = "Sagitário";
		}
		
		// Capricórnio
		if((dia >= 22 && dia <= 31) && mes == 12){
			nome = "Sagitário";
		}else if((dia >= 1 && dia <= 20) && mes == 1) {
			nome = "Sagitário";
		}
		
		// Aquário
		if((dia >= 21 && dia <= 31) && mes == 1){
			nome = "Aquário";
		}else if((dia >= 1 && dia <= 18) && mes == 2) {
			nome = "Aquário";
		}
		
		// Peixes
		if((dia >= 19 && dia <= 29) && mes == 2){
			nome = "Peixes";
		}else if((dia >= 1 && dia <= 20) && mes == 3) {
			nome = "Peixes";
		}
		
		// Retorno
		return nome;
	}
	
	// Mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, dia+"/"+mes+" pertence ao signo de "+signo());
	}
	

}

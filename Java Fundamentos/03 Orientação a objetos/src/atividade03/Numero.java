package atividade03;

import javax.swing.JOptionPane;

public class Numero {
	
	// Atributos
	int numero1, numero2, numero3;
	
	// Verificar o menor número
	int verificarMenor() {
		
		int menor = numero1;
		
		if(numero2 < menor) {
			menor = numero2;
		}
		
		if(numero3 < menor) {
			menor = numero3;
		}
		
		return menor;
	}
	
	// Mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, "O menor número é "+verificarMenor());
	}

}

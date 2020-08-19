package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	
	// Métodos
	void apresentacao(){
		JOptionPane.showMessageDialog(null, "Olá, meu nome é "+nome);
	}
	
	void verificarIdade() {
		JOptionPane.showMessageDialog(null, idade >= 18 ? "Maior de idade": "Menor de idade");
	}
	
}












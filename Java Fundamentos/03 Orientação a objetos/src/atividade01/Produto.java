package atividade01;

import javax.swing.JOptionPane;

public class Produto {
	
	// Atributos
	String nome;
	double valor;
	
	// Método para retornar o desconto caso seja R$100 ou mais
	double verificarDesconto() {
		return valor >= 100 ? valor * 0.9 : valor;
	}
	
	// Método para exibir o total da compra
	void mensagem() {
		JOptionPane.showMessageDialog(null, "O produto "+nome+" custará R$"+verificarDesconto());
	}

}




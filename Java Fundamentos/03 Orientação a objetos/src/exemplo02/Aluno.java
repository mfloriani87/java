package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	String nome;
	double nota1, nota2;
	
	// Método de média
	double calculoMedia() {
		return (nota1+nota2)/2;
	}
	
	// Método de situacao
	String situacao() {
		return calculoMedia() >= 7 ? "Aprovado" : "Reprovado";
	}
	
	// Método de mensagem
	void mensagem() {
		JOptionPane.showMessageDialog(null, nome+" está "+situacao()+" com média "+calculoMedia());
	}
	
}
















package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Armazenar o nome
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		// Armazenar a idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

		// Verificar se trabalha
		int trabalha = JOptionPane.showConfirmDialog(null, "Você trabalha?");
		
		// Mensagem
		String mensagem = "Nome :"+nome;
			   mensagem+= "\nIdade: "+idade;
			   mensagem+= "\nTrabalha: "+(trabalha == 0 ? "Sim" : "Não");
			   
		// Exibir mensagem
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}








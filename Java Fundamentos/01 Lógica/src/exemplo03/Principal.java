package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 30;
		double peso = 64.7;
		boolean trabalha = true;
		String nome = "Stella";
		
		String mensagem = "Nome: "+nome;
		       mensagem+= "\nIdade: "+idade;
		       mensagem+= "\nPeso: "+peso;
		       mensagem+= "\nTrabalha: "+(trabalha == true ? "Sim" : "Não");
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}

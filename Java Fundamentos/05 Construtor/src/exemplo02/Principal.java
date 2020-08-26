package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Obter dados
		String modelo = JOptionPane.showInputDialog("Informe o modelo");
		String fabricante = JOptionPane.showInputDialog("Informe o fabricante");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		
		// Objeto
		@SuppressWarnings("unused")
		Carro c = new Carro(modelo, fabricante, ano, valor);

	}

}





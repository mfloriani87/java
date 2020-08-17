package exemplo06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Obter uma média
		double media = Double.parseDouble(JOptionPane.showInputDialog("Informe a média"));
		
		// Condicional
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado(a)");
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado(a)");
		}

		/*
			>    Maior
			<    Menor
			>=   Maior ou Igual
			<=   Menor ou Igual
			==   Igual (Apenas o valor)
			===  Igual (Valor e tipo)
			!=   Diferente
		*/
		
	}

}





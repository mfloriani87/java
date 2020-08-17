package exemplo08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			JOptionPane.showMessageDialog(null, "A idade informada é "+idade);
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro: "+erro.getMessage());
		}
		
	}

}

package exemplo11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Vetor de cidades
		String[] cidades = new String[3];
		
		// Laço for
		for(int indice=0; indice<cidades.length; indice++) {
			cidades[indice] = JOptionPane.showInputDialog("Informe a "+(indice+1)+"ª cidade");
		}
		
		// Laço ForEach
		for(String linha : cidades) {
			System.out.println(linha);
		}
		

	}

}








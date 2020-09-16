package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<String> nomes = new ArrayList<String>();
		
		// Adicionar nomes
		nomes.add("Alessandra");
		nomes.add("Bernardo");
		nomes.add("Ricardo");
		
		// Alterar nome
		nomes.set(1, "Fernanda");
		
		// Remover nome
		nomes.remove(2);
		
		// Exibir a quantidade de registros
		System.out.println(nomes.size());
		
		// Listagem
		for (String n : nomes) {
			System.out.println(n);
		}

	}

}











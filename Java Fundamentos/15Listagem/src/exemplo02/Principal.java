package exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// Instânciar objetos da classe Pessoa
		Pessoa p1 = new Pessoa("Alessandra", 35);
		Pessoa p2 = new Pessoa("Fernanda", 28);
		Pessoa p3 = new Pessoa("Ricardo", 30);
		
		// Criar um ArrayList
		List<Pessoa> grupo = new ArrayList<Pessoa>();
		
		// Cadastrar pessoas
		grupo.add(p1);
		grupo.add(p2);
		grupo.add(p3);
		
		// Laço
		for(int indice=0; indice<grupo.size(); indice++) {
			//System.out.println(grupo.get(indice).getIdade());
			System.out.println(grupo.get(indice));
		}

	}

}






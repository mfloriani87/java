package exemplo04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Método para armazenar dados
		Scanner armazenar = new Scanner(System.in);
		
		// Pergunta
		System.out.println("Qual é o seu nome?");
		
		// Armazenar o nome
		String nome = armazenar.nextLine();
		
		// Exibir uma frase
		System.out.println("Bom dia "+nome);
		
		// Finalizar o armazenamento de dados
		armazenar.close();

	}

}

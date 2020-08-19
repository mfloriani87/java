package exemplo10;

public class Principal {

	public static void main(String[] args) {
		
		// Vetor
		String[] cursos = {"C#", "Java", "Python", "PHP"};
		
		// Contar cursos
		System.out.println("Há "+cursos.length+" cursos cadastrados.");
		
		// Índice
		int indice = 0;
		
		// Laço
		do {
			System.out.println(cursos[indice]);
			indice++;
		}while(indice < cursos.length);

	}

}










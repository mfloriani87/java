package exemplo02;

public class Pessoa {
	
	// Atributo
	public static int contador = 0;
	
	// Construtor
	public Pessoa() {
		contador++;
		System.out.println(contador);
	}

}

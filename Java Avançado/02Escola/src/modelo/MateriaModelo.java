package modelo;

public class MateriaModelo {

	// Atributos
	private String nome;
	
	// Construtor
	public MateriaModelo(String nome) {
		this.nome = nome;
	}
	
	// Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// toString
	public String toString() {
		return this.nome;
	}
	
}

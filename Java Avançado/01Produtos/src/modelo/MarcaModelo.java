package modelo;

public class MarcaModelo {

	// Atributos
	private String nome;
	private int codigo;
	
	// Construtor
	public MarcaModelo(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	// Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	// toString
	public String toString() {
		return this.nome;
	}
	
}

package modelo;

public class AlunoModelo {
	
	// Atributos
	private String nome, materia;
	private double nota;
	
	// Construtor
	public AlunoModelo(String nome, String materia, double nota) {
		this.nome = nome;
		this.materia = materia;
		this.nota = nota;
	}
	
	// Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMarca(String materia) {
		this.materia = materia;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}

package exercicio02;

public class Materia {
	
	// Atributos
	private String nome;
	private double nota1, nota2;

	// Construtor
	public Materia(String nomeMateria, double nota1, double nota2){
		this.nome = nomeMateria;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
		double media = media();
		String situacao = situacao(media);
		
		System.out.println(situacao+" na matéria de "+nome+" com média "+media);
	}
	
	// Média
	private double media() {
		return (nota1+nota2)/2;
	}
	
	// Situação
	private String situacao(double media) {
		return media >=7 ? "Aprovado" : "Reprovado";
	}
	
}

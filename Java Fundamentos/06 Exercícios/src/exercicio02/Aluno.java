package exercicio02;

public class Aluno {

	// Construtor
	public Aluno(double nota1, double nota2) {
		double media = media(nota1, nota2);
		String situacao = situacao(media);
		
		System.out.println(situacao+" com média "+media);
	}
	
	// Média
	private double media(double nota1, double nota2) {
		return (nota1+nota2)/2;
	}
	
	// Situação
	private String situacao(double media) {
		return media >= 7 ? "Aprovado" : "Reprovado";
	}
	
}

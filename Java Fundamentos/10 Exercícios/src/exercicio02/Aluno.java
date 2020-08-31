package exercicio02;

public class Aluno extends Materia{

	// Atributos
	private String nome, turno;
	int serie;
	
	// Construtor
	public Aluno(String nomeAluno, String turno, int serie, String nomeMateria, double nota1, double nota2) {
		super(nomeMateria, nota1, nota2);
		
		this.nome = nomeAluno;
		this.turno = turno;
		this.serie = serie;
		
		exibirDadosAluno();
	}
	
	// Exibir dados do aluno
	private void exibirDadosAluno() {
		System.out.println("Aluno: "+nome);
		System.out.println("Turno: "+turno);
		System.out.println("Série: "+serie);
	}
	
}

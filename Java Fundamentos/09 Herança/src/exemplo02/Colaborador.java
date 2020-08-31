package exemplo02;

public class Colaborador {

	// Atributos
	protected String cargo;
	protected double salario;
	
	// Construtor
	public Colaborador(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	// Retornar o I.R
	protected double ir() {
		return salario >= 2000 ? salario * 0.1 : salario * 0.05;
	}
	
	// Exibir os dados do colaborador
	protected void exibirC() {
		System.out.println("Cargo: "+cargo);
		System.out.println("Salário: "+salario);
	}
	
}






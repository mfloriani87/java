package exemplo01;

public class Colaborador {

	// Atributos
	protected String cargo;
	protected double salario;
	
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






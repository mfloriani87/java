package exemplo01;

public class Desconto {

	// Atributo
	public double salario;
	
	// Vale Transporte
	public void vt() {
		System.out.println("Vale transporte R$ "+(salario * 0.06));
	}
	
	// Imposto de Renda
	public void ir() {
		System.out.println("Desconto do IR (geral) R$ "+(salario * 0.05));
	}
	
	
}

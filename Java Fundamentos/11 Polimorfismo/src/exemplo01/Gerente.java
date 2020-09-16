package exemplo01;

public class Gerente extends Desconto{
	
	// Imposto de Renda
	public void ir() {
		System.out.println("Desconto do IR (gerente) R$ "+(salario * 0.10));
	}

	
}

package exemplo02;

public class Carro {

	// Atributo
	public double valor;
	
	// IPVA
	public void ipva() {
		System.out.println("IPVA R$"+(valor >= 20000 ? valor * 0.07 : valor * 0.04));
	}
	
	// Seguro
	public void seguro() {
		System.out.println("Seguro R$"+(valor * 0.15));
	}
	
}

package exemplo02;

public class Carro {

	// Construtor
	public Carro(String modelo, String fabricante, int ano, double valor) {
		System.out.println("Modelo: "+modelo);
		System.out.println("Fabricante: "+fabricante);
		System.out.println("Ano: "+ano);
		System.out.println("Valor: R$"+valor);
		System.out.println("IPVA: R$"+ipva(valor));
		System.out.println("Seguro R$: "+seguro(valor, fabricante));
	}
	
	// Método para retornar o IPVA
	private double ipva(double valor) {
		return valor >= 20000 ? valor * 0.05 : valor * 0.03;
	}
	
	// Método para retornar o valor do seguro
	private double seguro(double valor, String fabricante) {
		
		double valorSeguro = 0;
		
		if(fabricante.equals("Ford")) {
			valorSeguro = valor * 0.05;
		}else if(fabricante == "Renault") {
			valorSeguro = valor * 0.07;
		}else if(fabricante == "Volkswagen") {
			valorSeguro = valor * 0.03;
		}else {
			valorSeguro = valor * 0.10;
		}
		
		return valorSeguro;
		
	}
	
}









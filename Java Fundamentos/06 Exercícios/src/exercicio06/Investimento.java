package exercicio06;

public class Investimento {

	// Construtor
	public Investimento(String tipo, double valor, int tempo) {
		
		switch (tipo) {
			case "Poupança":
			System.out.println("Redimentos da poupança: R$"+poupanca(valor, tempo));
			break;
			
			case "CDB":
				System.out.println("Redimentos do CDB: R$"+cdb(valor, tempo));
			break;

			case "LCI":
				System.out.println("Redimentos da LCI: R$"+lci(valor, tempo));
			break;
		}
	}

	// Poupança
	private double poupanca(double valor, int tempo) {
		double taxa = tempo * 0.00116;
		return valor * taxa;
	}
	// CDB
	private double cdb(double valor, int tempo) {
		double taxa = tempo * 0.00158;
		
		double ganho = valor * taxa;
		
		if(tempo <= 6) {
			ganho *= 0.775;
		}else if(tempo <= 6) {
			ganho *= 0.80;
		}else if(tempo <= 6) {
			ganho *= 0.825;
		}else {
			ganho *= 0.85;
		}
		
		return ganho;
	}
	
	// LCI
	private double lci(double valor, int tempo) {
		double taxa = tempo * 0.00166;
		return valor * taxa;
	}
	
}

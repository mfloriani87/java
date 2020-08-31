package exercicio05;

public class Moeda {
	
	// Construtor
	public Moeda(String tipo, double valor) {
		
		// Retorno
		double retorno = 0;
		
		// Escolher o tipo de conversão
		switch (tipo) {
		case "Dólar para Real":
			retorno = dolarReal(valor);
		break;

		case "Real para Dólar":
			retorno = realDolar(valor);
		break;

		case "Euro para Real":
			retorno = euroReal(valor);
		break;

		case "Real para Euro":
			retorno = realEuro(valor);
		break;

		case "Libra para Real":
			retorno = libraReal(valor);
		break;

		case "Real para Libra":
			retorno = realLibra(valor);
		break;
		}
		
		// Exibir o retorno
		System.out.println(retorno);
	}

	// Dólar para Real
	private double dolarReal(double valor) {
		return valor * 5.50;
	}
	
	// Real para Dólar
	private double realDolar(double valor) {
		return valor / 5.50;
	}
	
	// Euro para Real
	private double euroReal(double valor) {
		return valor * 6.50;
	}
	
	// Real para Euro
	private double realEuro(double valor) {
		return valor / 6.50;
	}
	
	// Libra para Real
	private double libraReal(double valor) {
		return valor * 7.00;
	}
	
	// Real para Libra
	private double realLibra(double valor) {
		return valor / 7.00;
	}
	
}

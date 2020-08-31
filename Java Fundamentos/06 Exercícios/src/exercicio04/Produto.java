package exercicio04;

public class Produto {

	// Construtor
	public Produto(String nome, String categoria, double valor) {
		// Obter impostos
		double impostoFederal = impostoFederal(categoria, valor);
		double impostoEstadual = impostoEstadual(categoria, valor);
		double impostoMunicipal = impostoMunicipal(valor);
		
		// Realizar cálculo do produto sem impostos
		double semImposto = produtoSemImpostos(valor, impostoFederal, impostoEstadual, impostoMunicipal);
		
		// Mensagem
		System.out.println("O valor do produto sem impostos é R$ "+semImposto);
	}
	
	// Federal
	private double impostoFederal(String categoria, double valor) {
		// Valor do desconto
		double desconto = 0;
		
		// Condicional
		if(categoria.equals("Vestuário")) {
			if(valor > 199) {
				desconto = valor * 0.15;
			}else {
				desconto = valor * 0.10;
			}
		}else if(categoria.equals("Eletrônico")) {
			if(valor > 999) {
				desconto = valor * 0.30;
			}else {
				desconto = valor * 0.20;
			}
		}else if(categoria.equals("Alimentício")) {
			if(valor > 19.99) {
				desconto = valor * 0.10;
			}else {
				desconto = valor * 0.05;
			}
		}else {
			desconto = valor * 0.05;
		}
		
		// Retorno
		return desconto;
	}
	
	// Estadual
	private double impostoEstadual(String categoria, double valor) {
		// Valor do desconto
		double desconto = 0;
		
		// Condicional
		if(categoria.equals("Eletrônico")) {
			desconto = valor * 0.10;
		}else {
			desconto = valor * 0.05;
		}
		
		// Retorno
		return desconto;
	}

	// Municipal
	private double impostoMunicipal(double valor) {
		return valor * 0.02;
	}
	
	// Produto sem os impostos
	private double produtoSemImpostos(double valor, double impostoFederal, double impostoEstadual, double impostoMunicipal) {
		return valor - (impostoFederal + impostoEstadual + impostoMunicipal);
	}
	
	
}


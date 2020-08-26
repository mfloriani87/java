package exercicio01;

public class Imc {
	
	// Construtor
	public Imc(double peso, double altura) {
		
		// Executar cálculo
		double imc = calculoIMC(peso, altura);
		
		// Executar a situação
		String situacao = situacaoImc(imc);
		
		// Mensagem
		
		
	}

	// Cálculo de IMC
	private double calculoIMC(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	// Situação
	private String situacaoImc(double imc) {
		String situacao;
		
		if(imc <= 18.5) {
			situacao = "Abaixo do peso";
		}else if(imc <= 25) {
			situacao = "Peso normal";
		}else if(imc <= 30) {
			situacao = "Acima do peso";
		}else {
			situacao = "Obesidade";
		}
		
		return situacao;
	}
	
}







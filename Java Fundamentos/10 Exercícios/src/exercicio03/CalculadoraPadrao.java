package exercicio03;

public class CalculadoraPadrao extends CalculadoraCientifica{
	
	// Atributoss
	@SuppressWarnings("unused")
	private String operacao;
	private double numero1, numero2;

	// Construtor
	public CalculadoraPadrao(String operacao, double numero1, double numero2) {
		this.operacao = operacao;
		this.numero1 = numero1;
		this.numero2 = numero2;
		
		switch (operacao) {
			case "Soma":
			System.out.println("A soma é "+soma());
			break;
	
			case "Subtração":
			System.out.println("A subtração é "+subtracao());
			break;
	
			case "Multiplicação":
			System.out.println("A multiplicação é "+multiplicacao());
			break;
	
			case "Divisão":
			System.out.println("A divisão é "+divisao());
			break;
	
			case "Seno":
			System.out.println("O seno é "+seno(numero1));
			break;
	
			case "Cosseno":
			System.out.println("O cosseno é "+cosseno(numero1));
			break;
	
			case "Tangente":
			System.out.println("A tangente é "+tangente(numero1));
			break;
		}
		
	}
	
	// Soma
	private double soma() {
		return numero1 + numero2;
	}

	// Subtração
	private double subtracao() {
		return numero1 - numero2;
	}

	// Multiplicação
	private double multiplicacao() {
		return numero1 * numero2;
	}

	// Divisão
	private double divisao() {
		return numero1 / numero2;
	}
	
}

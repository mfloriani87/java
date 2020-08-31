package exercicio03;

public class FolhaPagamento {

	// Construtor
	public FolhaPagamento(double salario, int faltas) {
		
		// Executar métodos
		double ir = impostoRenda(salario);
		double pf = premioFaltas(faltas);
		double vt = valeTransporte(salario);
		double vr = valeRefeicao(salario);
		
		// Salário líquido
		double salarioLiquido = (salario + pf) - (ir+vt+vr);
		
		// Mensagem
		System.out.println("Imposto de renda: R$"+ir);
		System.out.println("Vale transporte: R$"+vt);
		System.out.println("Vale refeição: R$"+vr);
		System.out.println("Prêmio faltas: R$"+pf);
		System.out.println("Salário líquido: R$"+salarioLiquido);
		
	}
	
	// Imposto de renda
	private double impostoRenda(double salario) {
		double desconto = 0;
		
		if(salario <= 2000) {
			desconto = salario * 0.05;
		}else if(salario <= 3500) {
			desconto = salario * 0.07;
		}else if(salario <= 5000) {
			desconto = salario * 0.10;
		}else {
			desconto = salario * 0.12;
		}
		
		return desconto;
	}
	
	// Prêmio faltas
	private double premioFaltas(int faltas) {
		return faltas == 0 ? 100 : 0;
	}
	
	// Vale refeição
	private double valeRefeicao(double salario) {
		double ticket = 0;
		
		if(salario <= 2000) {
			ticket = 400;
		}else if(salario <= 3500) {
			ticket = 500;
		}else if(salario <= 5000) {
			ticket = 700;
		}else {
			ticket = 900;
		}
		
		return ticket;
	}
	
	// Vale transporte
	private double valeTransporte(double salario) {
		return salario * 0.06;
	}
	
	
	
}

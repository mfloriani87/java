package exercicio01;

public class Colaborador {

	// Atributos
	private String cargo;
	private double salario;
	private int faltas;
	
	// Construtor
	public Colaborador(String cargo, double salario, int faltas) {
		this.cargo = cargo;
		this.salario = salario;
		this.faltas = faltas;
		
		exibirDadosColaborador();
		
		double premioFaltas = premioFaltas();
		double impostoRenda = impostoRenda();
		double valeTransporte = valeTransporte();
		double valeRefeicao = valeRefeicao();
		double salarioLiquido = (salario + premioFaltas) - (impostoRenda+valeRefeicao+valeTransporte);
		System.out.println("O salário líquido é de: R$ "+salarioLiquido+"\n");
	}
	
	// Exibir dados
	private void exibirDadosColaborador() {
		System.out.println("Cargo: "+cargo);
		System.out.println("Salário: R$"+salario);
		System.out.println("Faltas: "+faltas);
	}
	
	// Prêmio faltas
	private double premioFaltas() {
		return faltas == 0 ? 100 : 0;
	}
	
	// Imposto de renda
	private double impostoRenda() {
		double desconto = 0;
		
		if(salario <= 1000) {
			desconto = 0;
		}else if(salario <= 2500) {
			desconto = salario * 0.05;
		}else {
			desconto = salario * 0.10;
		}

		return desconto;
	}
	
	// Vale transporte
	private double valeTransporte() {
		return salario * 0.06;
	}
	
	// Vale refeição
	private double valeRefeicao() {
		return salario <= 2000 ? salario * 0.05 : salario * 0.10;
	}
	
}

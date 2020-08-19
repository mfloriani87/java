package atividade05;

import javax.swing.JOptionPane;

public class Colaborador {

	// Atributos
	String cargo;
	int horasNormais, horasExtras;
	boolean planoSaude;
	
	// Retornar o valor dependendo do cargo
	double valorHora() {
		double valor;
		
		switch (cargo) {
			case "Gerente":
			valor = 40;
			break;
			
			case "Desenvolvedor":
			valor = 25;
			break;
			
			case "Analista":
			valor = 35;
			break;
			
			default:
			valor = 10;
		}
		
		return valor;
	}
	
	// Retornar o valor das horas normais trabalhadas
	double horasNormais() {
		return valorHora() * horasNormais;
	}
	
	// Retornar o valor das horas normais extras
	double horasExtras() {
		return valorHora() * horasExtras * 1.5;
	}
	
	// Retornar o salário bruto
	double salarioBruto() {
		return horasNormais() + horasExtras;
	}
	
	// Retornar o imposto de renda

	
	// Retornar o valor das horas normais trabalhadas
	double impostoRenda() {
		double salario = salarioBruto();
		double valor;
		
		if(salario <= 1100) {
			valor = salario * 0.1;
		}else if(salario <= 2500) {
			valor = salario * 0.15;
		}else {
			valor = salario * 0.20;
		}
		
		return valor;
	}
	
	// Retornar o vale transporte
	double valeTransporte() {
		return salarioBruto() * 0.06;
	}
	
	// Desconto do plano de saúde
	double calculoPlanoSaude() {
		return planoSaude == true ? salarioBruto() - 300 : 0;
	}
	
	// Salário líquido
	double salarioLiquido() {
		return salarioBruto() - (impostoRenda() + valeTransporte() + calculoPlanoSaude());
	}
	
	// Mensagem
	void mensagem() {
		String mensagem = "Cargo: "+cargo;
			   mensagem+= "\nSalário Bruto: R$"+salarioBruto();
			   mensagem+= "\nImposto de Renda: R$"+impostoRenda();
			   mensagem+= "\nVale Transporte: R$"+valeTransporte();
			   mensagem+= "\nPlano de Saúde: R$"+calculoPlanoSaude();
			   mensagem+= "\nSalário Líquido: R$"+salarioLiquido();
			   
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
}

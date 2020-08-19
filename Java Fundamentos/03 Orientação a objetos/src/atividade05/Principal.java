package atividade05;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciar objeto da classe Colaborador
		Colaborador c = new Colaborador();
		c.cargo = "Gerente";
		c.horasNormais = 100;
		c.horasExtras = 10;
		c.planoSaude = false;
		c.mensagem();
		
	}
	
}

package exemplo;

public class Gerente extends Padrao{
	
	// Atributo
	private double salario;
	private int faltas;
	
	// Construtor
	public Gerente(double salario, int faltas) {
		this.salario = salario;
		this.faltas = faltas;
		
		System.out.println("IR R$ "+ir());
		System.out.println("VT R$ "+vt());
		System.out.println("VR R$ "+vr());
		System.out.println("PF R$ "+premioFaltas(this.faltas));
	}
	
	// Métodos
	@Override
	public double ir() {
		return salario * 0.10;
	}

	@Override
	public double vr() {
		return salario * 0.05;
	}

	@Override
	public double vt() {
		return salario * 0.07;
	}

}

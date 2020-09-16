package exemplo;

public class Atendente extends Padrao{
	
	// Atributo
	private double salario;
	private int faltas;
	
	// Construtor
	public Atendente(double salario, int faltas) {
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
		// TODO Auto-generated method stub
		return salario * 0.08;
	}

	@Override
	public double vr() {
		// TODO Auto-generated method stub
		return salario * 0.03;
	}

	@Override
	public double vt() {
		// TODO Auto-generated method stub
		return salario * 0.04;
	}


}

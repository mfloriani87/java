package exemplo;

public abstract class Padrao {
	
	public double premioFaltas(int faltas) {
		return faltas == 0 ? 100 : 0;
	}

	public abstract double vt();
	
	public abstract double ir();
	
	public abstract double vr();
	
}

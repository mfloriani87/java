package exemplo;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Gerente g = new Gerente(1000, 0);
	
		System.out.println("--------------------------");
		
		Atendente a = new Atendente(1000, 1);
	}
	
}

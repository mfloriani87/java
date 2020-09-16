package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		Desconto obj1 = new Desconto();
		obj1.salario = 2000;
		obj1.vt();
		obj1.ir();
		
		Desconto obj2 = new Gerente();
		obj2.salario = 2000;
		obj2.vt();
		obj2.ir();
		
	}

}

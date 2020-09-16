package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Carro c = new CarroEletrico();
		c.valor = 100000;
		c.ipva();
		c.seguro();

	}

}

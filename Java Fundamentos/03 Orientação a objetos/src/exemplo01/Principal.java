package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciar um objeto da classe Pessoa
		Pessoa objeto = new Pessoa();
		objeto.nome = "Ralf";
		objeto.idade = 30;
		objeto.apresentacao();
		objeto.verificarIdade();

	}

}

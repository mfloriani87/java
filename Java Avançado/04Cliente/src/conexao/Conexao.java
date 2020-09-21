package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	// Atributo contendo o acesso ao bd
		public static Connection con;
		
		// Abrir a conexão
		public static void abrirConexao() {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/cliente_projeto", "root", "ralflima");
				
				System.out.println("Conexão ok");
			}catch(Exception erro) {
				System.out.println("Falha ao conectar");
			}
		}
		
		// Fechar a conexão
		public static void fecharConexao() {
			try {
				con.close();
			}catch(Exception erro) {}
		}
	
}

package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import conexao.Conexao;
import modelo.ClienteModelo;

public class ClienteControle {
	
	// Cadastrar cliente
	public static int cadastrarCliente(ClienteModelo obj) {
		
		// Código gerado pelo banco
		int codigo = 0;
		
		// Tentativa
		try {
			
			// Conectar ao banco
			Conexao.abrirConexao();
			
			// SQL
			String sql = "INSERT INTO clientes (nome, email, telefone) VALUES (?, ?, ?)";
			
			// PreaparedStatement
			PreparedStatement pstmt = Conexao.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			// Passar os parâmetros
			pstmt.setString(1, obj.getNome());
			pstmt.setString(2, obj.getEmail());
			pstmt.setString(3, obj.getTelefone());
			
			// Executar e retornar informações do cadastro
			pstmt.executeUpdate();
			
			// Obter dados inseridos na tabela
			ResultSet rs = pstmt.getGeneratedKeys();
			
			// Obter a primeira coluna da tabela
			rs.next();
			codigo = rs.getInt(1);
			
		}catch(Exception erro) {
			System.out.println("Falha ao cadastrar "+erro.getMessage());
		}finally {
			Conexao.fecharConexao();
		}
		
		// Retonar código
		return codigo;
		
	}

}

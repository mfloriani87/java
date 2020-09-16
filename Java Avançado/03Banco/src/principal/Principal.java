package principal;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import bd.Conexao;

import java.awt.EventQueue;
import formulario.Formulario;

public class Principal {

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		// Cadastrar usuários
		/*try {
			String sql = "INSERT INTO usuarios (nome, idade) VALUES (?, ?)";
			
			Conexao.abrirConexao();
			
			PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
			pstmt.setString(1, "Camila");
			pstmt.setInt(2, 34);
			
			pstmt.execute();
			
			System.out.println("Cadastro ok");
		}catch (Exception erro) {
			System.out.println("Falha ao cadastrar "+erro.getMessage());
		}finally {
			Conexao.fecharConexao();
		}*/
		
		
		// Alterar usuários
		/*try {
			String sql = "UPDATE usuarios SET nome=?, idade=? WHERE codigo = ?";
			
			Conexao.abrirConexao();
			
			PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
			pstmt.setString(1, "Jéssica");
			pstmt.setInt(2, 29);
			pstmt.setInt(3, 2);
			
			pstmt.execute();
			
			System.out.println("Alterado ok");
		}catch (Exception erro) {
			System.out.println("Falha ao alterar "+erro.getMessage());
		}finally {
			Conexao.fecharConexao();
		}*/
		
		// Excluir usuários
		/*try {
			String sql = "DELETE FROM usuarios WHERE codigo = ?";
			
			Conexao.abrirConexao();
			
			PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
			pstmt.setInt(1, 2);
			
			pstmt.execute();
			
			System.out.println("Removido ok");
		}catch (Exception erro) {
			System.out.println("Falha ao remover "+erro.getMessage());
		}finally {
			Conexao.fecharConexao();
		}*/
		
		// Selecionar usuários
		/*try {
			String sql = "SELECT * FROM usuarios";
			
			Conexao.abrirConexao();
			
			Statement stmt = Conexao.con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString(2) + " " + rs.getInt(3));
			}
			
		}catch(Exception erro) {
			System.out.println("Falha ao selecionar");
		}finally {
			Conexao.fecharConexao();
		}*/
		

	}

}















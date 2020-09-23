package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import conexao.Conexao;
import lista.ClienteLista;
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
			
			// Cadastrar um novo cliente no ArrayList
			ClienteModelo obj_cliente = new ClienteModelo(
					codigo, 
					obj.getNome(), 
					obj.getEmail(), 
					obj.getTelefone()
			);
			ClienteLista.lista.add(obj_cliente);
			
			for(int i=0; i<ClienteLista.lista.size(); i++) {
				System.out.println(ClienteLista.lista.get(i).getNome());
			}
			
		}catch(Exception erro) {
			System.out.println("Falha ao cadastrar "+erro.getMessage());
		}finally {
			Conexao.fecharConexao();
		}
		
		// Retonar código
		return codigo;
		
	}

	// Selecionar clientes
	public static DefaultTableModel listarClientes() {
		
		// Objeto DefaultTableModel
		DefaultTableModel dados = new DefaultTableModel();
		
		// Definir colunas
		dados.addColumn("Código");
		dados.addColumn("Nome");
		dados.addColumn("E-mail");
		dados.addColumn("Telefone");
		
		// Tentativa
		try {
			
			// Conectar ao banco
			Conexao.abrirConexao();
			
			// SQL
			String sql = "SELECT * FROM clientes";
			
			// PreaparedStatement
			Statement stmt = Conexao.con.createStatement();
			
			// Executar e retornar informações da tabela
			ResultSet rs = stmt.executeQuery(sql);
			
			// Adicionar clientes no ArrayList
			while(rs.next()) {
				
				// Obter dados
				int codigo = rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String telefone = rs.getString(4);
				
				// Criar um objeto
				ClienteModelo obj = new ClienteModelo(codigo, nome, email, telefone);
				
				// Adicionar objeto na listagem
				ClienteLista.lista.add(obj);
				
			}
			
			// Adicionar os dados no DefaultTableModel
			for(int indice=0; indice<ClienteLista.lista.size(); indice++) {
				
				dados.addRow(new Object[] {
						ClienteLista.lista.get(indice).getCodigo(),
						ClienteLista.lista.get(indice).getNome(),
						ClienteLista.lista.get(indice).getEmail(),
						ClienteLista.lista.get(indice).getTelefone(),
				});
				
			}
			
		}catch(Exception erro) {
			System.out.println("Falha ao selecionar "+erro.getMessage());
		}finally {
			Conexao.fecharConexao();
		}
		
		// Retornar o DefaultTableModel
		return dados;
				
	}
	
}

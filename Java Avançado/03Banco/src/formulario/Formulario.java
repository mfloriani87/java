package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.Conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;


	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(22, 31, 61, 16);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(22, 66, 61, 16);
		contentPane.add(lblIdade);
		
		txtNome = new JTextField();
		txtNome.setBounds(79, 26, 348, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(79, 61, 348, 26);
		contentPane.add(txtIdade);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter o nome e a idade
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				
				try {
					String sql = "INSERT INTO usuarios (nome, idade) VALUES (?, ?)";
					
					Conexao.abrirConexao();
					
					PreparedStatement pstmt = Conexao.con.prepareStatement(sql);
					pstmt.setString(1, nome);
					pstmt.setInt(2, idade);
					
					pstmt.execute();
					
					JOptionPane.showMessageDialog(null,"Cadastro ok");
				}catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar "+erro.getMessage());
				}finally {
					Conexao.fecharConexao();
				}
				
			}
		});
		btnEnviar.setBounds(149, 99, 117, 29);
		contentPane.add(btnEnviar);
	}
}








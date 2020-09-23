package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ClienteControle;
import modelo.ClienteModelo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class ClienteFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public ClienteFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(38, 32, 61, 16);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(38, 60, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(38, 88, 61, 16);
		contentPane.add(lblTelefone);
		
		txtNome = new JTextField();
		txtNome.setBounds(107, 27, 325, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(107, 55, 325, 26);
		contentPane.add(txtEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(107, 83, 325, 26);
		contentPane.add(txtTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				String nome = txtNome.getText();
				String email = txtEmail.getText();
				String telefone = txtTelefone.getText();
				
				// Objeto da classe ClienteModelo
				ClienteModelo obj = new ClienteModelo(nome, email, telefone);
				
				// Executar o cadastro
				int codigo = ClienteControle.cadastrarCliente(obj);
				
			}
		});
		btnCadastrar.setBounds(6, 125, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(117, 125, 117, 29);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(228, 125, 117, 29);
		contentPane.add(btnExcluir);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setEnabled(false);
		Cancelar.setBounds(338, 125, 117, 29);
		contentPane.add(Cancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 171, 435, 148);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(ClienteControle.listarClientes());
		scrollPane.setViewportView(table);
	}
}

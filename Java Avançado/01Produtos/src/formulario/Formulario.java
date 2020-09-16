package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.MarcaControle;
import controle.ProdutoControle;
import modelo.MarcaModelo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(26, 31, 61, 16);
		contentPane.add(lblProduto);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(99, 26, 325, 26);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(26, 71, 61, 16);
		contentPane.add(lblMarca);
		
		JComboBox<MarcaModelo> cbxMarca = new JComboBox<MarcaModelo>();
		cbxMarca.setModel(MarcaControle.listar());
		cbxMarca.setBounds(99, 67, 325, 27);
		contentPane.add(cbxMarca);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(26, 114, 61, 16);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(99, 109, 325, 26);
		contentPane.add(txtValor);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(178, 147, 117, 29);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 210, 398, 174);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(ProdutoControle.listar());
		scrollPane.setViewportView(table);
	}
}











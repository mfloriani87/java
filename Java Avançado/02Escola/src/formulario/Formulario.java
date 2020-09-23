package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.MateriaControle;
import controle.AlunoControle;
import modelo.MateriaModelo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota;
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
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(26, 31, 61, 16);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(99, 26, 325, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblMateria = new JLabel("Matéria");
		lblMateria.setBounds(26, 71, 61, 16);
		contentPane.add(lblMateria);
		
		JComboBox<MateriaModelo> cbxMateria = new JComboBox<MateriaModelo>();
		cbxMateria.setModel(MateriaControle.listar());
		cbxMateria.setBounds(99, 67, 325, 27);
		contentPane.add(cbxMateria);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setBounds(26, 114, 61, 16);
		contentPane.add(lblNota);
		
		txtNota = new JTextField();
		txtNota.setColumns(10);
		txtNota.setBounds(99, 109, 325, 26);
		contentPane.add(txtNota);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(178, 147, 117, 29);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 210, 398, 174);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(AlunoControle.listar());
		scrollPane.setViewportView(table);
	}
}











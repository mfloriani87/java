package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.GameController;
import model.GameModel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Form extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTable tblJogos;

	// Construtor
	public Form() {
		// Características básicas do formulário
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Abas
		JTabbedPane tbpAbas = new JTabbedPane(JTabbedPane.TOP);
		tbpAbas.setBounds(6, 6, 548, 308);
		contentPane.add(tbpAbas);
		
		// Segunda aba
		JPanel pnlListar = new JPanel();
		tbpAbas.addTab("Listagem", null, pnlListar, null);
		pnlListar.setLayout(null);
		
		JScrollPane scpJogos = new JScrollPane();
		scpJogos.setBounds(6, 6, 515, 250);
		pnlListar.add(scpJogos);
		
		
		tblJogos = new JTable();
		tblJogos.setModel(GameController.listGames());
		scpJogos.setViewportView(tblJogos);
		
		// Primeira aba
		JPanel pnlCadastro = new JPanel();
		
		tbpAbas.addTab("Cadastro", null, pnlCadastro, null);
		pnlCadastro.setLayout(null);
		
		JLabel lblPlacar = new JLabel("Placar");
		lblPlacar.setBounds(22, 23, 61, 16);
		pnlCadastro.add(lblPlacar);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(77, 18, 430, 26);
		pnlCadastro.add(txt1);
		
		JLabel lblMinimoTemporada = new JLabel("Mínimo da temporada");
		lblMinimoTemporada.setBounds(22, 59, 169, 16);
		pnlCadastro.add(lblMinimoTemporada);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(177, 54, 328, 26);
		pnlCadastro.add(txt2);
		
		JLabel lblMaximoTemporada = new JLabel("Máximo da temporada");
		lblMaximoTemporada.setBounds(22, 98, 169, 16);
		pnlCadastro.add(lblMaximoTemporada);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(179, 93, 328, 26);
		pnlCadastro.add(txt3);
		
		JLabel lblQueraRecordMinimo = new JLabel("Quebra de recorde mínimo");
		lblQueraRecordMinimo.setBounds(22, 133, 169, 16);
		pnlCadastro.add(lblQueraRecordMinimo);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(203, 128, 303, 26);
		pnlCadastro.add(txt4);
		
		JLabel lblQuebraRecordMaximo = new JLabel("Quebra de recorde máxima");
		lblQuebraRecordMaximo.setBounds(22, 172, 169, 16);
		pnlCadastro.add(lblQuebraRecordMaximo);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(203, 167, 303, 26);
		pnlCadastro.add(txt5);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Get data
				int score = Integer.parseInt(txt1.getText());
				int minSeason = Integer.parseInt(txt2.getText());
				int maxSeason = Integer.parseInt(txt3.getText());
				int minRecord = Integer.parseInt(txt4.getText());
				int maxRecord = Integer.parseInt(txt5.getText());
				
				// Create object
				GameModel gm = new GameModel(score, minSeason, maxSeason, minRecord, maxRecord);
				
				// Insert
				GameController.addGame(gm);
				
				// Update Table
				tblJogos.setModel(GameController.listGames());
				
			}
		});
		btnCadastrar.setBounds(187, 205, 117, 29);
		pnlCadastro.add(btnCadastrar);
		
		
	}
}

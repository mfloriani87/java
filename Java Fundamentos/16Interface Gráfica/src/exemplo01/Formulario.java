package exemplo01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
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
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(24, 35, 61, 16);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 30, 328, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setEnabled(false);
		btnEnviar.setBounds(153, 68, 117, 29);
		contentPane.add(btnEnviar);
		
		JLabel lblMensagem = new JLabel("");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setForeground(Color.RED);
		lblMensagem.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblMensagem.setBounds(6, 109, 438, 37);
		contentPane.add(lblMensagem);
		
		// Açao no botão
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Bom dia "+txtNome.getText());
			}
		});
		
		// Ação no txtNome
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				// Capturar o valor no campo nome
				String nome = txtNome.getText();
				
				// Número mínimo de caracteres
				if(nome.length() >= 3) {
					btnEnviar.setEnabled(true);
				}else {
					btnEnviar.setEnabled(false);
				}
				
			}
		});
	}
}

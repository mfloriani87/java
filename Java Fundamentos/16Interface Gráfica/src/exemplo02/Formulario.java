package exemplo02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

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
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 01");
		lblNota1.setBounds(21, 24, 61, 16);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 02");
		lblNota2.setBounds(21, 62, 61, 16);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 03");
		lblNota3.setBounds(21, 105, 61, 9);
		contentPane.add(lblNota3);
		
		txtNota1 = new JTextField();
		txtNota1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				// Remover o sinal negativo
				if(e.getKeyCode() == 45) {
					txtNota1.setText("");
				}
				
				// Validar se há algum número maior que 10
				if(txtNota1.getText().length() > 2) {
					JOptionPane.showMessageDialog(null, "A nota deve ter no máximo dois dígitos");
					txtNota1.setText("");
				}else if(txtNota1.getText().length() == 2) {
					if(Double.parseDouble(txtNota1.getText()) > 10) {
						JOptionPane.showMessageDialog(null, "O nota máxima é 10");
						txtNota1.setText("");
					}
				}
				
			}
		});
		txtNota1.setBounds(82, 19, 347, 26);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(82, 57, 347, 26);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(82, 96, 347, 26);
		contentPane.add(txtNota3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(157, 134, 117, 29);
		contentPane.add(btnCalcular);
		
		JLabel lblMensagem = new JLabel("");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setBounds(21, 185, 408, 16);
		contentPane.add(lblMensagem);
		
		
		// Realizar ação para retornar a média e a situação
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter notas
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				double nota3 = Double.parseDouble(txtNota3.getText());
				
				// Média
				double media = (nota1 + nota2 + nota3) / 3;
				
				// Situação
				String situacao;
				if(media>= 7) {
					situacao = "Aprovado(a)";
				}else if(media >= 5) {
					situacao = "Em Exame";
				}else {
					situacao = "Reprovado(a)";
				}
				
				// Formatar casas
				DecimalFormat df = new DecimalFormat("#.0");
				String mediaFormatada = df.format(media);
				
				// Exibição
				lblMensagem.setText(situacao+" com média "+mediaFormatada);
				
			}
		});
		
	}
}

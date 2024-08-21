package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Logeo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(127, 29, 178, 25);
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(23, 93, 58, 14);
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(23, 155, 76, 14);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(SystemColor.desktop);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(127, 88, 128, 20);
		txtUsuario.setBackground(Color.WHITE);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(127, 150, 128, 20);
		jpassClave.setBackground(Color.WHITE);
		contentPane.add(jpassClave);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.setBounds(304, 113, 89, 36);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			handle_btnNewButton_actionPerformed(e);
		}
	}
	protected void handle_btnNewButton_actionPerformed(ActionEvent e) {
		
		char[] clave = jpassClave.getPassword();
		String claveFinal = new String(clave);
		
		if(txtUsuario.getText().equals("Mela") && claveFinal.equals("0802")) {
			dispose();
			JOptionPane.showMessageDialog(null,"Bienvenido al sistema", "INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
			Principal p = new Principal();
			p.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
			
			txtUsuario.setText("");
			jpassClave.setText("");
			txtUsuario.requestFocus();
			
		}
		
		
	}
}	

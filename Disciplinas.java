package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Disciplinas extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disciplinas frame = new Disciplinas();
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
	public Disciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 80, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("APELLIDOS");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_1.setBounds(28, 126, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AREA");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_2.setBounds(28, 169, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS DEL CLIENTE");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(104, 27, 230, 23);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(123, 75, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 121, 178, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(123, 164, 177, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(335, 136, 89, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("CODIGO");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_4.setBounds(28, 215, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(123, 216, 178, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
	
		
	protected void handle_btnNewButton_1_actionPerformed(ActionEvent e) {
		String Nombre;
		String Apellidos;
		String Area;
		String Codigo;
		
		public Disciplinas(String Nombre, String Apellidos, String Area, String Codigo) {
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Area = Area;
		this.Codigo = Codigo;
	}
		public String getNombre() {
			return Nombre;
		}
		public String getApellido() {
			return Apllidos;
		}
		public String getArea() {
			return Area;
		}
		public String getCodigo() {
			return Codigo;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


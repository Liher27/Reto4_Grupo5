package errakamusic.vistas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Errekamusic_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_Login;
	private JTextField textField_Usuario;
	private JTextField textField_Contraseña;
	private JLabel lbl_Logo1;
	private JLabel lbl_Usuario;
	private JLabel lbl_Contraseña;
	private JButton btnLogin;
	private JButton btnRegistro;
	private JLabel lbl_FondoLogin;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Errekamusic_Login frame = new Errekamusic_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Errekamusic_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1530, 880);

		panel_Login = new JPanel();
		panel_Login.setBounds(0, 0, 1514, 841);
		getContentPane().add(panel_Login);
		panel_Login.setLayout(null);
		
		lbl_Logo1 = new JLabel("");
		lbl_Logo1.setBounds(10, 11, 118, 114);
		panel_Login.add(lbl_Logo1);
		//lbl_Logo1.setIcon(new ImageIcon(Errekamusic_Login.class.getResource("/images/LogoSmall.png")));
		panel_Login.setLayout(null);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setBounds(714, 249, 234, 40);
		panel_Login.add(textField_Usuario);
		textField_Usuario.setColumns(10);
		
		lbl_Usuario = new JLabel("Usuario");
		lbl_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_Usuario.setBounds(541, 259, 74, 14);
		panel_Login.add(lbl_Usuario);
		
		textField_Contraseña = new JTextField();
		textField_Contraseña.setBounds(714, 348, 234, 40);
		panel_Login.add(textField_Contraseña);
		textField_Contraseña.setColumns(10);
		
		lbl_Contraseña = new JLabel("Contraseña");
		lbl_Contraseña.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_Contraseña.setBounds(541, 358, 96, 14);
		panel_Login.add(lbl_Contraseña);
		
		btnLogin = new JButton("Aceptar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AQUI SE COMPRUEBA SI EXISTE EL USUARIO Y SI NO SE LE LLEVA AL REGISTRO
				
			}
		});
		
		btnLogin.setBounds(560, 492, 89, 30);
		panel_Login.add(btnLogin);
		
		btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Errekamusic_Registro registro = new Errekamusic_Registro();
				registro.setVisible(true);
				dispose();
			}
		});
		
		btnRegistro.setBounds(700, 492, 89, 30);
		panel_Login.add(btnRegistro);
		
		lbl_FondoLogin = new JLabel("");
		lbl_FondoLogin.setBounds(432, 144, 644, 543);
		panel_Login.add(lbl_FondoLogin);  
		//lbl_FondoLogin.setIcon(new ImageIcon(Errekamusic_Login.class.getResource("/images/cuadroVerde.png")));

	}
}

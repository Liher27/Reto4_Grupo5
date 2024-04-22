package errakamusic.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.TextField;
import javax.swing.DefaultComboBoxModel;

public class Errekamusic_Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_Registro;
	private JTextField textF_Nombre;
	private JTextField textF_Apellido;
	private JTextField textF_Apellido2;
	private JTextField textF_DNI;
	private JTextField textF_Nacimiento;
	private JTextField textF_Direccion;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textProvincia;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Errekamusic_Registro frame = new Errekamusic_Registro();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Errekamusic_Registro() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1530, 880);
		panel_Registro = new JPanel();
		panel_Registro.setBackground(new Color(245, 245, 245));
		panel_Registro.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_Registro);
		panel_Registro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblNewLabel.setBounds(64, 114, 141, 38);
		panel_Registro.add(lblNewLabel);
		
		JLabel lblApellido1 = new JLabel("Apellido:");
		lblApellido1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblApellido1.setBounds(63, 149, 99, 38);
		panel_Registro.add(lblApellido1);
		
		JLabel lblApellido2 = new JLabel("Apellido2:");
		lblApellido2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblApellido2.setBounds(61, 185, 99, 38);
		panel_Registro.add(lblApellido2);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblDni.setBounds(63, 222, 141, 38);
		panel_Registro.add(lblDni);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblFechaNacimiento.setBounds(64, 256, 205, 38);
		panel_Registro.add(lblFechaNacimiento);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblDireccion.setBounds(64, 293, 141, 38);
		panel_Registro.add(lblDireccion);
		
		textF_Nombre = new JTextField();
		textF_Nombre.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Nombre.setBounds(244, 114, 280, 29);
		panel_Registro.add(textF_Nombre);
		textF_Nombre.setColumns(10);
		
		textF_Apellido = new JTextField();
		textF_Apellido.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Apellido.setColumns(10);
		textF_Apellido.setBounds(244, 149, 280, 29);
		panel_Registro.add(textF_Apellido);
		
		textF_Apellido2 = new JTextField();
		textF_Apellido2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Apellido2.setColumns(10);
		textF_Apellido2.setBounds(244, 188, 280, 29);
		panel_Registro.add(textF_Apellido2);
		
		textF_DNI = new JTextField();
		textF_DNI.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_DNI.setColumns(10);
		textF_DNI.setBounds(243, 225, 280, 29);
		panel_Registro.add(textF_DNI);
		
		textF_Nacimiento = new JTextField();
		textF_Nacimiento.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Nacimiento.setColumns(10);
		textF_Nacimiento.setBounds(243, 261, 280, 29);
		panel_Registro.add(textF_Nacimiento);
		
		JButton btn_panelCines = new JButton("Siguiente");
		btn_panelCines.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_panelCines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Errekamusic_Login registro = new Errekamusic_Login();
				registro.setVisible(true);
				dispose();
			}
		});
		btn_panelCines.setBounds(175, 714, 172, 43);
		panel_Registro.add(btn_panelCines);
		
		JButton btn_Registro = new JButton("Registrarse");
		btn_Registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//OBTENER LOS DATOS VALIDAR QUE ESTAN BIEN Y GUARDAR
			}
		});
		btn_Registro.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_Registro.setBounds(1172, 759, 172, 41);
		panel_Registro.add(btn_Registro);
		
		JLabel lbl_Informativo = new JLabel("¿Ya tienes cuenta?");
		lbl_Informativo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Informativo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		lbl_Informativo.setBounds(175, 674, 180, 29);
		panel_Registro.add(lbl_Informativo);
		
		textF_Direccion = new JTextField();
		textF_Direccion.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textF_Direccion.setColumns(10);
		textF_Direccion.setBounds(243, 298, 280, 29);
		panel_Registro.add(textF_Direccion);
		
		JLabel lblCodigoPostal = new JLabel("Código Postal:");
		lblCodigoPostal.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblCodigoPostal.setBounds(64, 332, 141, 38);
		panel_Registro.add(lblCodigoPostal);
		
		textField = new JTextField();
		textField.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(243, 337, 280, 29);
		panel_Registro.add(textField);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblCiudad.setBounds(64, 372, 141, 38);
		panel_Registro.add(lblCiudad);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(244, 377, 280, 29);
		panel_Registro.add(textField_1);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblProvincia.setBounds(62, 411, 141, 38);
		panel_Registro.add(lblProvincia);
		
		textProvincia = new JTextField();
		textProvincia.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textProvincia.setColumns(10);
		textProvincia.setBounds(244, 417, 280, 29);
		panel_Registro.add(textProvincia);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblUsuario.setBounds(755, 114, 141, 38);
		panel_Registro.add(lblUsuario);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(906, 119, 280, 29);
		panel_Registro.add(textField_2);
		
		JLabel lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblContrasenia.setBounds(755, 158, 116, 38);
		panel_Registro.add(lblContrasenia);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(906, 158, 280, 29);
		panel_Registro.add(textField_3);
		
		JLabel lblContrasea = new JLabel("Contraseña 2:");
		lblContrasea.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblContrasea.setBounds(755, 202, 141, 38);
		panel_Registro.add(lblContrasea);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(906, 207, 280, 29);
		panel_Registro.add(textField_4);
		
		JLabel lblTipoUsuario = new JLabel("Tipo Usuario:");
		lblTipoUsuario.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblTipoUsuario.setBounds(753, 239, 141, 38);
		panel_Registro.add(lblTipoUsuario);
		
		JComboBox comboBoxTipoUsuario = new JComboBox();
		comboBoxTipoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Usuario Libre", "Usuario Premium"}));
		comboBoxTipoUsuario.setBounds(906, 249, 280, 29);
		panel_Registro.add(comboBoxTipoUsuario);
		
		JPanel panel = new JPanel();
		panel.setBounds(750, 299, 735, 284);
		panel_Registro.add(panel);
		panel.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(192, 16, 280, 29);
		panel.add(textField_5);
		
		JLabel lblNmeroDeCuenta = new JLabel("Número de cuenta: ");
		lblNmeroDeCuenta.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblNmeroDeCuenta.setBounds(10, 11, 189, 38);
		panel.add(lblNmeroDeCuenta);
		
		JLabel lblCaducidad = new JLabel("Caducidad:");
		lblCaducidad.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblCaducidad.setBounds(10, 79, 189, 38);
		panel.add(lblCaducidad);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(192, 84, 280, 29);
		panel.add(textField_6);
		
		JLabel lblCvvcvc = new JLabel("CVV/CVC:");
		lblCvvcvc.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblCvvcvc.setBounds(10, 148, 189, 38);
		panel.add(lblCvvcvc);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(192, 153, 280, 29);
		panel.add(textField_7);
		
		JButton btn_Cancelar = new JButton("Cancelar");
		btn_Cancelar.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_Cancelar.setBounds(888, 759, 172, 38);
		panel_Registro.add(btn_Cancelar);
		btn_Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Errekamusic_Login login = new Errekamusic_Login();
				login.setVisible(true);
				dispose();
			}
		});
			
		}
	}

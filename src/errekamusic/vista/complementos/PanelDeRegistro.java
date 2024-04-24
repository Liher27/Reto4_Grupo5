
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//import cinesElorrieta.logica.GestorDeCliente;
//import cinesElorrieta.logica.Session;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPasswordField;

/**
 * El panel para registro con los datos que ha introducido el usuario
 */
public class PanelDeRegistro {

	private JPanel panelDeRegistro;

	private JTextField passwordFieldContrasenyaRegistro;
	private JPasswordField passwordFieldConfirmarContrasenyaRegistro;
	
	/**
	 * panel principal 
	 */
	public PanelDeRegistro() {
		panelDeRegistro = new JPanel();
		panelDeRegistro.setBounds(0, 0, 984, 611);
		panelDeRegistro.setBackground(new Color(192, 192, 192));
		panelDeRegistro.setLayout(null);

		JLabel lblDNIRegistro = new JLabel("DNI");
		lblDNIRegistro.setForeground(new Color(0, 0, 0));
		lblDNIRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDNIRegistro.setBounds(44, 118, 86, 43);
		panelDeRegistro.add(lblDNIRegistro);

		JLabel lblNombreRegistro = new JLabel("Nombre");
		lblNombreRegistro.setForeground(new Color(0, 0, 0));
		lblNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombreRegistro.setBounds(44, 172, 86, 27);
		panelDeRegistro.add(lblNombreRegistro);

		JLabel lblPrimerApellidoRegistro = new JLabel("Primer apellido");
		lblPrimerApellidoRegistro.setForeground(new Color(0, 0, 0));
		lblPrimerApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPrimerApellidoRegistro.setBounds(44, 210, 176, 32);
		panelDeRegistro.add(lblPrimerApellidoRegistro);

		JLabel lblSegundoApellidoRegistro = new JLabel("Segundo Apellido");
		lblSegundoApellidoRegistro.setForeground(new Color(0, 0, 0));
		lblSegundoApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSegundoApellidoRegistro.setBounds(44, 253, 176, 32);
		panelDeRegistro.add(lblSegundoApellidoRegistro);

		JLabel lblContrasenyaRegistro = new JLabel("Contraseña");
		lblContrasenyaRegistro.setForeground(new Color(0, 0, 0));
		lblContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblContrasenyaRegistro.setBounds(44, 296, 159, 31);
		panelDeRegistro.add(lblContrasenyaRegistro);

		JLabel lblConfirmarContrasenyaRegistro = new JLabel("Confirmar contraseña");
		lblConfirmarContrasenyaRegistro.setForeground(new Color(0, 0, 0));
		lblConfirmarContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConfirmarContrasenyaRegistro.setBounds(44, 338, 209, 27);
		panelDeRegistro.add(lblConfirmarContrasenyaRegistro);

		JLabel lblDireccionRegistro = new JLabel("Direccion");
		lblDireccionRegistro.setForeground(new Color(0, 0, 0));
		lblDireccionRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDireccionRegistro.setBounds(44, 419, 230, 32);
		panelDeRegistro.add(lblDireccionRegistro);
		
		JLabel lblFechNacRegistro = new JLabel("Fecha de Nacimiento");
		lblFechNacRegistro.setForeground(Color.BLACK);
		lblFechNacRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFechNacRegistro.setBounds(44, 376, 230, 32);
		panelDeRegistro.add(lblFechNacRegistro);
		
		JLabel lblCodigoPostalRegistro = new JLabel("Codigo Postal");
		lblCodigoPostalRegistro.setForeground(Color.BLACK);
		lblCodigoPostalRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCodigoPostalRegistro.setBounds(44, 462, 159, 31);
		panelDeRegistro.add(lblCodigoPostalRegistro);

		JTextField textFieldDNIRegistro = new JTextField();
		textFieldDNIRegistro.setBounds(289, 134, 176, 20);
		panelDeRegistro.add(textFieldDNIRegistro);
		textFieldDNIRegistro.setColumns(10);

		JTextField textFieldNombreRegistro = new JTextField();
		textFieldNombreRegistro.setBounds(289, 180, 176, 20);
		panelDeRegistro.add(textFieldNombreRegistro);
		textFieldNombreRegistro.setColumns(10);

		JTextField textFieldPrimerApellidoRegistro = new JTextField();
		textFieldPrimerApellidoRegistro.setBounds(289, 221, 176, 20);
		panelDeRegistro.add(textFieldPrimerApellidoRegistro);
		textFieldPrimerApellidoRegistro.setColumns(10);

		JTextField textFieldSegundoApellidoRegistro = new JTextField();
		textFieldSegundoApellidoRegistro.setBounds(289, 264, 176, 20);
		panelDeRegistro.add(textFieldSegundoApellidoRegistro);
		textFieldSegundoApellidoRegistro.setColumns(10);

		JTextField textFieldFechNac = new JTextField();
		textFieldFechNac.setBounds(289, 387, 176, 20);
		panelDeRegistro.add(textFieldFechNac);
		textFieldFechNac.setColumns(10);
		
		JTextField textFieldDireccionRegistro = new JTextField();
		textFieldDireccionRegistro.setColumns(10);
		textFieldDireccionRegistro.setBounds(289, 430, 176, 20);
		panelDeRegistro.add(textFieldDireccionRegistro);
		
		JTextField textFieldCodigoPostalRegistro = new JTextField();
		textFieldCodigoPostalRegistro.setColumns(10);
		textFieldCodigoPostalRegistro.setBounds(289, 472, 176, 20);
		panelDeRegistro.add(textFieldCodigoPostalRegistro);
		
		JLabel lblCiudadRegistro = new JLabel("Ciudad");
		lblCiudadRegistro.setForeground(Color.BLACK);
		lblCiudadRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCiudadRegistro.setBounds(44, 504, 159, 31);
		panelDeRegistro.add(lblCiudadRegistro);
		
		JLabel lblProvinciaRegistro = new JLabel("Provincia");
		lblProvinciaRegistro.setForeground(Color.BLACK);
		lblProvinciaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblProvinciaRegistro.setBounds(567, 134, 159, 31);
		panelDeRegistro.add(lblProvinciaRegistro);
		
		JLabel lblNombreUsuarioRegistro = new JLabel("Nombre Usuario");
		lblNombreUsuarioRegistro.setForeground(Color.BLACK);
		lblNombreUsuarioRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombreUsuarioRegistro.setBounds(567, 184, 159, 31);
		panelDeRegistro.add(lblNombreUsuarioRegistro);
		
		JComboBox comboBoxTipoUsuario = new JComboBox();
		comboBoxTipoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Usuario Libre", "Usuario Premium"}));
		comboBoxTipoUsuario.setBounds(753, 242, 136, 29);
		panelDeRegistro.add(comboBoxTipoUsuario);
		
		JLabel lblTipoDeUsuarioRegistro = new JLabel("Tipo de Usuario");
		lblTipoDeUsuarioRegistro.setForeground(Color.BLACK);
		lblTipoDeUsuarioRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTipoDeUsuarioRegistro.setBounds(567, 236, 159, 31);
		panelDeRegistro.add(lblTipoDeUsuarioRegistro);
		
		JTextField textFieldCiudadRegistro = new JTextField();
		textFieldCiudadRegistro.setColumns(10);
		textFieldCiudadRegistro.setBounds(289, 514, 176, 20);
		panelDeRegistro.add(textFieldCiudadRegistro);
		
		JTextField textFieldProvinciaRegistro = new JTextField();
		textFieldProvinciaRegistro.setColumns(10);
		textFieldProvinciaRegistro.setBounds(753, 141, 176, 20);
		panelDeRegistro.add(textFieldProvinciaRegistro);
		
		JTextField textFieldNombreUsuarioRegistro = new JTextField();
		textFieldNombreUsuarioRegistro.setColumns(10);
		textFieldNombreUsuarioRegistro.setBounds(753, 194, 176, 20);
		panelDeRegistro.add(textFieldNombreUsuarioRegistro);
		
		JLabel lblNumeroDeCuentaRegistro = new JLabel("Numero de Cuenta");
		lblNumeroDeCuentaRegistro.setForeground(Color.BLACK);
		lblNumeroDeCuentaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNumeroDeCuentaRegistro.setBounds(567, 296, 192, 31);
		panelDeRegistro.add(lblNumeroDeCuentaRegistro);
		
		JTextField textFieldNumeroDeCuentaRegistro = new JTextField();
		textFieldNumeroDeCuentaRegistro.setColumns(10);
		textFieldNumeroDeCuentaRegistro.setBounds(753, 306, 176, 20);
		panelDeRegistro.add(textFieldNumeroDeCuentaRegistro);
		
		JLabel lblCaducidadRegistro = new JLabel("Caducidad");
		lblCaducidadRegistro.setForeground(Color.BLACK);
		lblCaducidadRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCaducidadRegistro.setBounds(567, 349, 159, 31);
		panelDeRegistro.add(lblCaducidadRegistro);
		
		JTextField textFieldCaducidadRegistro = new JTextField();
		textFieldCaducidadRegistro.setColumns(10);
		textFieldCaducidadRegistro.setBounds(753, 359, 176, 20);
		panelDeRegistro.add(textFieldCaducidadRegistro);
		
		JLabel lblCvvOCvcRegistro = new JLabel("CVV o CVC");
		lblCvvOCvcRegistro.setForeground(Color.BLACK);
		lblCvvOCvcRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCvvOCvcRegistro.setBounds(567, 406, 159, 31);
		panelDeRegistro.add(lblCvvOCvcRegistro);
		
		JTextField textFieldCvvOCvcRegistro = new JTextField();
		textFieldCvvOCvcRegistro.setColumns(10);
		textFieldCvvOCvcRegistro.setBounds(753, 416, 176, 20);
		panelDeRegistro.add(textFieldCvvOCvcRegistro);
		
		

		JLabel tituloPanelDeRegistro = new JLabel("Registrar nuevo usuario");
		tituloPanelDeRegistro.setForeground(new Color(0, 0, 0));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 349, 64);
		panelDeRegistro.add(tituloPanelDeRegistro);

		JLabel lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(34, 32, 90, 90);
		lblLogoErrekamusic.setIcon(new ImageIcon(""));
		panelDeRegistro.add(lblLogoErrekamusic);

		JButton btnCancelarPanelDeRegistro = new JButton("Bienvenida");
		btnCancelarPanelDeRegistro.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Volvemos al panel de bienvenida
			 * @param e
			 */
			public void mouseClicked(MouseEvent e) {
				//Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(true);
				//Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				//Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				//Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				//Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				//Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				//Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			}
		});
		btnCancelarPanelDeRegistro.setForeground(new Color(0, 0, 0));
		btnCancelarPanelDeRegistro.setBounds(100, 556, 98, 33);
		panelDeRegistro.add(btnCancelarPanelDeRegistro);

		JButton btnConfirmarDeRegistro = new JButton("Confirmar");
		btnConfirmarDeRegistro.addActionListener(new ActionListener() {
			/**
			 * Comfirmamos para registrar una nueva cuenta
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				boolean CampoVacio = false;
				JTextField[] campos = { textFieldDNIRegistro, textFieldNombreRegistro, textFieldPrimerApellidoRegistro,
						 passwordFieldContrasenyaRegistro,  };
				for (int i = 0; i < campos.length; i++) {
					if (campos[i].getText().isEmpty()) {
						CampoVacio = true;
						break;
					}
				}
				if (CampoVacio) {
					JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenarlo Por favor", "Error",
							JOptionPane.ERROR_MESSAGE);

				} else {
					GestorDeCliente gestorDeCliente = new GestorDeCliente();

					gestorDeCliente.compararRegistroUsuario(textFieldDNIRegistro, textFieldNombreRegistro,
							textFieldPrimerApellidoRegistro,  passwordFieldContrasenyaRegistro
						);

					Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
					Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(true);
					Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
					Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
					Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
				}
			}
		});
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(800, 556, 98, 33);
		panelDeRegistro.add(btnConfirmarDeRegistro);

		passwordFieldContrasenyaRegistro = new JPasswordField();
		passwordFieldContrasenyaRegistro.setBounds(289, 346, 176, 20);
		panelDeRegistro.add(passwordFieldContrasenyaRegistro);

		passwordFieldConfirmarContrasenyaRegistro = new JPasswordField();
		passwordFieldConfirmarContrasenyaRegistro.setBounds(289, 306, 176, 20);
		panelDeRegistro.add(passwordFieldConfirmarContrasenyaRegistro);
		
		
		
		
		
		
		

	}
	/**
	 * obtener a este panel 
	 * @return panelDeRegistro
	 */
	public JPanel getPanelDeRegistro() {
		return panelDeRegistro;
	}
}

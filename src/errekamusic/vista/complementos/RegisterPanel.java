
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPasswordField;

/**
 * El panel para registro con los datos que ha introducido el usuario
 */
public class RegisterPanel {

	private JPanel panelDeRegistro;

	private JLabel lblDNIRegistro = null;
	private JLabel lblNombreRegistro = null;
	private JLabel lblPrimerApellidoRegistro = null;
	private JLabel lblSegundoApellidoRegistro = null;
	private JLabel lblContrasenyaRegistro = null;
	private JLabel lblConfirmarContrasenyaRegistro = null;
	private JLabel lblDireccionRegistro = null;
	private JLabel lblFechNacRegistro = null;
	private JLabel lblCodigoPostalRegistro = null;
	private JLabel lblCiudadRegistro = null;
	private JLabel lblProvinciaRegistro = null;
	private JLabel lblNombreUsuarioRegistro = null;
	private JLabel lblTipoDeUsuarioRegistro = null;
	private JLabel lblNumeroDeCuentaRegistro = null;
	private JLabel lblCaducidadRegistro = null;
	private JLabel lblCvvOCvcRegistro = null;
	private JLabel tituloPanelDeRegistro = null;
	private JLabel lblLogoErrekamusic = null;

	private JTextField passwordFieldContrasenyaRegistro = null;
	private JTextField textFieldDNIRegistro = null;
	private JTextField textFieldNombreRegistro = null;
	private JTextField textFieldPrimerApellidoRegistro = null;
	private JTextField textFieldSegundoApellidoRegistro = null;
	private JTextField textFieldFechNac = null;
	private JTextField textFieldDireccionRegistro = null;
	private JTextField textFieldCodigoPostalRegistro = null;
	private JTextField textFieldCiudadRegistro = null;
	private JTextField textFieldProvinciaRegistro = null;
	private JTextField textFieldNombreUsuarioRegistro = null;
	private JTextField textFieldNumeroDeCuentaRegistro = null;
	private JTextField textFieldCaducidadRegistro = null;
	private JTextField textFieldCvvOCvcRegistro = null;

	private JComboBox<String> comboBoxTipoUsuario = null;

	private JButton btnCancelarPanelDeRegistro = null;
	private JButton btnConfirmarDeRegistro = null;
	private JPasswordField passwordFieldConfirmarContrasenyaRegistro = null;

	/**
	 * panel principal
	 */
	public RegisterPanel(ArrayList<JPanel> paneles) {
		panelDeRegistro = new JPanel();
		panelDeRegistro.setBounds(0, 0, 984, 611);
		panelDeRegistro.setBackground(new Color(0, 0, 0));
		panelDeRegistro.setLayout(null);

		lblDNIRegistro = new JLabel("DNI");
		lblDNIRegistro.setForeground(new Color(255, 222, 89));
		lblDNIRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblDNIRegistro.setBounds(44, 128, 86, 43);
		panelDeRegistro.add(lblDNIRegistro);

		lblNombreRegistro = new JLabel("Nombre");
		lblNombreRegistro.setForeground(new Color(255, 222, 89));
		lblNombreRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNombreRegistro.setBounds(44, 172, 86, 27);
		panelDeRegistro.add(lblNombreRegistro);

		lblPrimerApellidoRegistro = new JLabel("Primer apellido");
		lblPrimerApellidoRegistro.setForeground(new Color(255, 222, 89));
		lblPrimerApellidoRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblPrimerApellidoRegistro.setBounds(44, 210, 176, 32);
		panelDeRegistro.add(lblPrimerApellidoRegistro);

		lblSegundoApellidoRegistro = new JLabel("Segundo Apellido");
		lblSegundoApellidoRegistro.setForeground(new Color(255, 222, 89));
		lblSegundoApellidoRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblSegundoApellidoRegistro.setBounds(44, 253, 205, 32);
		panelDeRegistro.add(lblSegundoApellidoRegistro);

		lblContrasenyaRegistro = new JLabel("Contraseña");
		lblContrasenyaRegistro.setForeground(new Color(255, 222, 89));
		lblContrasenyaRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblContrasenyaRegistro.setBounds(44, 296, 159, 31);
		panelDeRegistro.add(lblContrasenyaRegistro);

		lblConfirmarContrasenyaRegistro = new JLabel("Confirmar contraseña");
		lblConfirmarContrasenyaRegistro.setForeground(new Color(255, 222, 89));
		lblConfirmarContrasenyaRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblConfirmarContrasenyaRegistro.setBounds(44, 338, 230, 27);
		panelDeRegistro.add(lblConfirmarContrasenyaRegistro);

		lblDireccionRegistro = new JLabel("Direccion");
		lblDireccionRegistro.setForeground(new Color(255, 222, 89));
		lblDireccionRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblDireccionRegistro.setBounds(44, 419, 230, 32);
		panelDeRegistro.add(lblDireccionRegistro);

		lblFechNacRegistro = new JLabel("Fecha de Nacimiento");
		lblFechNacRegistro.setForeground(new Color(255, 222, 89));
		lblFechNacRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblFechNacRegistro.setBounds(44, 376, 230, 32);
		panelDeRegistro.add(lblFechNacRegistro);

		lblCodigoPostalRegistro = new JLabel("Codigo Postal");
		lblCodigoPostalRegistro.setForeground(new Color(255, 222, 89));
		lblCodigoPostalRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblCodigoPostalRegistro.setBounds(44, 462, 159, 31);
		panelDeRegistro.add(lblCodigoPostalRegistro);

		textFieldDNIRegistro = new JTextField();
		textFieldDNIRegistro.setBounds(289, 134, 176, 20);
		panelDeRegistro.add(textFieldDNIRegistro);
		textFieldDNIRegistro.setColumns(10);

		textFieldNombreRegistro = new JTextField();
		textFieldNombreRegistro.setBounds(289, 180, 176, 20);
		panelDeRegistro.add(textFieldNombreRegistro);
		textFieldNombreRegistro.setColumns(10);

		textFieldPrimerApellidoRegistro = new JTextField();
		textFieldPrimerApellidoRegistro.setBounds(289, 221, 176, 20);
		panelDeRegistro.add(textFieldPrimerApellidoRegistro);
		textFieldPrimerApellidoRegistro.setColumns(10);

		textFieldSegundoApellidoRegistro = new JTextField();
		textFieldSegundoApellidoRegistro.setBounds(289, 264, 176, 20);
		panelDeRegistro.add(textFieldSegundoApellidoRegistro);
		textFieldSegundoApellidoRegistro.setColumns(10);

		textFieldFechNac = new JTextField();
		textFieldFechNac.setBounds(289, 387, 176, 20);
		panelDeRegistro.add(textFieldFechNac);
		textFieldFechNac.setColumns(10);

		textFieldDireccionRegistro = new JTextField();
		textFieldDireccionRegistro.setColumns(10);
		textFieldDireccionRegistro.setBounds(289, 430, 176, 20);
		panelDeRegistro.add(textFieldDireccionRegistro);

		textFieldCodigoPostalRegistro = new JTextField();
		textFieldCodigoPostalRegistro.setColumns(10);
		textFieldCodigoPostalRegistro.setBounds(289, 472, 176, 20);
		panelDeRegistro.add(textFieldCodigoPostalRegistro);

		lblCiudadRegistro = new JLabel("Ciudad");
		lblCiudadRegistro.setForeground(new Color(255, 222, 89));
		lblCiudadRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblCiudadRegistro.setBounds(44, 504, 159, 31);
		panelDeRegistro.add(lblCiudadRegistro);

		lblProvinciaRegistro = new JLabel("Provincia");
		lblProvinciaRegistro.setForeground(new Color(255, 222, 89));
		lblProvinciaRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblProvinciaRegistro.setBounds(567, 134, 159, 31);
		panelDeRegistro.add(lblProvinciaRegistro);

		lblNombreUsuarioRegistro = new JLabel("Nombre Usuario");
		lblNombreUsuarioRegistro.setForeground(new Color(255, 222, 89));
		lblNombreUsuarioRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNombreUsuarioRegistro.setBounds(537, 180, 205, 31);
		panelDeRegistro.add(lblNombreUsuarioRegistro);

		comboBoxTipoUsuario = new JComboBox<String>();
		comboBoxTipoUsuario
				.setModel(new DefaultComboBoxModel(new String[] { "------", "Usuario Gratuito", "Usuario Premium" }));
		comboBoxTipoUsuario.setBounds(753, 242, 176, 29);
		panelDeRegistro.add(comboBoxTipoUsuario);

		lblTipoDeUsuarioRegistro = new JLabel("Tipo de Usuario");
		lblTipoDeUsuarioRegistro.setForeground(new Color(255, 222, 89));
		lblTipoDeUsuarioRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblTipoDeUsuarioRegistro.setBounds(550, 237, 176, 31);
		panelDeRegistro.add(lblTipoDeUsuarioRegistro);

		textFieldCiudadRegistro = new JTextField();
		textFieldCiudadRegistro.setColumns(10);
		textFieldCiudadRegistro.setBounds(289, 514, 176, 20);
		panelDeRegistro.add(textFieldCiudadRegistro);

		textFieldProvinciaRegistro = new JTextField();
		textFieldProvinciaRegistro.setColumns(10);
		textFieldProvinciaRegistro.setBounds(753, 141, 176, 20);
		panelDeRegistro.add(textFieldProvinciaRegistro);

		textFieldNombreUsuarioRegistro = new JTextField();
		textFieldNombreUsuarioRegistro.setColumns(10);
		textFieldNombreUsuarioRegistro.setBounds(753, 194, 176, 20);
		panelDeRegistro.add(textFieldNombreUsuarioRegistro);

		lblNumeroDeCuentaRegistro = new JLabel("Numero de Cuenta");
		lblNumeroDeCuentaRegistro.setForeground(new Color(255, 222, 89));
		lblNumeroDeCuentaRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNumeroDeCuentaRegistro.setBounds(549, 296, 192, 31);
		panelDeRegistro.add(lblNumeroDeCuentaRegistro);

		textFieldNumeroDeCuentaRegistro = new JTextField();
		textFieldNumeroDeCuentaRegistro.setColumns(10);
		textFieldNumeroDeCuentaRegistro.setBounds(753, 306, 176, 20);
		panelDeRegistro.add(textFieldNumeroDeCuentaRegistro);

		lblCaducidadRegistro = new JLabel("Caducidad");
		lblCaducidadRegistro.setForeground(new Color(255, 222, 89));
		lblCaducidadRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblCaducidadRegistro.setBounds(567, 349, 159, 31);
		panelDeRegistro.add(lblCaducidadRegistro);

		textFieldCaducidadRegistro = new JTextField();
		textFieldCaducidadRegistro.setColumns(10);
		textFieldCaducidadRegistro.setBounds(753, 359, 176, 20);
		panelDeRegistro.add(textFieldCaducidadRegistro);

		lblCvvOCvcRegistro = new JLabel("CVV o CVC");
		lblCvvOCvcRegistro.setForeground(new Color(255, 222, 89));
		lblCvvOCvcRegistro.setFont(new Font("Cambria", Font.BOLD, 22));
		lblCvvOCvcRegistro.setBounds(567, 406, 159, 31);
		panelDeRegistro.add(lblCvvOCvcRegistro);

		textFieldCvvOCvcRegistro = new JTextField();
		textFieldCvvOCvcRegistro.setColumns(10);
		textFieldCvvOCvcRegistro.setBounds(753, 416, 176, 20);
		panelDeRegistro.add(textFieldCvvOCvcRegistro);

		tituloPanelDeRegistro = new JLabel("Registrar nuevo usuario");
		tituloPanelDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		tituloPanelDeRegistro.setForeground(new Color(255, 222, 89));
		tituloPanelDeRegistro.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 349, 64);
		panelDeRegistro.add(tituloPanelDeRegistro);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(34, 32, 90, 90);
		lblLogoErrekamusic.setIcon(new ImageIcon(""));
		panelDeRegistro.add(lblLogoErrekamusic);

		btnCancelarPanelDeRegistro = new JButton("Cancelar");
		btnCancelarPanelDeRegistro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(true);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}

		});
		btnCancelarPanelDeRegistro.setForeground(new Color(0, 0, 0));
		btnCancelarPanelDeRegistro.setBounds(44, 556, 98, 33);
		panelDeRegistro.add(btnCancelarPanelDeRegistro);

		btnConfirmarDeRegistro = new JButton("Confirmar");
		btnConfirmarDeRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
			/**
			 * Comfirmamos para registrar una nueva cuenta
			 * 
			 * @param e
			 */
			// public void actionPerformed(ActionEvent e) {
			// boolean CampoVacio = false;
			// JTextField[] campos = { textFieldDNIRegistro, textFieldNombreRegistro,
			// textFieldPrimerApellidoRegistro,
			// passwordFieldContrasenyaRegistro, };
			// for (int i = 0; i < campos.length; i++) {
			// if (campos[i].getText().isEmpty()) {
			// CampoVacio = true;
			// break;
			// }
			// }
			// if (CampoVacio) {
			// JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenarlo Por
			// favor", "Error",
			// JOptionPane.ERROR_MESSAGE);

			// } else {
			// GestorDeCliente gestorDeCliente = new GestorDeCliente();

			// gestorDeCliente.compararRegistroUsuario(textFieldDNIRegistro,
			// textFieldNombreRegistro,
			// textFieldPrimerApellidoRegistro, passwordFieldContrasenyaRegistro
			// );

			// Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
			// Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
			// Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
			// Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(true);
			// Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
			// Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
			// Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			// }
			// }
		});
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(836, 556, 98, 33);
		panelDeRegistro.add(btnConfirmarDeRegistro);

		passwordFieldContrasenyaRegistro = new JPasswordField();
		passwordFieldContrasenyaRegistro.setBounds(289, 346, 176, 20);
		panelDeRegistro.add(passwordFieldContrasenyaRegistro);

		passwordFieldConfirmarContrasenyaRegistro = new JPasswordField();
		passwordFieldConfirmarContrasenyaRegistro.setBounds(289, 306, 176, 20);
		panelDeRegistro.add(passwordFieldConfirmarContrasenyaRegistro);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		panelDeRegistro.add(lblLogoErrekamusic);

	}

	/**
	 * obtener a este panel
	 * 
	 * @return panelDeRegistro
	 */
	public JPanel getPanelDeRegistro() {
		return panelDeRegistro;
	}
}

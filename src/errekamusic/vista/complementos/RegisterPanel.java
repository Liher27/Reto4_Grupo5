
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
import java.util.ArrayList;

import javax.swing.JPasswordField;

/**
 * El panel para registro con los datos que ha introducido el usuario
 */
public class RegisterPanel {

	private JPanel panelDeRegistro;

	private JLabel lblRegisterDNI = null;
	private JLabel lblRegisterName = null;
	private JLabel lblRegisterFirstSurname = null;
	private JLabel lblRegisterSecondSurname = null;
	private JLabel lblRegisterPasswd = null;
	private JLabel lblConfirmPasswd = null;
	private JLabel lblRegisterDirection = null;
	private JLabel lblRegisterBirthDate = null;
	private JLabel lblRegisterCP = null;
	private JLabel lblRegisterCity = null;
	private JLabel lblRegisterProvince = null;
	private JLabel lblRegisterUsername = null;
	private JLabel lblRegisterUserType = null;
	private JLabel lblRegisterCountName = null;
	private JLabel lblRegisterCardCaducity = null;
	private JLabel lblRegisterCVV = null;
	private JLabel registerTitleLbl = null;
	private JLabel lblLogoErrekamusic = null;

	private JTextField fieldRegisterPasswd = null;
	private JTextField fieldRegisterDNI = null;
	private JTextField fieldRegisterName = null;
	private JTextField fieldRegisterFirstSurname = null;
	private JTextField fieldRegisterSecondSurname = null;
	private JTextField fieldRegisterBirthDate = null;
	private JTextField fieldRegisterDirection = null;
	private JTextField fieldRegisterCP = null;
	private JTextField fieldRegisterCity = null;
	private JTextField fieldRegisterProvince = null;
	private JTextField fieldRegisterUsername = null;
	private JTextField fieldRegisterCountName = null;
	private JTextField fieldRegisterCardCaducity = null;
	private JTextField fieldRegisterCVV = null;

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

		lblRegisterDNI = new JLabel("DNI");
		lblRegisterDNI.setForeground(new Color(255, 222, 89));
		lblRegisterDNI.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterDNI.setBounds(44, 128, 86, 43);
		panelDeRegistro.add(lblRegisterDNI);

		lblRegisterName = new JLabel("Nombre");
		lblRegisterName.setForeground(new Color(255, 222, 89));
		lblRegisterName.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterName.setBounds(44, 172, 86, 27);
		panelDeRegistro.add(lblRegisterName);

		lblRegisterFirstSurname = new JLabel("Primer apellido");
		lblRegisterFirstSurname.setForeground(new Color(255, 222, 89));
		lblRegisterFirstSurname.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterFirstSurname.setBounds(44, 210, 176, 32);
		panelDeRegistro.add(lblRegisterFirstSurname);

		lblRegisterSecondSurname = new JLabel("Segundo Apellido");
		lblRegisterSecondSurname.setForeground(new Color(255, 222, 89));
		lblRegisterSecondSurname.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterSecondSurname.setBounds(44, 253, 205, 32);
		panelDeRegistro.add(lblRegisterSecondSurname);

		lblRegisterPasswd = new JLabel("Contraseña");
		lblRegisterPasswd.setForeground(new Color(255, 222, 89));
		lblRegisterPasswd.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterPasswd.setBounds(44, 296, 159, 31);
		panelDeRegistro.add(lblRegisterPasswd);

		lblConfirmPasswd = new JLabel("Confirmar contraseña");
		lblConfirmPasswd.setForeground(new Color(255, 222, 89));
		lblConfirmPasswd.setFont(new Font("Cambria", Font.BOLD, 22));
		lblConfirmPasswd.setBounds(44, 338, 230, 27);
		panelDeRegistro.add(lblConfirmPasswd);

		lblRegisterDirection = new JLabel("Direccion");
		lblRegisterDirection.setForeground(new Color(255, 222, 89));
		lblRegisterDirection.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterDirection.setBounds(44, 419, 230, 32);
		panelDeRegistro.add(lblRegisterDirection);

		lblRegisterBirthDate = new JLabel("Fecha de Nacimiento");
		lblRegisterBirthDate.setForeground(new Color(255, 222, 89));
		lblRegisterBirthDate.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterBirthDate.setBounds(44, 376, 230, 32);
		panelDeRegistro.add(lblRegisterBirthDate);

		lblRegisterCP = new JLabel("Codigo Postal");
		lblRegisterCP.setForeground(new Color(255, 222, 89));
		lblRegisterCP.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterCP.setBounds(44, 462, 159, 31);
		panelDeRegistro.add(lblRegisterCP);

		fieldRegisterDNI = new JTextField();
		fieldRegisterDNI.setBounds(289, 134, 176, 20);
		panelDeRegistro.add(fieldRegisterDNI);
		fieldRegisterDNI.setColumns(10);

		fieldRegisterName = new JTextField();
		fieldRegisterName.setBounds(289, 180, 176, 20);
		panelDeRegistro.add(fieldRegisterName);
		fieldRegisterName.setColumns(10);

		fieldRegisterFirstSurname = new JTextField();
		fieldRegisterFirstSurname.setBounds(289, 221, 176, 20);
		panelDeRegistro.add(fieldRegisterFirstSurname);
		fieldRegisterFirstSurname.setColumns(10);

		fieldRegisterSecondSurname = new JTextField();
		fieldRegisterSecondSurname.setBounds(289, 264, 176, 20);
		panelDeRegistro.add(fieldRegisterSecondSurname);
		fieldRegisterSecondSurname.setColumns(10);

		fieldRegisterBirthDate = new JTextField();
		fieldRegisterBirthDate.setBounds(289, 387, 176, 20);
		panelDeRegistro.add(fieldRegisterBirthDate);
		fieldRegisterBirthDate.setColumns(10);

		fieldRegisterDirection = new JTextField();
		fieldRegisterDirection.setColumns(10);
		fieldRegisterDirection.setBounds(289, 430, 176, 20);
		panelDeRegistro.add(fieldRegisterDirection);

		fieldRegisterCP = new JTextField();
		fieldRegisterCP.setColumns(10);
		fieldRegisterCP.setBounds(289, 472, 176, 20);
		panelDeRegistro.add(fieldRegisterCP);

		lblRegisterCity = new JLabel("Ciudad");
		lblRegisterCity.setForeground(new Color(255, 222, 89));
		lblRegisterCity.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterCity.setBounds(44, 504, 159, 31);
		panelDeRegistro.add(lblRegisterCity);

		lblRegisterProvince = new JLabel("Provincia");
		lblRegisterProvince.setForeground(new Color(255, 222, 89));
		lblRegisterProvince.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterProvince.setBounds(567, 134, 159, 31);
		panelDeRegistro.add(lblRegisterProvince);

		lblRegisterUsername = new JLabel("Nombre Usuario");
		lblRegisterUsername.setForeground(new Color(255, 222, 89));
		lblRegisterUsername.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterUsername.setBounds(537, 180, 205, 31);
		panelDeRegistro.add(lblRegisterUsername);

		comboBoxTipoUsuario = new JComboBox<String>();
		comboBoxTipoUsuario
				.setModel(new DefaultComboBoxModel(new String[] { "------", "Usuario Gratuito", "Usuario Premium" }));
		comboBoxTipoUsuario.setBounds(753, 242, 176, 29);
		panelDeRegistro.add(comboBoxTipoUsuario);

		lblRegisterUserType = new JLabel("Tipo de Usuario");
		lblRegisterUserType.setForeground(new Color(255, 222, 89));
		lblRegisterUserType.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterUserType.setBounds(550, 237, 176, 31);
		panelDeRegistro.add(lblRegisterUserType);

		fieldRegisterCity = new JTextField();
		fieldRegisterCity.setColumns(10);
		fieldRegisterCity.setBounds(289, 514, 176, 20);
		panelDeRegistro.add(fieldRegisterCity);

		fieldRegisterProvince = new JTextField();
		fieldRegisterProvince.setColumns(10);
		fieldRegisterProvince.setBounds(753, 141, 176, 20);
		panelDeRegistro.add(fieldRegisterProvince);

		fieldRegisterUsername = new JTextField();
		fieldRegisterUsername.setColumns(10);
		fieldRegisterUsername.setBounds(753, 194, 176, 20);
		panelDeRegistro.add(fieldRegisterUsername);

		lblRegisterCountName = new JLabel("Numero de Cuenta");
		lblRegisterCountName.setForeground(new Color(255, 222, 89));
		lblRegisterCountName.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterCountName.setBounds(549, 296, 192, 31);
		panelDeRegistro.add(lblRegisterCountName);

		fieldRegisterCountName = new JTextField();
		fieldRegisterCountName.setColumns(10);
		fieldRegisterCountName.setBounds(753, 306, 176, 20);
		panelDeRegistro.add(fieldRegisterCountName);

		lblRegisterCardCaducity = new JLabel("Caducidad");
		lblRegisterCardCaducity.setForeground(new Color(255, 222, 89));
		lblRegisterCardCaducity.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterCardCaducity.setBounds(567, 349, 159, 31);
		panelDeRegistro.add(lblRegisterCardCaducity);

		fieldRegisterCardCaducity = new JTextField();
		fieldRegisterCardCaducity.setColumns(10);
		fieldRegisterCardCaducity.setBounds(753, 359, 176, 20);
		panelDeRegistro.add(fieldRegisterCardCaducity);

		lblRegisterCVV = new JLabel("CVV o CVC");
		lblRegisterCVV.setForeground(new Color(255, 222, 89));
		lblRegisterCVV.setFont(new Font("Cambria", Font.BOLD, 22));
		lblRegisterCVV.setBounds(567, 406, 159, 31);
		panelDeRegistro.add(lblRegisterCVV);

		fieldRegisterCVV = new JTextField();
		fieldRegisterCVV.setColumns(10);
		fieldRegisterCVV.setBounds(753, 416, 176, 20);
		panelDeRegistro.add(fieldRegisterCVV);

		registerTitleLbl = new JLabel("Registrar nuevo usuario");
		registerTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		registerTitleLbl.setForeground(new Color(255, 222, 89));
		registerTitleLbl.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		registerTitleLbl.setBounds(328, 32, 349, 64);
		panelDeRegistro.add(registerTitleLbl);

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

		fieldRegisterPasswd = new JPasswordField();
		fieldRegisterPasswd.setBounds(289, 346, 176, 20);
		panelDeRegistro.add(fieldRegisterPasswd);

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

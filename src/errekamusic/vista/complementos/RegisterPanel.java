
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

import errekamusic.logica.UserController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPasswordField;

/**
 * El panel para registro con los datos que ha introducido el usuario
 */
public class RegisterPanel {

	private JPanel panelDeRegistro;
	private UserController userController = null;
	
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
	private JLabel lblPersonalOpt = null;
	private JLabel lblCountOpt = null;
	private JLabel lblPremiumOpt = null;
	private JLabel lblUserDirOpt = null;

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

	private JComboBox<String> userTypeComboBox = null;

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
		lblRegisterDNI.setForeground(new Color(255, 255, 255));
		lblRegisterDNI.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDNI.setBounds(45, 264, 86, 43);
		panelDeRegistro.add(lblRegisterDNI);

		lblRegisterName = new JLabel("Nombre");
		lblRegisterName.setForeground(new Color(255, 255, 255));
		lblRegisterName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterName.setBounds(45, 143, 86, 27);
		panelDeRegistro.add(lblRegisterName);

		lblRegisterFirstSurname = new JLabel("Primer apellido");
		lblRegisterFirstSurname.setForeground(new Color(255, 255, 255));
		lblRegisterFirstSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterFirstSurname.setBounds(45, 181, 176, 32);
		panelDeRegistro.add(lblRegisterFirstSurname);

		lblRegisterSecondSurname = new JLabel("Segundo Apellido");
		lblRegisterSecondSurname.setForeground(new Color(255, 255, 255));
		lblRegisterSecondSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterSecondSurname.setBounds(45, 224, 205, 32);
		panelDeRegistro.add(lblRegisterSecondSurname);

		lblRegisterPasswd = new JLabel("Contraseña");
		lblRegisterPasswd.setForeground(new Color(255, 255, 255));
		lblRegisterPasswd.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterPasswd.setBounds(45, 437, 159, 31);
		panelDeRegistro.add(lblRegisterPasswd);

		lblConfirmPasswd = new JLabel("Confirmar contraseña");
		lblConfirmPasswd.setForeground(new Color(255, 255, 255));
		lblConfirmPasswd.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblConfirmPasswd.setBounds(45, 474, 230, 27);
		panelDeRegistro.add(lblConfirmPasswd);

		lblRegisterDirection = new JLabel("Calle");
		lblRegisterDirection.setForeground(new Color(255, 255, 255));
		lblRegisterDirection.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDirection.setBounds(573, 143, 130, 32);
		panelDeRegistro.add(lblRegisterDirection);

		lblRegisterBirthDate = new JLabel("Fecha de Nacimiento");
		lblRegisterBirthDate.setForeground(new Color(255, 255, 255));
		lblRegisterBirthDate.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterBirthDate.setBounds(45, 310, 230, 32);
		panelDeRegistro.add(lblRegisterBirthDate);

		lblRegisterCP = new JLabel("Codigo Postal");
		lblRegisterCP.setForeground(new Color(255, 255, 255));
		lblRegisterCP.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCP.setBounds(573, 270, 159, 31);
		panelDeRegistro.add(lblRegisterCP);

		fieldRegisterDNI = new JTextField();
		fieldRegisterDNI.setBounds(101, 274, 262, 20);
		panelDeRegistro.add(fieldRegisterDNI);
		fieldRegisterDNI.setColumns(10);

		fieldRegisterName = new JTextField();
		fieldRegisterName.setBounds(139, 144, 262, 20);
		panelDeRegistro.add(fieldRegisterName);
		fieldRegisterName.setColumns(10);

		fieldRegisterFirstSurname = new JTextField();
		fieldRegisterFirstSurname.setBounds(189, 184, 218, 20);
		panelDeRegistro.add(fieldRegisterFirstSurname);
		fieldRegisterFirstSurname.setColumns(10);

		fieldRegisterSecondSurname = new JTextField();
		fieldRegisterSecondSurname.setBounds(203, 230, 218, 20);
		panelDeRegistro.add(fieldRegisterSecondSurname);
		fieldRegisterSecondSurname.setColumns(10);

		fieldRegisterBirthDate = new JTextField();
		fieldRegisterBirthDate.setBounds(231, 316, 176, 20);
		panelDeRegistro.add(fieldRegisterBirthDate);
		fieldRegisterBirthDate.setColumns(10);

		fieldRegisterDirection = new JTextField();
		fieldRegisterDirection.setColumns(10);
		fieldRegisterDirection.setBounds(636, 149, 216, 20);
		panelDeRegistro.add(fieldRegisterDirection);

		fieldRegisterCP = new JTextField();
		fieldRegisterCP.setColumns(10);
		fieldRegisterCP.setBounds(160, 440, 245, 20);
		panelDeRegistro.add(fieldRegisterCP);

		lblRegisterCity = new JLabel("Ciudad");
		lblRegisterCity.setForeground(new Color(255, 255, 255));
		lblRegisterCity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCity.setBounds(573, 185, 130, 31);
		panelDeRegistro.add(lblRegisterCity);

		lblRegisterProvince = new JLabel("Provincia");
		lblRegisterProvince.setForeground(new Color(255, 255, 255));
		lblRegisterProvince.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterProvince.setBounds(573, 228, 130, 31);
		panelDeRegistro.add(lblRegisterProvince);

		lblRegisterUsername = new JLabel("Nombre Usuario");
		lblRegisterUsername.setForeground(new Color(255, 255, 255));
		lblRegisterUsername.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUsername.setBounds(45, 401, 205, 31);
		panelDeRegistro.add(lblRegisterUsername);

		userTypeComboBox = new JComboBox<String>();
		userTypeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Usuario Gratuito", "Usuario Premium" }));
		userTypeComboBox.setBounds(189, 510, 205, 29);
		panelDeRegistro.add(userTypeComboBox);
		
		lblRegisterUserType = new JLabel("Tipo de Usuario");
		lblRegisterUserType.setForeground(new Color(255, 255, 255));
		lblRegisterUserType.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUserType.setBounds(45, 508, 176, 31);
		panelDeRegistro.add(lblRegisterUserType);

		fieldRegisterCity = new JTextField();
		fieldRegisterCity.setColumns(10);
		fieldRegisterCity.setBounds(652, 188, 176, 20);
		panelDeRegistro.add(fieldRegisterCity);

		fieldRegisterProvince = new JTextField();
		fieldRegisterProvince.setColumns(10);
		fieldRegisterProvince.setBounds(667, 232, 187, 20);
		panelDeRegistro.add(fieldRegisterProvince);

		fieldRegisterUsername = new JTextField();
		fieldRegisterUsername.setColumns(10);
		fieldRegisterUsername.setBounds(196, 407, 210, 20);
		panelDeRegistro.add(fieldRegisterUsername);

		lblRegisterCountName = new JLabel("Numero de Cuenta");
		lblRegisterCountName.setForeground(new Color(255, 255, 255));
		lblRegisterCountName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCountName.setBounds(573, 407, 192, 31);
		panelDeRegistro.add(lblRegisterCountName);

		fieldRegisterCountName = new JTextField();
		fieldRegisterCountName.setColumns(10);
		fieldRegisterCountName.setBounds(751, 411, 166, 20);
		panelDeRegistro.add(fieldRegisterCountName);

		lblRegisterCardCaducity = new JLabel("Caducidad");
		lblRegisterCardCaducity.setForeground(new Color(255, 255, 255));
		lblRegisterCardCaducity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCardCaducity.setBounds(573, 443, 159, 31);
		panelDeRegistro.add(lblRegisterCardCaducity);

		fieldRegisterCardCaducity = new JTextField();
		fieldRegisterCardCaducity.setColumns(10);
		fieldRegisterCardCaducity.setBounds(684, 447, 176, 20);
		panelDeRegistro.add(fieldRegisterCardCaducity);

		lblRegisterCVV = new JLabel("CVV o CVC");
		lblRegisterCVV.setForeground(new Color(255, 255, 255));
		lblRegisterCVV.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCVV.setBounds(574, 487, 159, 31);
		panelDeRegistro.add(lblRegisterCVV);

		fieldRegisterCVV = new JTextField();
		fieldRegisterCVV.setColumns(10);
		fieldRegisterCVV.setBounds(683, 491, 176, 20);
		panelDeRegistro.add(fieldRegisterCVV);

		registerTitleLbl = new JLabel("REGISTRATE");
		registerTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		registerTitleLbl.setForeground(new Color(190, 30, 255));
		registerTitleLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 41));
		registerTitleLbl.setBounds(329, 11, 349, 64);
		panelDeRegistro.add(registerTitleLbl);

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
				boolean CampoVacio = false;
				JTextField[] campos = { fieldRegisterName, fieldRegisterFirstSurname, fieldRegisterDNI,
						fieldRegisterBirthDate, fieldRegisterDNI, fieldRegisterDirection, fieldRegisterCP,
						fieldRegisterCity, fieldRegisterProvince, fieldRegisterUsername, fieldRegisterPasswd,
						passwordFieldConfirmarContrasenyaRegistro };
				for (int i = 0; i < campos.length; i++) {
					if (campos[i].getText().isEmpty() && (userTypeComboBox != null)) {
						CampoVacio = true;
						break;
					}
				}
				if (CampoVacio) {
					JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenarlo Por favor", "Error",
							JOptionPane.ERROR_MESSAGE);

				} else  if (userTypeComboBox.equals("Usuario gratuito")){
					 userController = new UserController();;

//					userController.compararRegistroUsuario(fieldRegisterName, fieldRegisterFirstSurname, fieldRegisterDNI,
//							fieldRegisterBirthDate, fieldRegisterDNI, fieldRegisterDirection, fieldRegisterCP,
//							fieldRegisterCity, fieldRegisterProvince, fieldRegisterUsername, fieldRegisterPasswd,
//							passwordFieldConfirmarContrasenyaRegistro);

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
					paneles.get(13).setVisible(false);				}
			}
		});
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(836, 556, 98, 33);
		panelDeRegistro.add(btnConfirmarDeRegistro);

		fieldRegisterPasswd = new JPasswordField();
		fieldRegisterPasswd.setBounds(702, 273, 173, 20);
		panelDeRegistro.add(fieldRegisterPasswd);

		passwordFieldConfirmarContrasenyaRegistro = new JPasswordField();
		passwordFieldConfirmarContrasenyaRegistro.setBounds(231, 476, 187, 20);
		panelDeRegistro.add(passwordFieldConfirmarContrasenyaRegistro);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		panelDeRegistro.add(lblLogoErrekamusic);

		lblPersonalOpt = new JLabel("DATOS PERSONALES");
		lblPersonalOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalOpt.setForeground(new Color(190, 30, 255));
		lblPersonalOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblPersonalOpt.setBounds(0, 80, 365, 64);
		panelDeRegistro.add(lblPersonalOpt);

		lblCountOpt = new JLabel("DATOS DE LA CUENTA");
		lblCountOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountOpt.setForeground(new Color(190, 30, 255));
		lblCountOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblCountOpt.setBounds(16, 342, 365, 64);
		panelDeRegistro.add(lblCountOpt);

		lblUserDirOpt = new JLabel("DIRECCION");
		lblUserDirOpt.setForeground(new Color(190, 30, 255));
		lblUserDirOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblUserDirOpt.setBounds(573, 80, 365, 64);
		panelDeRegistro.add(lblUserDirOpt);

		lblPremiumOpt = new JLabel("OPCIONES PREMIUM");
		lblPremiumOpt.setHorizontalAlignment(SwingConstants.LEFT);
		lblPremiumOpt.setForeground(new Color(190, 30, 255));
		lblPremiumOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblPremiumOpt.setBounds(573, 342, 365, 64);
		panelDeRegistro.add(lblPremiumOpt);

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

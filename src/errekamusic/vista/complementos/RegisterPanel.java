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

import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.logica.Sesion;
import errekamusic.logica.UserController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JPasswordField;

/**
 * El panel para registro con los datos que ha introducido el usuario
 */
public class RegisterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private UserController userController = null;

	private Users user = null;
	private JPanel premiumPanel = null;

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
	private JTextField fieldRegisterCardCaducity = null;
	private JTextField fieldRegisterCVV = null;
	private JTextField fieldRegisterCountName = null;

	private JComboBox<String> userTypeComboBox = null;
	private JButton btnCancelarPanelDeRegistro = null;
	private JButton btnConfirmarDeRegistro = null;
	private JPasswordField passwordFieldConfirmarContrasenyaRegistro = null;
	private boolean registed = false;

	/**
	 * panel principal
	 */
	public RegisterPanel() {

		premiumPanel = new JPanel();

		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		lblRegisterDNI = new JLabel("DNI");
		lblRegisterDNI.setForeground(new Color(255, 255, 255));
		lblRegisterDNI.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDNI.setBounds(45, 264, 86, 43);
		add(lblRegisterDNI);

		lblRegisterName = new JLabel("Nombre");
		lblRegisterName.setForeground(new Color(255, 255, 255));
		lblRegisterName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterName.setBounds(45, 143, 86, 27);
		add(lblRegisterName);

		lblRegisterFirstSurname = new JLabel("Primer apellido");
		lblRegisterFirstSurname.setForeground(new Color(255, 255, 255));
		lblRegisterFirstSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterFirstSurname.setBounds(45, 181, 176, 32);
		add(lblRegisterFirstSurname);

		lblRegisterSecondSurname = new JLabel("Segundo Apellido");
		lblRegisterSecondSurname.setForeground(new Color(255, 255, 255));
		lblRegisterSecondSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterSecondSurname.setBounds(45, 224, 205, 32);
		add(lblRegisterSecondSurname);

		lblRegisterPasswd = new JLabel("Contraseña");
		lblRegisterPasswd.setForeground(new Color(255, 255, 255));
		lblRegisterPasswd.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterPasswd.setBounds(45, 437, 159, 31);
		add(lblRegisterPasswd);

		lblConfirmPasswd = new JLabel("Confirmar contraseña");
		lblConfirmPasswd.setForeground(new Color(255, 255, 255));
		lblConfirmPasswd.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblConfirmPasswd.setBounds(45, 474, 230, 27);
		add(lblConfirmPasswd);

		lblRegisterDirection = new JLabel("Calle");
		lblRegisterDirection.setForeground(new Color(255, 255, 255));
		lblRegisterDirection.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDirection.setBounds(573, 143, 130, 32);
		add(lblRegisterDirection);

		lblRegisterBirthDate = new JLabel("Fecha de Nacimiento");
		lblRegisterBirthDate.setForeground(new Color(255, 255, 255));
		lblRegisterBirthDate.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterBirthDate.setBounds(45, 310, 230, 32);
		add(lblRegisterBirthDate);

		lblRegisterCP = new JLabel("Codigo Postal");
		lblRegisterCP.setForeground(new Color(255, 255, 255));
		lblRegisterCP.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCP.setBounds(573, 270, 159, 31);
		add(lblRegisterCP);

		fieldRegisterDNI = new JTextField();
		fieldRegisterDNI.setBounds(101, 274, 262, 20);
		add(fieldRegisterDNI);
		fieldRegisterDNI.setColumns(10);

		fieldRegisterName = new JTextField();
		fieldRegisterName.setBounds(139, 144, 262, 20);
		add(fieldRegisterName);
		fieldRegisterName.setColumns(10);

		fieldRegisterFirstSurname = new JTextField();
		fieldRegisterFirstSurname.setBounds(189, 184, 218, 20);
		add(fieldRegisterFirstSurname);
		fieldRegisterFirstSurname.setColumns(10);

		fieldRegisterSecondSurname = new JTextField();
		fieldRegisterSecondSurname.setBounds(203, 230, 218, 20);
		add(fieldRegisterSecondSurname);
		fieldRegisterSecondSurname.setColumns(10);

		fieldRegisterBirthDate = new JTextField();
		fieldRegisterBirthDate.setBounds(231, 316, 176, 20);
		add(fieldRegisterBirthDate);
		fieldRegisterBirthDate.setColumns(10);

		fieldRegisterDirection = new JTextField();
		fieldRegisterDirection.setColumns(10);
		fieldRegisterDirection.setBounds(636, 149, 216, 20);
		add(fieldRegisterDirection);

		fieldRegisterCP = new JTextField();
		fieldRegisterCP.setColumns(10);
		fieldRegisterCP.setBounds(691, 278, 187, 20);
		add(fieldRegisterCP);

		lblRegisterCity = new JLabel("Ciudad");
		lblRegisterCity.setForeground(new Color(255, 255, 255));
		lblRegisterCity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCity.setBounds(573, 185, 130, 31);
		add(lblRegisterCity);

		lblRegisterProvince = new JLabel("Provincia");
		lblRegisterProvince.setForeground(new Color(255, 255, 255));
		lblRegisterProvince.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterProvince.setBounds(573, 228, 130, 31);
		add(lblRegisterProvince);

		lblRegisterUsername = new JLabel("Nombre Usuario");
		lblRegisterUsername.setForeground(new Color(255, 255, 255));
		lblRegisterUsername.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUsername.setBounds(45, 401, 205, 31);
		add(lblRegisterUsername);

		userTypeComboBox = new JComboBox<String>();
		userTypeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Free", "Premium" }));
		userTypeComboBox.setBounds(189, 510, 205, 29);
		add(userTypeComboBox);
		userTypeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPremiumPanel();
			}

		});

		lblRegisterUserType = new JLabel("Tipo de Usuario");
		lblRegisterUserType.setForeground(new Color(255, 255, 255));
		lblRegisterUserType.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUserType.setBounds(45, 508, 176, 31);
		add(lblRegisterUserType);

		fieldRegisterCity = new JTextField();
		fieldRegisterCity.setColumns(10);
		fieldRegisterCity.setBounds(652, 188, 176, 20);
		add(fieldRegisterCity);

		fieldRegisterProvince = new JTextField();
		fieldRegisterProvince.setColumns(10);
		fieldRegisterProvince.setBounds(667, 232, 187, 20);
		add(fieldRegisterProvince);

		fieldRegisterUsername = new JTextField();
		fieldRegisterUsername.setColumns(10);
		fieldRegisterUsername.setBounds(196, 407, 210, 20);
		add(fieldRegisterUsername);

		registerTitleLbl = new JLabel("REGISTRATE");
		registerTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		registerTitleLbl.setForeground(new Color(190, 30, 255));
		registerTitleLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 41));
		registerTitleLbl.setBounds(329, 11, 349, 64);
		add(registerTitleLbl);

		btnCancelarPanelDeRegistro = new JButton("Cancelar");
		btnCancelarPanelDeRegistro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				userController = new UserController();

				if (userController.insertNewUser(user)) {
					Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
					Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(true);
					Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
					Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
					Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
					Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
					Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
					Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
					Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
					Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
					Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
					Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
					Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
					Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				}

			}

		});
		btnCancelarPanelDeRegistro.setBackground(new Color(0, 0, 0));
		btnCancelarPanelDeRegistro.setBounds(44, 556, 98, 33);
		add(btnCancelarPanelDeRegistro);

		btnConfirmarDeRegistro = new JButton("Confirmar");
		btnConfirmarDeRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compareFreeAndPremium();

			}
		});
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(836, 556, 98, 33);
		add(btnConfirmarDeRegistro);

		fieldRegisterPasswd = new JPasswordField();
		fieldRegisterPasswd.setBounds(155, 445, 246, 20);
		add(fieldRegisterPasswd);

		passwordFieldConfirmarContrasenyaRegistro = new JPasswordField();
		passwordFieldConfirmarContrasenyaRegistro.setBounds(231, 476, 187, 20);
		add(passwordFieldConfirmarContrasenyaRegistro);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblPersonalOpt = new JLabel("DATOS PERSONALES");
		lblPersonalOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalOpt.setForeground(new Color(190, 30, 255));
		lblPersonalOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblPersonalOpt.setBounds(0, 80, 365, 64);
		add(lblPersonalOpt);

		lblCountOpt = new JLabel("DATOS DE LA CUENTA");
		lblCountOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountOpt.setForeground(new Color(190, 30, 255));
		lblCountOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblCountOpt.setBounds(16, 342, 365, 64);
		add(lblCountOpt);

		lblUserDirOpt = new JLabel("DIRECCION");
		lblUserDirOpt.setForeground(new Color(190, 30, 255));
		lblUserDirOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblUserDirOpt.setBounds(573, 80, 365, 64);
		add(lblUserDirOpt);

		premiumPanel = new JPanel();
		premiumPanel.setBackground(Color.BLACK);
		premiumPanel.setBounds(536, 326, 438, 220);
		add(premiumPanel);
		premiumPanel.setLayout(null);
		premiumPanel.setVisible(false);

		lblPremiumOpt = new JLabel("OPCIONES PREMIUM");
		lblPremiumOpt.setBounds(64, 5, 310, 42);
		lblPremiumOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremiumOpt.setForeground(new Color(190, 30, 255));
		lblPremiumOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		premiumPanel.add(lblPremiumOpt);

		lblRegisterCountName = new JLabel("Numero de Cuenta");
		lblRegisterCountName.setForeground(new Color(255, 255, 255));
		lblRegisterCountName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCountName.setBounds(9, 52, 148, 24);
		premiumPanel.add(lblRegisterCountName);

		fieldRegisterCountName = new JTextField();
		fieldRegisterCountName.setColumns(10);
		fieldRegisterCountName.setBounds(180, 57, 168, 20);
		premiumPanel.add(fieldRegisterCountName);

		lblRegisterCardCaducity = new JLabel("Caducidad");
		lblRegisterCardCaducity.setForeground(new Color(255, 255, 255));
		lblRegisterCardCaducity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCardCaducity.setBounds(22, 102, 85, 24);
		premiumPanel.add(lblRegisterCardCaducity);

		fieldRegisterCardCaducity = new JTextField();
		fieldRegisterCardCaducity.setColumns(10);
		fieldRegisterCardCaducity.setBounds(140, 107, 185, 20);
		premiumPanel.add(fieldRegisterCardCaducity);

		lblRegisterCVV = new JLabel("CVV o CVC");
		lblRegisterCVV.setForeground(new Color(255, 255, 255));
		lblRegisterCVV.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCVV.setBounds(20, 150, 87, 24);
		premiumPanel.add(lblRegisterCVV);

		fieldRegisterCVV = new JTextField();
		fieldRegisterCVV.setColumns(10);
		fieldRegisterCVV.setBounds(140, 155, 185, 20);
		premiumPanel.add(fieldRegisterCVV);
	}

	public void setPremiumPanel() {
		if (userTypeComboBox != null && userTypeComboBox.getSelectedItem() != null) {
			if (userTypeComboBox.getSelectedItem().toString().equals("Free")) {
				premiumPanel.setVisible(false);
			} else {
				premiumPanel.setVisible(true);
			}
		}
	}

	public void compareFreeAndPremium() {
		if (userTypeComboBox.getSelectedItem().toString().equals("Free")) {
			if (registed) {
				userController = new UserController();
				try {
					Users users = new Users();
					users.setBirthDateUser(Converter.convertFromUtilDateToSqlDate(
							Converter.convertStringToUtilDate(fieldRegisterBirthDate.getText())));
					users.setAccountType(userTypeComboBox.getSelectedItem().toString());
					users.setAdmin("No");
					users.setcPUser(Integer.valueOf(fieldRegisterCP.getText()));
					users.setDirUser(fieldRegisterDirection.getText());
					users.setDNI(fieldRegisterDNI.getText());
					users.setSurName1(fieldRegisterFirstSurname.getText());
					users.setSurName2(fieldRegisterSecondSurname.getText());
					users.setNameUser(fieldRegisterName.getText());
					users.setLoginUser(fieldRegisterUsername.getText());
					users.setUserPassword(fieldRegisterPasswd.getText());
					users.setUserCity(fieldRegisterCity.getText());
					users.setUserProvince(fieldRegisterProvince.getText());
					userController.insertNewUser(users);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(true);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				registed = true;
			} else {
				JOptionPane.showMessageDialog(null, "Se ha bloqueado el acceso a la aplicacion por demasiados intentos",
						"Tonto", JOptionPane.ERROR_MESSAGE);
			}

		} else {

			if (registed) {

				userController = new UserController();
				try {
					Users users = new Users();
					users.setBirthDateUser(Converter.convertFromUtilDateToSqlDate(
							Converter.convertStringToUtilDate(fieldRegisterBirthDate.getText())));
					users.setAccountType(userTypeComboBox.getSelectedItem().toString());
					users.setAdmin("No");
					users.setcPUser(Integer.valueOf(fieldRegisterCP.getText()));
					users.setDirUser(fieldRegisterDirection.getText());
					users.setDNI(fieldRegisterDNI.getText());
					users.setSurName1(fieldRegisterFirstSurname.getText());
					users.setSurName2(fieldRegisterSecondSurname.getText());
					users.setNameUser(fieldRegisterName.getText());
					users.setLoginUser(fieldRegisterUsername.getText());
					users.setUserPassword(fieldRegisterPasswd.getText());
					users.setUserCity(fieldRegisterCity.getText());
					users.setUserProvince(fieldRegisterProvince.getText());
					userController.insertNewUser(users);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				PremiumUser userPremium = new PremiumUser();
				userPremium.setCountNum(Integer.valueOf(fieldRegisterCountName.getText().trim()));
				userPremium.setCaducity(fieldRegisterCardCaducity.getText());
				userPremium.setcVV(Integer.valueOf(fieldRegisterCVV.getText()));
				String logUserName = fieldRegisterUsername.getText();
				userController.insertPremiumData(userPremium, logUserName);

				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(true);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				registed = true;
			} else {
				JOptionPane.showMessageDialog(null, "Se ha bloqueado el acceso a la aplicacion por demasiados intentos",
						"Tonto", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * obtener este panel
	 *
	 * @return panelDeRegistro
	 */
	public JPanel getRegisterPanel() {
		return this;
	}
}
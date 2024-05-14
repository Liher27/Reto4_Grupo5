package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.logica.Sesion;
import errekamusic.logica.UserController;

public class ProfilePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private UserController userController = null;
	private Users userProfile = null;
	private PremiumUser premiumUser = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblProfileTitle = null;
	private JLabel lblRegisterDNI = null;
	private JLabel lblRegisterName = null;
	private JLabel lblRegisterFirstSurname = null;
	private JLabel lblRegisterSecondSurname = null;
	private JLabel lblRegisterPasswd = null;
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
	private JLabel lblPersonalOpt = null;
	private JLabel lblCountOpt = null;
	private JLabel lblPremiumOpt = null;
	private JLabel lblUserDirOpt = null;
	private String registerUsername = null;
	
	private JButton NextBtn = null;
	private JButton btnCambiarContrasea = null;

	private String newPasswordToInsert = null;
	private String newPasswordConfirm = null;


	/**
	 * Create the panel.
	 */
	public ProfilePanel() {

		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					showUserInfor();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		lblProfileTitle = new JLabel("Cambiar perfil");
		lblProfileTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileTitle.setForeground(new Color(200, 40, 255));
		lblProfileTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblProfileTitle.setBounds(328, 32, 349, 64);
		add(lblProfileTitle);

		NextBtn = new JButton("Aceptar");
		NextBtn.setBounds(854, 567, 98, 33);
		NextBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(NextBtn);
		NextBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(true);
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
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);

			}

		});

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblPersonalOpt = new JLabel("DATOS PERSONALES");
		lblPersonalOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalOpt.setForeground(new Color(190, 30, 255));
		lblPersonalOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblPersonalOpt.setBounds(29, 107, 365, 64);
		add(lblPersonalOpt);

		lblRegisterName = new JLabel("Nombre: ");
		lblRegisterName.setForeground(Color.WHITE);
		lblRegisterName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterName.setBounds(74, 170, 365, 27);
		add(lblRegisterName);

		lblRegisterFirstSurname = new JLabel("Primer apellido: ");
		lblRegisterFirstSurname.setForeground(Color.WHITE);
		lblRegisterFirstSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterFirstSurname.setBounds(74, 208, 365, 32);
		add(lblRegisterFirstSurname);

		lblRegisterSecondSurname = new JLabel("Segundo Apellido: ");
		lblRegisterSecondSurname.setForeground(Color.WHITE);
		lblRegisterSecondSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterSecondSurname.setBounds(74, 248, 365, 32);
		add(lblRegisterSecondSurname);

		lblRegisterDNI = new JLabel("DNI: ");
		lblRegisterDNI.setForeground(Color.WHITE);
		lblRegisterDNI.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDNI.setBounds(74, 283, 282, 43);
		add(lblRegisterDNI);

		lblRegisterBirthDate = new JLabel("Fecha de Nacimiento: ");
		lblRegisterBirthDate.setForeground(Color.WHITE);
		lblRegisterBirthDate.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterBirthDate.setBounds(74, 324, 320, 32);
		add(lblRegisterBirthDate);

		lblCountOpt = new JLabel("DATOS DE LA CUENTA");
		lblCountOpt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountOpt.setForeground(new Color(190, 30, 255));
		lblCountOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblCountOpt.setBounds(41, 359, 365, 64);
		add(lblCountOpt);

		lblRegisterUsername = new JLabel("Nombre Usuario: ");
		lblRegisterUsername.setForeground(Color.WHITE);
		lblRegisterUsername.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUsername.setBounds(70, 418, 324, 31);
		add(lblRegisterUsername);

		lblRegisterPasswd = new JLabel("Contraseña: ");
		lblRegisterPasswd.setForeground(Color.WHITE);
		lblRegisterPasswd.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterPasswd.setBounds(70, 453, 324, 31);
		add(lblRegisterPasswd);

		lblRegisterUserType = new JLabel("Tipo de Usuario: ");
		lblRegisterUserType.setForeground(Color.WHITE);
		lblRegisterUserType.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUserType.setBounds(70, 495, 324, 31);
		add(lblRegisterUserType);

		lblRegisterDirection = new JLabel("Calle: ");
		lblRegisterDirection.setForeground(Color.WHITE);
		lblRegisterDirection.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDirection.setBounds(602, 170, 320, 32);
		add(lblRegisterDirection);

		lblRegisterCity = new JLabel("Ciudad: ");
		lblRegisterCity.setForeground(Color.WHITE);
		lblRegisterCity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCity.setBounds(602, 212, 291, 31);
		add(lblRegisterCity);

		lblRegisterProvince = new JLabel("Provincia: ");
		lblRegisterProvince.setForeground(Color.WHITE);
		lblRegisterProvince.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterProvince.setBounds(602, 255, 291, 31);
		add(lblRegisterProvince);

		lblRegisterCP = new JLabel("Codigo Postal: ");
		lblRegisterCP.setForeground(Color.WHITE);
		lblRegisterCP.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCP.setBounds(602, 297, 291, 31);
		add(lblRegisterCP);

		lblRegisterCountName = new JLabel("Numero de Cuenta: ");
		lblRegisterCountName.setForeground(Color.WHITE);
		lblRegisterCountName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCountName.setBounds(602, 434, 349, 31);
		add(lblRegisterCountName);

		lblRegisterCardCaducity = new JLabel("Caducidad: ");
		lblRegisterCardCaducity.setForeground(Color.WHITE);
		lblRegisterCardCaducity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCardCaducity.setBounds(602, 470, 340, 31);
		add(lblRegisterCardCaducity);

		lblRegisterCVV = new JLabel("CVV o CVC: ");
		lblRegisterCVV.setForeground(Color.WHITE);
		lblRegisterCVV.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCVV.setBounds(603, 514, 319, 31);
		add(lblRegisterCVV);

		lblPremiumOpt = new JLabel("OPCIONES PREMIUM");
		lblPremiumOpt.setHorizontalAlignment(SwingConstants.LEFT);
		lblPremiumOpt.setForeground(new Color(190, 30, 255));
		lblPremiumOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblPremiumOpt.setBounds(602, 369, 365, 64);
		add(lblPremiumOpt);

		lblUserDirOpt = new JLabel("DIRECCION");
		lblUserDirOpt.setForeground(new Color(190, 30, 255));
		lblUserDirOpt.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblUserDirOpt.setBounds(602, 107, 365, 64);
		add(lblUserDirOpt);

		btnCambiarContrasea = new JButton("Cambiar contraseña");
		btnCambiarContrasea.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				newPasswordToInsert = JOptionPane.showInputDialog("Ingrese la nueva contraseña: ");
				newPasswordConfirm = JOptionPane.showInputDialog("Por favor, repita la contraseña: ");

				if (newPasswordToInsert.equals(newPasswordConfirm)) {
					if (userController.changeUserPassword(newPasswordToInsert, Sesion.getInstance().getUserInfo().getLoginUser())) {
						JOptionPane.showMessageDialog(null, "Contrasenya cambiada correctamente", "OK!!",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "No se ha podido cambiar la contraseña", "Error",
								JOptionPane.ERROR_MESSAGE);

					}
				} else
					JOptionPane.showMessageDialog(null, "No se ha introducido la misma contraseña en los dos campos",
							"Error", JOptionPane.ERROR_MESSAGE);
			}

			
		});
		btnCambiarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCambiarContrasea.setBounds(359, 567, 192, 33);
		add(btnCambiarContrasea);

	}

	public void showUserInfor() {
		userController = new UserController();

		premiumUser = new PremiumUser();
		userProfile =Sesion.getInstance().getUserInfo();

		if (null != userProfile) {

			lblRegisterName.setText("Nombre usuario: " + userProfile.getNameUser());
			lblRegisterPasswd.setText("Contrasena: " + userProfile.getUserPassword());
			lblRegisterDNI.setText("DNI: " + userProfile.getDNI());
			lblRegisterName.setText("Nombre: " + userProfile.getNameUser());
			lblRegisterFirstSurname.setText("Apellido: " + userProfile.getSurName1());
			if (null != userProfile.getSurName2()) {
				lblRegisterSecondSurname.setText("Apellido2: " + userProfile.getSurName2());
			} else {
				lblRegisterSecondSurname.setText("Apellido2: No identificado");
			}
			lblRegisterBirthDate.setText("Fecha de nacimiento: " + userProfile.getBirthDateUser().toString());
			lblRegisterDirection.setText("Direccion: " + userProfile.getDirUser());
			Integer userCp = userProfile.getcPUser();
			lblRegisterCP.setText("Codigo postal: " + Integer.toString(userCp));
			lblRegisterCity.setText("Ciudad: " + userProfile.getUserCity());
			lblRegisterUserType.setText("Cuenta: " + userProfile.getAccountType());
			lblRegisterProvince.setText("Provincia: " + userProfile.getUserProvince());
			lblRegisterUsername.setText("Nombre usuario: " + userProfile.getLoginUser());
			if (userProfile.getAccountType().equals("Premium")) {
				premiumUser = userController.getPremiumUserInfo(Sesion.getInstance().getUserInfo().getLoginUser());
				lblRegisterCountName.setText("Numero de cuenta: " + premiumUser.getCountNum());
				lblRegisterCardCaducity.setText("Caducidad: " + premiumUser.getCaducity());
				lblRegisterCVV.setText("Numero de cuenta: " + premiumUser.getcVV());

			}
		} else {
			JOptionPane.showMessageDialog(null, "No se ha cargado la informacion", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public JPanel getProfilePanel() {
		// TODO Auto-generated method stub
		return this;
	}

}

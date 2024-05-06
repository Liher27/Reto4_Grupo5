package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Users;
import errekamusic.logica.UserController;

public class ProfilePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private UserController userController = null;
	private Users userProfile = null;

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

	private String registerPasswd = null;
	private String registerDNI = null;
	private String registerName = null;
	private String registerFirstSurname = null;
	private String registerSecondSurname = null;
	private LocalDate registerBirthDate = null;
	private String registerDirection = null;
	private int registerCP = 0;
	private String registerCity = null;
	private String registerProvince = null;
	private String registerUsername = null;
	private String registerAccType = null;
	private String registerCountNum = null;
	private String registerCardCaducity = null;
	private String registerCVV = null;
	private String userName = null;

	private JButton NextBtn = null;
	private JButton btnCambiarContrasea = null;

	private String newPasswordToInsert = null;
	private String newPasswordConfirm = null;

	private List<Users> userInfor = null;

	/**
	 * Create the panel.
	 */
	public ProfilePanel(List <JPanel> paneles) {

		
		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		
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

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(true);
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

		lblRegisterName = new JLabel("Nombre: " + registerName);
		lblRegisterName.setForeground(Color.WHITE);
		lblRegisterName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterName.setBounds(74, 170, 365, 27);
		add(lblRegisterName);

		lblRegisterFirstSurname = new JLabel("Primer apellido: " + registerFirstSurname);
		lblRegisterFirstSurname.setForeground(Color.WHITE);
		lblRegisterFirstSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterFirstSurname.setBounds(74, 208, 365, 32);
		add(lblRegisterFirstSurname);

		lblRegisterSecondSurname = new JLabel("Segundo Apellido: " + registerSecondSurname);
		lblRegisterSecondSurname.setForeground(Color.WHITE);
		lblRegisterSecondSurname.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterSecondSurname.setBounds(74, 248, 365, 32);
		add(lblRegisterSecondSurname);

		lblRegisterDNI = new JLabel("DNI: " + registerDNI);
		lblRegisterDNI.setForeground(Color.WHITE);
		lblRegisterDNI.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDNI.setBounds(74, 283, 282, 43);
		add(lblRegisterDNI);

		lblRegisterBirthDate = new JLabel("Fecha de Nacimiento: " + registerBirthDate);
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

		lblRegisterUsername = new JLabel("Nombre Usuario: " + registerName);
		lblRegisterUsername.setForeground(Color.WHITE);
		lblRegisterUsername.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUsername.setBounds(70, 418, 324, 31);
		add(lblRegisterUsername);

		lblRegisterPasswd = new JLabel("Contraseña: " + registerPasswd);
		lblRegisterPasswd.setForeground(Color.WHITE);
		lblRegisterPasswd.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterPasswd.setBounds(70, 453, 324, 31);
		add(lblRegisterPasswd);

		lblRegisterUserType = new JLabel("Tipo de Usuario: " + lblRegisterUserType);
		lblRegisterUserType.setForeground(Color.WHITE);
		lblRegisterUserType.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterUserType.setBounds(70, 495, 324, 31);
		add(lblRegisterUserType);

		lblRegisterDirection = new JLabel("Calle: " + registerDirection);
		lblRegisterDirection.setForeground(Color.WHITE);
		lblRegisterDirection.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterDirection.setBounds(602, 170, 320, 32);
		add(lblRegisterDirection);

		lblRegisterCity = new JLabel("Ciudad: " + registerCity);
		lblRegisterCity.setForeground(Color.WHITE);
		lblRegisterCity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCity.setBounds(602, 212, 291, 31);
		add(lblRegisterCity);

		lblRegisterProvince = new JLabel("Provincia: " + registerProvince);
		lblRegisterProvince.setForeground(Color.WHITE);
		lblRegisterProvince.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterProvince.setBounds(602, 255, 291, 31);
		add(lblRegisterProvince);

		lblRegisterCP = new JLabel("Codigo Postal: " + registerCP);
		lblRegisterCP.setForeground(Color.WHITE);
		lblRegisterCP.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCP.setBounds(602, 297, 291, 31);
		add(lblRegisterCP);

		lblRegisterCountName = new JLabel("Numero de Cuenta: " + registerCountNum);
		lblRegisterCountName.setForeground(Color.WHITE);
		lblRegisterCountName.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCountName.setBounds(602, 434, 349, 31);
		add(lblRegisterCountName);

		lblRegisterCardCaducity = new JLabel("Caducidad: " + registerCardCaducity);
		lblRegisterCardCaducity.setForeground(Color.WHITE);
		lblRegisterCardCaducity.setFont(new Font("Segoe UI Semilight", Font.BOLD, 17));
		lblRegisterCardCaducity.setBounds(602, 470, 340, 31);
		add(lblRegisterCardCaducity);

		lblRegisterCVV = new JLabel("CVV o CVC: " + registerCVV);
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
					if (userController.changeUserPassword(newPasswordToInsert, registerUsername)) {
						JOptionPane.showMessageDialog(null, "Contrasenya cambiada correctamente", "OK!!",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else
					JOptionPane.showMessageDialog(null, "No se ha introducido la misma contraseña en los dos campos",
							"Error", JOptionPane.ERROR_MESSAGE);
			}

		});
		btnCambiarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCambiarContrasea.setBounds(359, 567, 192, 33);
		add(btnCambiarContrasea);
		
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					showUserInfor(userName);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void showUserInfor(String userField) {
		
		userInfor = new ArrayList<Users>();

		userController = new UserController();
		
		userInfor = userController.getLogedUser(userName);

		if (!userInfor.isEmpty()) {
		    userProfile = new Users();
			userProfile = userInfor.get(0);

			registerPasswd = userProfile.getUserPassword();
			registerDNI = userProfile.getDNI();
			registerName = userProfile.getNameUser();
			registerFirstSurname = userProfile.getSurName1();
			registerSecondSurname = userProfile.getSurName2();
			registerBirthDate = userProfile.getBirthDateUser();
			registerDirection = userProfile.getDirUser();
			registerCP = userProfile.getcPUser();
			registerCity = userProfile.getUserCity();
			registerAccType = userProfile.getAccountType();
			registerProvince = userProfile.getUserProvince();
		} else {
			JOptionPane.showMessageDialog(null, "No se ha cargado la informacion",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
		

	}

	public JPanel getPanelPerfiles() {
		// TODO Auto-generated method stub
		return this;
	}

}

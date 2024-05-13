package errekamusic.vista.complementos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import errekamusic.logica.Sesion;
import errekamusic.logica.UserController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private UserController userController = null;

	public JTextField userField = null;
	public JTextField passwdTextField = null;

	private JLabel passwdLbl = null;
	private JLabel userLbl = null;
	private JLabel logInTitleLbl = null;
	private JLabel lblErrekamusicLogo = null;
	private JLabel lblDontHaveAccount = null;
	private JLabel lblAreYouAdmin = null;

	private JButton registerBtn = null;
	private JButton logInPanelNextBtn = null;
	private JButton adminPanelBtn = null;

	private int loginErrorCounter = 0;

	public LoginPanel() {

		setBackground(new Color(0, 0, 0));
		setBounds(0, 0, 984, 611);
		setLayout(null);

		logInTitleLbl = new JLabel("INICIA SESION");
		logInTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		logInTitleLbl.setForeground(new Color(255, 255, 255));
		logInTitleLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		logInTitleLbl.setBounds(328, 32, 337, 64);
		add(logInTitleLbl);

		userLbl = new JLabel("Usuario:");
		userLbl.setForeground(new Color(190, 30, 255));
		userLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		userLbl.setBounds(300, 386, 109, 14);
		add(userLbl);

		passwdLbl = new JLabel("Contraseña:");
		passwdLbl.setForeground(new Color(190, 30, 255));
		passwdLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		passwdLbl.setBounds(300, 456, 109, 14);
		add(passwdLbl);

		userField = new JTextField();
		userField.setBounds(470, 385, 211, 20);
		add(userField);
		userField.setColumns(10);

		passwdTextField = new JPasswordField();
		passwdTextField.setBounds(470, 455, 211, 20);
		add(passwdTextField);
		passwdTextField.setColumns(10);

		logInPanelNextBtn = new JButton("Aceptar");
		logInPanelNextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(passwdTextField.getText().toString());
				userController = new UserController();

				if (loginErrorCounter < 3) {
					if (!userField.getText().isEmpty() && passwdTextField.getText().length() > 0) {
						if (userController.confirmLogedUser(userField.getText().toString(),
								passwdTextField.getText().toString())) {

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

							Sesion.getInstance().setUserInfo(userController.getLogedUser(userField.getText().toString()));

							JOptionPane.showMessageDialog(null, "Registro completado correctamente", "Bienvenido!!",
									JOptionPane.INFORMATION_MESSAGE);
							loginErrorCounter = 0;
							userField.setText("");
							passwdTextField.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Usuario o contraseñas incorrectas", "Error",
									JOptionPane.ERROR_MESSAGE);
							loginErrorCounter++;
							userField.setText("");
							passwdTextField.setText("");
						}
					} else {
						JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenalo por favor", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else if (loginErrorCounter > 2) {
					JOptionPane.showMessageDialog(null,
							"Se ha bloqueado el acceso a la aplicacion por demasiados intentos", "Tonto",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		logInPanelNextBtn.setBounds(851, 556, 98, 33);
		add(logInPanelNextBtn);

		registerBtn = new JButton("Registro");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(true);
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
		});
		registerBtn.setBounds(43, 556, 98, 33);
		add(registerBtn);

		lblErrekamusicLogo = new JLabel("");
		lblErrekamusicLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrekamusicLogo.setBounds(298, 108, 422, 230);
		lblErrekamusicLogo.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		add(lblErrekamusicLogo);

		lblDontHaveAccount = new JLabel("¿No tienes cuenta?");
		lblDontHaveAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDontHaveAccount.setForeground(new Color(190, 30, 255));
		lblDontHaveAccount.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblDontHaveAccount.setBounds(30, 531, 129, 20);
		add(lblDontHaveAccount);

		adminPanelBtn = new JButton("Panel admin");
		adminPanelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userController = new UserController();

				
				
				if (loginErrorCounter < 3) {
					if (!userField.getText().isEmpty() && passwdTextField.getText().toString().length() > 0) {
						if (userController.isAdminUser(userField.getText().toString()) && userController.confirmLogedUser(
								userField.getText().toString(), passwdTextField.getText().toString())) {

							Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
							Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
							Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
							Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
							Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
							Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
							Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
							Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
							Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
							Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(true);
							Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
							Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
							Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
							Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

							Sesion.getInstance().setUserInfo(userController.getLogedUser(userField.getText().toString()));
							
							JOptionPane.showMessageDialog(null, "Bienvenido, administrador", "Bienvenido!!",
									JOptionPane.INFORMATION_MESSAGE);

							loginErrorCounter = 0;
							userField.setText("");
							passwdTextField.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Usuario o contraseñas incorrectas", "Error",
									JOptionPane.ERROR_MESSAGE);
							loginErrorCounter++;
							userField.setText("");
							passwdTextField.setText("");
						}
					} else {
						JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenalo por favor", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else if (loginErrorCounter > 2) {
					JOptionPane.showMessageDialog(null,
							"Se ha bloqueado el acceso a la aplicacion por demasiados intentos", "Tonto",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		adminPanelBtn.setBounds(408, 556, 98, 33);
		add(adminPanelBtn);

		lblAreYouAdmin = new JLabel("¿Eres administrador?");
		lblAreYouAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYouAdmin.setForeground(new Color(190, 30, 255));
		lblAreYouAdmin.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblAreYouAdmin.setBounds(386, 531, 143, 20);
		add(lblAreYouAdmin);
	}

	public JPanel getLoginPanel() {
		return this;
	}
}

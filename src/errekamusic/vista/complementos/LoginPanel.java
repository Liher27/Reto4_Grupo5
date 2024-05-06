
package errekamusic.vista.complementos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import errekamusic.logica.UserController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

public class LoginPanel {

	private JPanel panelDeLogin = null;
	private UserController userController = null;
	private ProfilePanel profilePanel = null;

	public JTextField userField = null;
	public JPasswordField passwdTextField = null;

	private JLabel passwdLbl = null;
	private JLabel userLbl = null;
	private JLabel logInTitleLbl = null;
	private JLabel lblErrekamusicLogo = null;
	private JLabel lblDontHaveAccount = null;

	private JButton registerBtn = null;
	private JButton logInPanelNextBtn = null;


	public LoginPanel(ArrayList<JPanel> paneles) {
		panelDeLogin = new JPanel();
		panelDeLogin.setForeground(new Color(0, 0, 0));
		panelDeLogin.setBackground(new Color(0, 0, 0));
		panelDeLogin.setBounds(0, 0, 984, 611);
		panelDeLogin.setLayout(null);

		logInTitleLbl = new JLabel("INICIA SESION");
		logInTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		logInTitleLbl.setForeground(new Color(255, 255, 255));
		logInTitleLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		logInTitleLbl.setBounds(328, 32, 337, 64);
		panelDeLogin.add(logInTitleLbl);

		userLbl = new JLabel("Usuario:");
		userLbl.setForeground(new Color(190, 30, 255));
		userLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		userLbl.setBounds(300, 386, 109, 14);
		panelDeLogin.add(userLbl);

		passwdLbl = new JLabel("Contraseña:");
		passwdLbl.setForeground(new Color(190, 30, 255));
		passwdLbl.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		passwdLbl.setBounds(300, 456, 109, 14);
		panelDeLogin.add(passwdLbl);

		userField = new JTextField();
		userField.setBounds(470, 385, 211, 20);
		panelDeLogin.add(userField);
		userField.setColumns(10);

		passwdTextField = new JPasswordField();
		passwdTextField.setBounds(470, 455, 211, 20);
		panelDeLogin.add(passwdTextField);
		passwdTextField.setColumns(10);

		logInPanelNextBtn = new JButton("Aceptar");
		logInPanelNextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				userController = new UserController();
				if (!userField.getText().isEmpty() && passwdTextField.getPassword().length > 0) {
					if (userController.confirmLogedUser(userField, passwdTextField)) {
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
						
						profilePanel = new ProfilePanel(paneles);
						profilePanel.setUserName(userField.toString());

						JOptionPane.showMessageDialog(null, "Registro completado correctamente", "Bienvenido!!",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Usuario o contraseñas incorrectas", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				} else {
					JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenalo por favor", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		logInPanelNextBtn.setBounds(851, 556, 98, 33);
		panelDeLogin.add(logInPanelNextBtn);

		registerBtn = new JButton("Registro");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(true);
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
		registerBtn.setBounds(43, 556, 98, 33);
		panelDeLogin.add(registerBtn);

		lblErrekamusicLogo = new JLabel("");
		lblErrekamusicLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrekamusicLogo.setBounds(298, 108, 422, 230);
		lblErrekamusicLogo.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		panelDeLogin.add(lblErrekamusicLogo);

		lblDontHaveAccount = new JLabel("¿No tienes cuenta?");
		lblDontHaveAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDontHaveAccount.setForeground(new Color(190, 30, 255));
		lblDontHaveAccount.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblDontHaveAccount.setBounds(30, 531, 129, 20);
		panelDeLogin.add(lblDontHaveAccount);

	}

	public JPanel getPanelDeLogin() {
		return panelDeLogin;
	}


}

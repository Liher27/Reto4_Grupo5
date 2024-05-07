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

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private UserController userController = null;
//	private ProfilePanel profilePanel = null;

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

				userController = new UserController();
				if (!userField.getText().isEmpty() && passwdTextField.getPassword().length > 0) {
					if (userController.confirmLogedUser(userField.getText().toString(), passwdTextField.getPassword().toString())) {
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
		add(logInPanelNextBtn);

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
		
		JButton Enter = new JButton("Enter");
		Enter.addActionListener(new ActionListener() {
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
		Enter.setBounds(414, 543, 98, 33);
		add(Enter);
	}

	public JPanel getPanelDeLogin() {
		return this;
	}
}


package errekamusic.vista.complementos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

public class LoginPanel {

	private JPanel panelDeLogin = null;
	
	public JTextField fieldUsuario = null;

	private JLabel passwdLbl = null;
	private JLabel userLbl = null;
	private JLabel logInTitleLbl = null;
	private JLabel lblErrekamusicLogo = null;

	private JButton registerBtn = null;
	private JButton logInPanelNextBtn = null;

	public JPasswordField passwdTextField = null;

	public LoginPanel(ArrayList<JPanel> paneles) {
		panelDeLogin = new JPanel();
		panelDeLogin.setForeground(new Color(0, 0, 0));
		panelDeLogin.setBackground(new Color(0, 0, 0));
		panelDeLogin.setBounds(0, 0, 984, 611);
		panelDeLogin.setLayout(null);
		
		logInTitleLbl = new JLabel("Iniciar sesión");
		logInTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		logInTitleLbl.setForeground(new Color(255, 222, 89));
		logInTitleLbl.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		logInTitleLbl.setBounds(328, 32, 337, 64);
		panelDeLogin.add(logInTitleLbl);

		userLbl = new JLabel("Usuario");
		userLbl.setForeground(new Color(255, 222, 89));
		userLbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		userLbl.setBounds(300, 225, 109, 14);
		panelDeLogin.add(userLbl);

		passwdLbl = new JLabel("Contraseña");
		passwdLbl.setForeground(new Color(255, 222, 89));
		passwdLbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwdLbl.setBounds(300, 373, 109, 14);
		panelDeLogin.add(passwdLbl);

		fieldUsuario = new JTextField();
		fieldUsuario.setBounds(470, 224, 211, 20);
		panelDeLogin.add(fieldUsuario);
		fieldUsuario.setColumns(10);

		passwdTextField = new JPasswordField();
		passwdTextField.setBounds(470, 372, 211, 20);
		panelDeLogin.add(passwdTextField);
		passwdTextField.setColumns(10);

		logInPanelNextBtn = new JButton("Aceptar");
		logInPanelNextBtn.addActionListener(new ActionListener() {
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
		lblErrekamusicLogo.setBounds(10, 10, 145, 145);
		lblErrekamusicLogo.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		panelDeLogin.add(lblErrekamusicLogo);

	}

	public JPanel getPanelDeLogin() {
		return panelDeLogin;
	}
}

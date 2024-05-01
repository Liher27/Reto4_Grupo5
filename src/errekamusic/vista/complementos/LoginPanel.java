
package errekamusic.vista.complementos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

/**
 * Panel de login para logearse y registrarse
 */
public class LoginPanel {

	private JPanel panelDeLogin = null;

	public JTextField fieldUsuario = null;

	private JLabel labelContrasena = null;
	private JLabel labelUsuario = null;
	private JLabel tituloLogIn = null;
	private JLabel lblErrekamusicLogo = null;

	private JButton jButtonRegistro = null;
	private JButton jButtonLoginAceptar = null;

	public JPasswordField fieldContrasenna = null;

	/**
	 * 
	 * @param entradas El array que guarde los datos del usuario
	 */
	public LoginPanel(ArrayList<JPanel> paneles) {
		panelDeLogin = new JPanel();
		panelDeLogin.setForeground(new Color(0, 0, 0));
		panelDeLogin.setBackground(new Color(0, 0, 0));
		panelDeLogin.setBounds(0, 0, 984, 611);
		panelDeLogin.setLayout(null);

		tituloLogIn = new JLabel("Iniciar sesión");
		tituloLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLogIn.setForeground(new Color(255, 222, 89));
		tituloLogIn.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		tituloLogIn.setBounds(328, 32, 337, 64);
		panelDeLogin.add(tituloLogIn);

		labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(255, 222, 89));
		labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelUsuario.setBounds(300, 225, 109, 14);
		panelDeLogin.add(labelUsuario);

		labelContrasena = new JLabel("Contraseña");
		labelContrasena.setForeground(new Color(255, 222, 89));
		labelContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelContrasena.setBounds(300, 373, 109, 14);
		panelDeLogin.add(labelContrasena);

		fieldUsuario = new JTextField();
		fieldUsuario.setBounds(470, 224, 211, 20);
		panelDeLogin.add(fieldUsuario);
		fieldUsuario.setColumns(10);

		fieldContrasenna = new JPasswordField();
		fieldContrasenna.setBounds(470, 372, 211, 20);
		panelDeLogin.add(fieldContrasenna);
		fieldContrasenna.setColumns(10);

		jButtonLoginAceptar = new JButton("Aceptar");
		jButtonLoginAceptar.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
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

				/**
				 * Obtener el nombre de usuario para guardar en el array
				 */

				/**
				 * obtener los datos de cliente y guardar en el array
				 */

			}

		});
		jButtonLoginAceptar.setBounds(851, 556, 98, 33);
		panelDeLogin.add(jButtonLoginAceptar);

		jButtonRegistro = new JButton("Registro");
		jButtonRegistro.addActionListener(new ActionListener() {
			/**
			 * El boton para volver al panel de registro
			 */
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
		jButtonRegistro.setBounds(43, 556, 98, 33);
		panelDeLogin.add(jButtonRegistro);

		lblErrekamusicLogo = new JLabel("");
		lblErrekamusicLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrekamusicLogo.setBounds(10, 10, 145, 145);
		lblErrekamusicLogo.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		panelDeLogin.add(lblErrekamusicLogo);

	}

	/**
	 * Obtiene a este panel
	 * 
	 * @return panelDeLogin
	 */
	public JPanel getPanelDeLogin() {
		return panelDeLogin;
	}
}

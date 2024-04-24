
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
public class PanelDeLogin {
	/**
	 * campo de nombre
	 */
	public JTextField fieldUsuario = null;
	/**
	 * campo de contraseña
	 */
	public JPasswordField fieldContrasenna = null;

	private JPanel panelDeLogin;

	/**
	 * 
	 * @param entradas El array que guarde los datos del usuario
	 */
	public PanelDeLogin(ArrayList<JPanel> paneles) {
		panelDeLogin = new JPanel();
		panelDeLogin.setBackground(new Color(192, 192, 192));
		panelDeLogin.setBounds(0, 0, 984, 611);
		panelDeLogin.setLayout(null);

		JLabel tituloLogIn = new JLabel("Iniciar sesión");
		tituloLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLogIn.setForeground(new Color(253, 185, 74));
		tituloLogIn.setForeground(new Color(253, 185, 74));
		tituloLogIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloLogIn.setBounds(328, 32, 337, 64);
		panelDeLogin.add(tituloLogIn);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(0, 0, 0));
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelUsuario.setBounds(300, 225, 109, 14);
		panelDeLogin.add(labelUsuario);

		JLabel labelContrasena = new JLabel("Contraseña");
		labelContrasena.setForeground(new Color(0, 0, 0));
		labelContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
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

		JButton jButtonLoginAceptar = new JButton("Aceptar");
		jButtonLoginAceptar.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				GestorDeCliente gestorDeCliente = new GestorDeCliente();
				if (gestorDeCliente.obtenerUsuario(fieldUsuario, fieldContrasenna) != null) {
					if (!(fieldUsuario.getText().isEmpty()) || !(fieldContrasenna.getPassword().length < 0)) {
						Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
						Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
						Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
						Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
						Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
						Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
						Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
						Session.getInstance().getPanelDeTicket().getPanelDeTicket().setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenarlo Por favor", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

					/**
					 * Obtener el nombre de usuario para guardar en el array
					 */
					for (int j = 0; j < paneles.size(); j++) {
						Panel paneles = paneles.get(j);
						Cliente cliente = paneles.getCliente();
						if (cliente != null) {
							cliente.setNombre(fieldUsuario.getText());
						} else {
							Cliente newCliente = new Cliente();
							newCliente.setNombre(fieldUsuario.getText());
							paneles.setCliente(newCliente);
						}

					}
					/**
					 * obtener los datos de cliente y guardar en el array
					 */
					Cliente clienteLogeado = new GestorDeCliente().obtenerUsuario(fieldUsuario, fieldContrasenna);
					for (int i = 0; i < entradas.size(); i++) {
						Entrada entrada = entradas.get(i);
						entrada.setCliente(clienteLogeado);
					}
				}
			}
		});
		jButtonLoginAceptar.setBounds(530, 431, 98, 33);
		panelDeLogin.add(jButtonLoginAceptar);

		JButton jButtonRegistro = new JButton("Registro");
		jButtonRegistro.addActionListener(new ActionListener() {
			/**
			 * El boton para volver al panel de registro
			 */
			public void actionPerformed(ActionEvent e) {
				PanelDeBienvenida.getPanelDeBienvenida().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(true);

			}
		});
		jButtonRegistro.setBounds(100, 556, 98, 33);
		panelDeLogin.add(jButtonRegistro);

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeLogin.add(lblLogoCineElorrieta);

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

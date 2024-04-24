
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;


/**
 * El panel inicio de nuestro programa
 */
public class PanelDeBienvenida {

	private JPanel panelDeBienvenida = null;
	private JLabel lblBienvenida = null;
	private JLabel lblLogoErrekamusic = null;


	/**
	 * El panel Bienvenida
	 * @param paneles 
	 */
	public PanelDeBienvenida(ArrayList<JPanel> paneles) {

		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBounds(0, 0, 984, 611);
		panelDeBienvenida.setBackground(new Color(192, 192, 192));

		lblBienvenida = new JLabel("");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setBounds(0, 0, 984, 611);

		lblBienvenida.addMouseListener(new MouseAdapter() {
			/**
			 * Cuando hagamos click en ello nos pasamos al panel de Login
			 */
			public void mouseClicked(MouseEvent e) {
				esperar();
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(true);
				paneles.get(2).setVisible(false);


			}
		});

		panelDeBienvenida.setLayout(null);
		lblBienvenida.setIcon(new ImageIcon(""));
		panelDeBienvenida.add(lblBienvenida);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(33, 33, 90, 90);
		lblLogoErrekamusic.setIcon(new ImageIcon(""));
		panelDeBienvenida.add(lblLogoErrekamusic);
	}

	/**
	 * Nos devuelve el panel
	 * 
	 * @return panelDeBienvenida
	 */
	public JPanel inicializarPanelDeBienvenida() {
		return panelDeBienvenida;
	}

	private void esperar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}

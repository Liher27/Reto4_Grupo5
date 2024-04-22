
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 * El panel inicio de nuestro programa
 */
public class PanelDeBienvenida {

	private JPanel panelDeBienvenida = null;
	private JLabel lblBienvenida = null;
	private JLabel lblLogoErrekaMusic = null;

	/**
	 * El panel Bienvenida
	 */
	public PanelDeBienvenida() {

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
			

				
				
				
				
				
			}
		});

		panelDeBienvenida.setLayout(null);
		lblBienvenida.setIcon(new ImageIcon(""));
		panelDeBienvenida.add(lblBienvenida);

		lblLogoErrekaMusic = new JLabel("");
		lblLogoErrekaMusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekaMusic.setBounds(33, 33, 90, 90);
		lblLogoErrekaMusic.setIcon(new ImageIcon(""));
		panelDeBienvenida.add(lblLogoErrekaMusic);
	}

	/**
	 * Nos devuelve el panel
	 * 
	 * @return panelDeBienvenida
	 */
	public JPanel getPanelDeBienvenida() {
		return panelDeBienvenida;
	}

	private void esperar() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}

}

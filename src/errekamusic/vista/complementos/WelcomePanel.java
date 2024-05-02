
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 * El panel inicio de nuestro programa
 */
public class WelcomePanel {

	private JPanel welcomePanel = null;
	private JLabel transparentButtonLbl = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblWelcomeMessage = null;


	/**
	 * El panel Bienvenida
	 * @param paneles 
	 */
	public WelcomePanel(ArrayList<JPanel> paneles) {

		welcomePanel = new JPanel();
		welcomePanel.setBounds(0, 0, 984, 611);
		welcomePanel.setBackground(Color.black);

		transparentButtonLbl = new JLabel("");
		transparentButtonLbl.setHorizontalAlignment(SwingConstants.CENTER);
		transparentButtonLbl.setBounds(0, 0, 984, 611);

		transparentButtonLbl.addMouseListener(new MouseAdapter() {
			/**
			 * Cuando hagamos click en ello nos pasamos al panel de Login
			 */
			public void mouseClicked(MouseEvent e) {
				esperar();
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(true);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);


			}
		});

		welcomePanel.setLayout(null);
		transparentButtonLbl.setIcon(new ImageIcon(""));
		welcomePanel.add(transparentButtonLbl);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10,10,145,145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		welcomePanel.add(lblLogoErrekamusic);
		
		lblWelcomeMessage = new JLabel("");
		lblWelcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeMessage.setBounds(140, 191, 702, 215);
		lblWelcomeMessage.setIcon(new ImageIcon("contents/welcomeMessage.png"));
		welcomePanel.add(lblWelcomeMessage);
		
		
	}

	/**
	 * Nos devuelve el panel
	 * 
	 * @return panelDeBienvenida
	 */
	public JPanel inicializarPanelDeBienvenida() {
		return welcomePanel;
	}

	private void esperar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}

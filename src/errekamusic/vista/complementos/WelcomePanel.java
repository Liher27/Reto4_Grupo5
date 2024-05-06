
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;


/**
 * El panel inicio de nuestro programa
 */
public class WelcomePanel extends JPanel{

	private JLabel transparentButtonLbl = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblWelcomeMessage = null;


	/**
	 * El panel Bienvenida
	 * @param paneles 
	 */
	public WelcomePanel(ArrayList<JPanel> paneles) {

		setBounds(0, 0, 984, 611);
		setBackground(Color.black);

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

		setLayout(null);
		transparentButtonLbl.setIcon(new ImageIcon(""));
		add(transparentButtonLbl);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(330,50,300,200);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		add(lblLogoErrekamusic);
		
		lblWelcomeMessage = new JLabel("BIENVENIDO");
		lblWelcomeMessage.setForeground(new Color(190, 30, 255));
		lblWelcomeMessage.setFont(new Font("Segoe UI Black", Font.BOLD, 58));
		lblWelcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeMessage.setBounds(140, 290, 702, 215);
		add(lblWelcomeMessage);
		
		
	}

	/**
	 * Nos devuelve el panel
	 * 
	 * @return panelDeBienvenida
	 */
	public JPanel inicializarPanelDeBienvenida() {
		return this;
	}

	private void esperar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}

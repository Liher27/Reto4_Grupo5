
package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.logica.Singleton;

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
	public WelcomePanel() {

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
				
				Singleton.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Singleton.getInstance().getLoginPanel().getLoginPanel().setVisible(true);
				Singleton.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Singleton.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Singleton.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Singleton.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Singleton.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Singleton.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Singleton.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Singleton.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Singleton.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Singleton.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Singleton.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Singleton.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

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
	public JPanel getWelcomePanel() {
		return this;
	}

	private void esperar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}

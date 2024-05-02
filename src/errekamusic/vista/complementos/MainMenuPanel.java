package errekamusic.vista.complementos;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainMenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal = null;

	private JLabel lblMenuPrincipal = null;
	private JLabel lblNewLabel_2 = null;
	private JLabel lblProfilePicture = null;
	private JLabel mainMenuPanelExitBtn = null;
	private JLabel playlistsLbl = null;
	private JLabel discoverGroupsLbl = null;
	private JLabel discoverPodcastersLbl = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel overlayLbl = null;

	/**
	 * Create the panel.
	 */
	public MainMenuPanel(ArrayList<JPanel> paneles) {
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 984, 611);
		panelPrincipal.setBackground(new Color(0, 0, 0));
		panelPrincipal.setLayout(null);

		mainMenuPanelExitBtn = new JLabel("4. Salir ");
		mainMenuPanelExitBtn.setForeground(new Color(255, 222, 89));
		mainMenuPanelExitBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		mainMenuPanelExitBtn.setBounds(49, 396, 219, 25);
		panelPrincipal.add(mainMenuPanelExitBtn);
		mainMenuPanelExitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
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

		playlistsLbl = new JLabel("3. Ver playlists");
		playlistsLbl.setForeground(new Color(255, 222, 89));
		playlistsLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		playlistsLbl.setBounds(49, 332, 219, 25);
		panelPrincipal.add(playlistsLbl);
		playlistsLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(true);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}
		});

		discoverPodcastersLbl = new JLabel("2. Descubre podcasters");
		discoverPodcastersLbl.setForeground(new Color(255, 222, 89));
		discoverPodcastersLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		discoverPodcastersLbl.setBounds(49, 257, 219, 25);
		panelPrincipal.add(discoverPodcastersLbl);
		discoverPodcastersLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(true);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}
		});

		discoverGroupsLbl = new JLabel("1. Descubre Grupos");
		discoverGroupsLbl.setForeground(new Color(255, 222, 89));
		discoverGroupsLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		discoverGroupsLbl.setBounds(49, 197, 214, 25);
		panelPrincipal.add(discoverGroupsLbl);
		discoverGroupsLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(true);
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

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo(1).png"));
		panelPrincipal.add(lblLogoErrekamusic);

		overlayLbl = new JLabel("");
		overlayLbl.setBounds(0, 0, 305, 611);
		overlayLbl.setIcon(new ImageIcon("contents/overlayClr.png"));
		panelPrincipal.add(overlayLbl);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		panelPrincipal.add(lblProfilePicture);
		lblProfilePicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(true);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);
			}
		});

		lblMenuPrincipal = new JLabel("MENU PRINCIPAL");
		lblMenuPrincipal.setForeground(new Color(255, 222, 89));
		lblMenuPrincipal.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 30));
		lblMenuPrincipal.setBounds(325, 31, 266, 106);
		panelPrincipal.add(lblMenuPrincipal);
		lblMenuPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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

		lblNewLabel_2 = new JLabel("Propagandaaaa ponerrr!!");
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_2.setBounds(491, 204, 376, 210);
		panelPrincipal.add(lblNewLabel_2);

	}

	public JPanel getPanelPrincipal() {
		// TODO Auto-generated method stub
		return panelPrincipal;
	}
}

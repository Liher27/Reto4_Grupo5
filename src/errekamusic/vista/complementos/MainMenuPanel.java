package errekamusic.vista.complementos;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.logica.DiscController;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainMenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel mainMenuPanel = null;

	private JLabel lblMenuPrincipal = null;
	private JLabel propagandaImageLbl = null;
	private JLabel lblProfilePicture = null;
	private JLabel mainMenuPanelExitBtn = null;
	private JLabel playlistsLbl = null;
	private JLabel discoverGroupsLbl = null;
	private JLabel discoverPodcastersLbl = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel overlayLbl = null;
	private JLabel mainMenuContentPlayerLblBtn = null;
	private JLabel groupDiscBelongLbl = null;
	private JLabel discNameLbl = null;
	private JLabel propagandaDiscDateLbl = null;
	private JLabel propagandaDiscGenreLbl = null;
	private JLabel layOutForPropagandaLbl = null;
	private JLabel seeYourProfileLbl = null;

	private List<Disc> discInfo = null;
	private DiscController discController = null;
	private Disc discForPropaganda = null;

	private Random randomNumberToExecute = null;
	private int randomDiscID = 0;
	private ImageIcon discImageIcon = null;

	/**
	 * Create the panel.
	 */
	public MainMenuPanel(ArrayList<JPanel> paneles) {
		mainMenuPanel = new JPanel();
		mainMenuPanel.setBounds(0, 0, 984, 611);
		mainMenuPanel.setBackground(new Color(0, 0, 0));
		mainMenuPanel.setLayout(null);

		propagandaImageLbl = new JLabel("");
		propagandaImageLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaImageLbl.setBounds(462, 157, 327, 317);
		mainMenuPanel.add(propagandaImageLbl);

		layOutForPropagandaLbl = new JLabel("");
		layOutForPropagandaLbl.setIcon(new ImageIcon("contents/layOutForPropaganda.png"));
		layOutForPropagandaLbl.setFont(new Font("Myanmar Text", Font.BOLD, 99));
		layOutForPropagandaLbl.setBounds(432, 125, 387, 382);
		mainMenuPanel.add(layOutForPropagandaLbl);

		discoverGroupsLbl = new JLabel("Descubre grupos");
		discoverGroupsLbl.setForeground(new Color(255, 255, 255));
		discoverGroupsLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		discoverGroupsLbl.setBounds(44, 266, 214, 25);
		mainMenuPanel.add(discoverGroupsLbl);
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

		discoverPodcastersLbl = new JLabel("Descubre podcasters");
		discoverPodcastersLbl.setForeground(new Color(255, 255, 255));
		discoverPodcastersLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		discoverPodcastersLbl.setBounds(44, 302, 214, 25);
		mainMenuPanel.add(discoverPodcastersLbl);
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

		playlistsLbl = new JLabel("Ver playlists");
		playlistsLbl.setForeground(new Color(255, 255, 255));
		playlistsLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		playlistsLbl.setBounds(44, 338, 219, 25);
		mainMenuPanel.add(playlistsLbl);
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

		mainMenuPanelExitBtn = new JLabel("Salir ");
		mainMenuPanelExitBtn.setForeground(new Color(190, 30, 255));
		mainMenuPanelExitBtn.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		mainMenuPanelExitBtn.setBounds(49, 460, 219, 25);
		mainMenuPanel.add(mainMenuPanelExitBtn);
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
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);
			}
		});

		mainMenuContentPlayerLblBtn = new JLabel("Reproductor de contenido");
		mainMenuContentPlayerLblBtn.setForeground(new Color(255, 255, 255));
		mainMenuContentPlayerLblBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		mainMenuContentPlayerLblBtn.setBounds(44, 374, 261, 25);
		mainMenuPanel.add(mainMenuContentPlayerLblBtn);
		mainMenuContentPlayerLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(true);
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
		lblLogoErrekamusic.setBounds(44, 93, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo(1).png"));
		mainMenuPanel.add(lblLogoErrekamusic);

		overlayLbl = new JLabel("");
		overlayLbl.setBounds(0, 0, 305, 611);
		overlayLbl.setIcon(new ImageIcon("contents/overlayClr.jpg"));
		mainMenuPanel.add(overlayLbl);

		lblMenuPrincipal = new JLabel("");
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setFont(new Font("Segoe UI", Font.BOLD, 39));
		lblMenuPrincipal.setBounds(472, 11, 266, 99);
		lblMenuPrincipal.setIcon(new ImageIcon("contents/errekaMusicLogoForMainMenu.png"));
		mainMenuPanel.add(lblMenuPrincipal);
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
		mainMenuPanel.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					getPropagandaImage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		discNameLbl = new JLabel("");
		discNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		discNameLbl.setForeground(new Color(190, 30, 255));
		discNameLbl.setFont(new Font("Arial Black", Font.BOLD, 40));
		discNameLbl.setBounds(468, 517, 327, 47);
		mainMenuPanel.add(discNameLbl);

		groupDiscBelongLbl = new JLabel("");
		groupDiscBelongLbl.setHorizontalAlignment(SwingConstants.CENTER);
		groupDiscBelongLbl.setForeground(new Color(255, 255, 255));
		groupDiscBelongLbl.setFont(new Font("Arial Black", Font.BOLD, 13));
		groupDiscBelongLbl.setBounds(383, 575, 190, 25);
		mainMenuPanel.add(groupDiscBelongLbl);

		propagandaDiscDateLbl = new JLabel("");
		propagandaDiscDateLbl.setForeground(new Color(255, 255, 255));
		propagandaDiscDateLbl.setFont(new Font("Arial Black", Font.BOLD, 13));
		propagandaDiscDateLbl.setBounds(603, 575, 214, 25);
		mainMenuPanel.add(propagandaDiscDateLbl);

		propagandaDiscGenreLbl = new JLabel("");
		propagandaDiscGenreLbl.setForeground(new Color(255, 255, 255));
		propagandaDiscGenreLbl.setFont(new Font("Arial Black", Font.BOLD, 13));
		propagandaDiscGenreLbl.setBounds(776, 575, 151, 25);
		mainMenuPanel.add(propagandaDiscGenreLbl);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(923, 11, 51, 51);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.jpg"));
		mainMenuPanel.add(lblProfilePicture);
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

		seeYourProfileLbl = new JLabel("Ver perfil");
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		mainMenuPanel.add(seeYourProfileLbl);

	}

	public void getPropagandaImage() throws Exception {
		randomNumberToExecute = new Random();

		discInfo = new ArrayList<Disc>();
		randomDiscID = (randomNumberToExecute.nextInt(3) + 1);

		discController = new DiscController();

		discInfo = discController.GetDiscForPropaganda(randomDiscID);
		if (null != discInfo) {
			discForPropaganda = discInfo.get(0);

			discNameLbl.setText(discForPropaganda.getCollectionName().toUpperCase());
			groupDiscBelongLbl.setText(discForPropaganda.getArtist().getArtistName());
			propagandaDiscDateLbl.setText(discForPropaganda.getCollectionDate().toString());
			propagandaDiscGenreLbl.setText(discForPropaganda.getCollectionGenre());
			discImageIcon = discForPropaganda.getCollectionImage();
			propagandaImageLbl.setIcon(discImageIcon);
		}

	}

	public JPanel getPanelPrincipal() {
		return mainMenuPanel;
	}
}

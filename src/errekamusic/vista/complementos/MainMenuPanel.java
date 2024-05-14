package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.logica.CollectionController;
import errekamusic.logica.Sesion;

public class MainMenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;

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
	private CollectionController discController = null;
	private Disc discForPropaganda = null;

	private Random randomNumberToExecute = null;
	private int randomDiscID = 0;
	private ImageIcon discImageIcon = null;

	/**
	 * Create the panel.
	 */
	public MainMenuPanel() {
		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		discoverGroupsLbl = new JLabel("Descubre grupos");
		discoverGroupsLbl.setForeground(new Color(255, 255, 255));
		discoverGroupsLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		discoverGroupsLbl.setBounds(44, 266, 214, 25);
		add(discoverGroupsLbl);
		discoverGroupsLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(true);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
			}
		});

		discoverPodcastersLbl = new JLabel("Descubre podcasters");
		discoverPodcastersLbl.setForeground(new Color(255, 255, 255));
		discoverPodcastersLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		discoverPodcastersLbl.setBounds(44, 302, 214, 25);
		add(discoverPodcastersLbl);
		discoverPodcastersLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(true);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);

			}
		});

		playlistsLbl = new JLabel("Ver playlists");
		playlistsLbl.setForeground(new Color(255, 255, 255));
		playlistsLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		playlistsLbl.setBounds(44, 338, 219, 25);
		add(playlistsLbl);
		playlistsLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(true);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);

			}
		});

		mainMenuPanelExitBtn = new JLabel("Salir ");
		mainMenuPanelExitBtn.setForeground(new Color(190, 30, 255));
		mainMenuPanelExitBtn.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		mainMenuPanelExitBtn.setBounds(49, 460, 219, 25);
		add(mainMenuPanelExitBtn);
		mainMenuPanelExitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(true);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
			}
		});

		mainMenuContentPlayerLblBtn = new JLabel("Reproductor de contenido");
		mainMenuContentPlayerLblBtn.setForeground(new Color(255, 255, 255));
		mainMenuContentPlayerLblBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		mainMenuContentPlayerLblBtn.setBounds(44, 374, 261, 25);
		add(mainMenuContentPlayerLblBtn);
		mainMenuContentPlayerLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(true);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
			}
		});

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(44, 93, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo(1).png"));
		add(lblLogoErrekamusic);

		overlayLbl = new JLabel("");
		overlayLbl.setBounds(0, 0, 305, 611);
		overlayLbl.setIcon(new ImageIcon("contents/overlayClr.jpg"));
		add(overlayLbl);

		lblMenuPrincipal = new JLabel("");
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setFont(new Font("Segoe UI", Font.BOLD, 39));
		lblMenuPrincipal.setBounds(472, 11, 266, 99);
		lblMenuPrincipal.setIcon(new ImageIcon("contents/errekaMusicLogoForMainMenu.png"));
		add(lblMenuPrincipal);
		

		propagandaImageLbl = new JLabel("");
		propagandaImageLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaImageLbl.setBounds(462, 157, 327, 317);
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					getPropagandaImage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		add(propagandaImageLbl);

		discNameLbl = new JLabel("");
		discNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		discNameLbl.setForeground(new Color(140, 82, 255));
		discNameLbl.setFont(new Font("Arial Black", Font.BOLD, 40));
		discNameLbl.setBounds(468, 517, 327, 47);
		add(discNameLbl);

		groupDiscBelongLbl = new JLabel("");
		groupDiscBelongLbl.setHorizontalAlignment(SwingConstants.CENTER);
		groupDiscBelongLbl.setForeground(new Color(255, 255, 255));
		groupDiscBelongLbl.setFont(new Font("Arial Black", Font.BOLD, 13));
		groupDiscBelongLbl.setBounds(383, 575, 190, 25);
		add(groupDiscBelongLbl);

		propagandaDiscDateLbl = new JLabel("");
		propagandaDiscDateLbl.setForeground(new Color(255, 255, 255));
		propagandaDiscDateLbl.setFont(new Font("Arial Black", Font.BOLD, 13));
		propagandaDiscDateLbl.setBounds(603, 575, 214, 25);
		add(propagandaDiscDateLbl);

		propagandaDiscGenreLbl = new JLabel("");
		propagandaDiscGenreLbl.setForeground(new Color(255, 255, 255));
		propagandaDiscGenreLbl.setFont(new Font("Arial Black", Font.BOLD, 13));
		propagandaDiscGenreLbl.setBounds(776, 575, 151, 25);
		add(propagandaDiscGenreLbl);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(923, 11, 51, 51);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.jpg"));
		add(lblProfilePicture);
		lblProfilePicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(true);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
				
			}
		});

		seeYourProfileLbl = new JLabel("Ver perfil");
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		add(seeYourProfileLbl);

		layOutForPropagandaLbl = new JLabel("");
		layOutForPropagandaLbl.setIcon(new ImageIcon("contents/layOutForPropaganda.png"));
		layOutForPropagandaLbl.setForeground(new Color(255, 255, 255));
		layOutForPropagandaLbl.setFont(new Font("Myanmar Text", Font.BOLD, 99));
		layOutForPropagandaLbl.setBounds(432, 125, 387, 382);
		add(layOutForPropagandaLbl);

	}

	public void getPropagandaImage() throws Exception {
		randomNumberToExecute = new Random();

		discInfo = new ArrayList<Disc>();
		randomDiscID = (randomNumberToExecute.nextInt(3) + 1);

		discController = new CollectionController();

		discInfo = discController.GetDiscForPropaganda(randomDiscID);
		if (null != discInfo) {
			try {
				discForPropaganda = discInfo.get(0);

				discNameLbl.setText(discForPropaganda.getCollectionName().toUpperCase());
				groupDiscBelongLbl.setText(discForPropaganda.getArtist().getArtistName());
				propagandaDiscDateLbl.setText(discForPropaganda.getCollectionDate().toString());
				propagandaDiscGenreLbl.setText(discForPropaganda.getCollectionGenre());
				discImageIcon = discForPropaganda.getCollectionImage();
				propagandaImageLbl.setIcon(discImageIcon);
			} catch (Exception e) {

			}
		}

	}

	public JPanel getMainMenuPanel() {
		return this;
	}
}
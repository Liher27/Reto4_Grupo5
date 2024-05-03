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
	private JLabel discNameTitleLbl = null;
	private JLabel discNameLbl = null;
	private JLabel groupDiscBelongTitleLbl = null;
	private JLabel propagandaDiscDateTitleLbl = null;
	private JLabel propagandaDiscDateLbl = null;
	private JLabel propagandaDiscGenreTitleLbl = null;
	private JLabel propagandaDiscGenreLbl = null;

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

		discoverGroupsLbl = new JLabel("Descubre grupos");
		discoverGroupsLbl.setForeground(new Color(255, 222, 89));
		discoverGroupsLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		discoverGroupsLbl.setBounds(49, 166, 214, 25);
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
		discoverPodcastersLbl.setForeground(new Color(255, 222, 89));
		discoverPodcastersLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		discoverPodcastersLbl.setBounds(49, 243, 214, 25);
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
		playlistsLbl.setForeground(new Color(255, 222, 89));
		playlistsLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		playlistsLbl.setBounds(49, 317, 219, 25);
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
		mainMenuPanelExitBtn.setForeground(new Color(255, 222, 89));
		mainMenuPanelExitBtn.setFont(new Font("Cambria", Font.BOLD, 20));
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
				paneles.get(11).setVisible(true);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);
			}
		});

		mainMenuContentPlayerLblBtn = new JLabel("Reproductor de contenido");
		mainMenuContentPlayerLblBtn.setForeground(new Color(255, 222, 89));
		mainMenuContentPlayerLblBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		mainMenuContentPlayerLblBtn.setBounds(49, 393, 238, 25);
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
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo(1).png"));
		mainMenuPanel.add(lblLogoErrekamusic);

		overlayLbl = new JLabel("");
		overlayLbl.setBounds(0, 0, 305, 611);
		overlayLbl.setIcon(new ImageIcon("contents/overlayClr.png"));
		mainMenuPanel.add(overlayLbl);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
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

		lblMenuPrincipal = new JLabel("Menu principal");
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setForeground(new Color(255, 255, 255));
		lblMenuPrincipal.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 30));
		lblMenuPrincipal.setBounds(460, 10, 266, 106);
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

		propagandaImageLbl = new JLabel("");
		propagandaImageLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaImageLbl.setBounds(649, 198, 287, 287);
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
		mainMenuPanel.add(propagandaImageLbl);

		discNameTitleLbl = new JLabel("Nombre del disco: ");
		discNameTitleLbl.setForeground(new Color(127, 57, 206));
		discNameTitleLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		discNameTitleLbl.setBounds(383, 166, 214, 25);
		mainMenuPanel.add(discNameTitleLbl);

		discNameLbl = new JLabel("");
		discNameLbl.setForeground(new Color(255, 255, 255));
		discNameLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		discNameLbl.setBounds(383, 198, 214, 25);
		mainMenuPanel.add(discNameLbl);

		groupDiscBelongTitleLbl = new JLabel("Grupo:");
		groupDiscBelongTitleLbl.setForeground(new Color(127, 57, 206));
		groupDiscBelongTitleLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		groupDiscBelongTitleLbl.setBounds(383, 266, 214, 25);
		mainMenuPanel.add(groupDiscBelongTitleLbl);

		groupDiscBelongLbl = new JLabel("");
		groupDiscBelongLbl.setForeground(new Color(255, 255, 255));
		groupDiscBelongLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		groupDiscBelongLbl.setBounds(383, 302, 214, 25);
		mainMenuPanel.add(groupDiscBelongLbl);

		propagandaDiscDateTitleLbl = new JLabel("Fecha de publicacion:");
		propagandaDiscDateTitleLbl.setForeground(new Color(127, 57, 206));
		propagandaDiscDateTitleLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaDiscDateTitleLbl.setBounds(383, 377, 214, 25);
		mainMenuPanel.add(propagandaDiscDateTitleLbl);

		propagandaDiscDateLbl = new JLabel("");
		propagandaDiscDateLbl.setForeground(new Color(255, 255, 255));
		propagandaDiscDateLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaDiscDateLbl.setBounds(383, 405, 214, 25);
		mainMenuPanel.add(propagandaDiscDateLbl);

		propagandaDiscGenreTitleLbl = new JLabel("Genero");
		propagandaDiscGenreTitleLbl.setForeground(new Color(127, 57, 206));
		propagandaDiscGenreTitleLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaDiscGenreTitleLbl.setBounds(383, 478, 214, 25);
		mainMenuPanel.add(propagandaDiscGenreTitleLbl);

		propagandaDiscGenreLbl = new JLabel("");
		propagandaDiscGenreLbl.setForeground(new Color(255, 255, 255));
		propagandaDiscGenreLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		propagandaDiscGenreLbl.setBounds(383, 512, 214, 25);
		mainMenuPanel.add(propagandaDiscGenreLbl);

	}

	public void getPropagandaImage() throws Exception{
		randomNumberToExecute = new Random();
		
		discInfo = new ArrayList<Disc>();
		randomDiscID = (randomNumberToExecute.nextInt(3) + 1);

		discController = new DiscController();

			discInfo = discController.GetDiscForPropaganda(randomDiscID);
			if (null != discInfo) {
				discForPropaganda = discInfo.get(0);

				discNameLbl.setText(discForPropaganda.getCollectionName());
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

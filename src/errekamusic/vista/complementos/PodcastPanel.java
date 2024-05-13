package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.enumerado.ArtistType;
//import errekamusic.logica.ArtistController;
import errekamusic.logica.CollectionController;
import errekamusic.logica.Sesion;

public class PodcastPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblProfilePicture = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblSubtitle = null;
	private JLabel lblPodcastTitle = null;
	private JLabel seeYourProfileLbl = null;

	private JButton reproContentBtn = null;
	private JButton podcastPanelBackBtn = null;
	private int creatorID = 0;
	private JTable tablePodcast;


	/**
	 * Create the panel.
	 */
	public PodcastPanel() {

		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		lblPodcastTitle = new JLabel("Descubre podcasts");
		lblPodcastTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcastTitle.setForeground(new Color(200, 40, 255));
		lblPodcastTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblPodcastTitle.setBounds(284, 32, 393, 64);
		add(lblPodcastTitle);

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
			}
		});

		seeYourProfileLbl = new JLabel("Ver perfil");
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		add(seeYourProfileLbl);

		podcastPanelBackBtn = new JButton("Volver");
		podcastPanelBackBtn.setBounds(844, 556, 98, 33);
		podcastPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(podcastPanelBackBtn);
		podcastPanelBackBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
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
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(true);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

			}

		});

		lblSubtitle = new JLabel("Seleccione la opción que desee:");
		lblSubtitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtitle.setBounds(68, 64, 285, 25);
		add(lblSubtitle);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		reproContentBtn = new JButton("Reproducir contenido");
		reproContentBtn.setBounds(440, 561, 186, 28);
		add(reproContentBtn);
		
		tablePodcast = new JTable();
		tablePodcast.setColumnSelectionAllowed(true);
		tablePodcast.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
		tablePodcast.setBounds(162, 143, 649, 331);
		
		CollectionController collectionController = new CollectionController();
		//List<Podcast> podcasts = collectionController.GetCollectionByArtist(this.creatorID);
		
	    String[] headers= {"Grupo","Descripción"};
	    
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(headers);
		
		//Object[] row = {"Grupo","Descripción"};
		//model.addRow(row);
		
//		for (Podcast podcast : podcasts) {
//			String name = podcast.getCollectionName();
//			String type = podcast.getCollectionType();
//			String genre = podcast.getCollectionGenre();
//			String desc = podcast.getCollectionDesc();
//			Object[] row = {name, type, genre, desc};
//			model.addRow(row);
//		}
		tablePodcast.setModel(model);
		add(tablePodcast);
		
		reproContentBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
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

			}

		});

	}
	
	public void setCreatorId(int artistId) {
		this.creatorID = artistId;
	}

	public JPanel getPodcastPanel() {
		// TODO Auto-generated method stub
		return this;
	}

}

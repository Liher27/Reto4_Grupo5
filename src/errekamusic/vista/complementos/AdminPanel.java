package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.Serie;
import errekamusic.logica.ArtistController;
import errekamusic.logica.CollectionController;
import errekamusic.logica.ContentController;
import errekamusic.logica.Sesion;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class AdminPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblAdminTitle = null;
	private JLabel seeYourProfileLbl = null;

	private JButton adminPanelBackBtn = null;
	private JLabel lblProfilePicture = null;
	private JList<String> list = null;
	private JLabel lblTopSongs = null;
	private List<Song> top10Songs = new ArrayList<>();
	private List<Artist> top10Artist = new ArrayList<>();
	private List<Disc> top10Discs = new ArrayList<>();
	private List<Serie> top10Series = new ArrayList<>();
	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JLabel lblTopArtist = null;
	private JLabel lblTopDiscserie = null;
	private JLabel modifyGroup = null;
	private JLabel lblTopSerie = null;

	/**
	 * Create the panel.
	 */
	public AdminPanel() {

		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

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

		adminPanelBackBtn = new JButton("Volver");
		adminPanelBackBtn.setBounds(844, 556, 98, 33);
		adminPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(adminPanelBackBtn);
		adminPanelBackBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
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

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblAdminTitle = new JLabel("Panel de administrador");
		lblAdminTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminTitle.setForeground(new Color(200, 40, 255));
		lblAdminTitle.setFont(new Font("Segoe UI Black", Font.PLAIN, 37));
		lblAdminTitle.setBounds(255, 32, 448, 64);
		add(lblAdminTitle);

		JLabel createGruop = new JLabel("Nuevos Grupos");
		createGruop.addMouseListener(new MouseAdapter() {
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
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(true);
				Sesion.getInstance().getGroupInfoPanel().getAddButton().setVisible(true);
			}
		});
		createGruop.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
		createGruop.setForeground(new Color(255, 0, 255));
		createGruop.setBounds(52, 147, 240, 33);
		add(createGruop);

		list = new JList<String>();
		list.setBounds(626, 147, 267, 312);
		add(list);
		list.setVisible(true);

		lblTopSongs = new JLabel("Top 10 Songs");
		lblTopSongs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listModel.removeAllElements();
				ContentController contentController = new ContentController();
				top10Songs = contentController.getTop10Songs();
				for (int i = 0; i < top10Songs.size(); i++) {
					listModel.addElement(i + 1 + "." + top10Songs.get(i).getContentName());
				}
				list.setModel(listModel);

			}
		});
		lblTopSongs.setForeground(Color.MAGENTA);
		lblTopSongs.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
		lblTopSongs.setBounds(52, 235, 240, 33);
		add(lblTopSongs);

		lblTopArtist = new JLabel("Top 10 Artist");
		lblTopArtist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listModel.removeAllElements();
				ArtistController artistController = new ArtistController();
				try {
					top10Artist = artistController.top10Artist();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
				}
				for (int i = 0; i < top10Artist.size(); i++) {
					listModel.addElement(i + 1 + "." + top10Artist.get(i).getArtistName());
				}
				list.setModel(listModel);

			}
		});
		lblTopArtist.setForeground(Color.MAGENTA);
		lblTopArtist.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
		lblTopArtist.setBounds(52, 279, 240, 33);
		add(lblTopArtist);

		lblTopDiscserie = new JLabel("Top 10 Disc");
		lblTopDiscserie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listModel.removeAllElements();
				CollectionController collectionController = new CollectionController();
				try {
					top10Discs = collectionController.top10Disc();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
				}
				for (int i = 0; i < top10Discs.size(); i++) {
					listModel.addElement(i + 1 + "." + top10Discs.get(i).getCollectionName());
				}
				list.setModel(listModel);
			}
		});
		lblTopDiscserie.setForeground(Color.MAGENTA);
		lblTopDiscserie.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
		lblTopDiscserie.setBounds(52, 323, 240, 33);
		add(lblTopDiscserie);

		modifyGroup = new JLabel("Modificar Grupo");
		modifyGroup.addMouseListener(new MouseAdapter() {
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
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(true);
				Sesion.getInstance().getGroupInfoPanel().getAddButton().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getSearchButton().setVisible(true);
			}
		});
		modifyGroup.setForeground(Color.MAGENTA);
		modifyGroup.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
		modifyGroup.setBounds(52, 191, 240, 33);
		add(modifyGroup);

		lblTopSerie = new JLabel("Top 10 Serie");
		lblTopSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				listModel.removeAllElements();
				CollectionController collectionController = new CollectionController();
				try {
					top10Series = collectionController.top10Serie();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
				}
				for (int i = 0; i < top10Series.size(); i++) {
					listModel.addElement(i + 1 + "." + top10Series.get(i).getCollectionName());
				}
				list.setModel(listModel);
			}
		});
		lblTopSerie.setForeground(Color.MAGENTA);
		lblTopSerie.setFont(new Font("Segoe UI Black", Font.PLAIN, 27));
		lblTopSerie.setBounds(52, 367, 240, 33);
		add(lblTopSerie);
	}

	public JPanel getAdminPanel() {
		return this;
	}
}
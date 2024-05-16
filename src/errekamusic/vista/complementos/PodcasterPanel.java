package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Podcaster;
import errekamusic.enumerado.ArtistType;
import errekamusic.logica.ArtistController;
//import errekamusic.logica.ArtistController;
import errekamusic.logica.Sesion;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class PodcasterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton collectionInfoBtn = null;
	private JLabel lblProfilePicture = null;
	private JButton podcasterPanelBackBtn = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JTable tablePodcaster;

	/**
	 * Create the panel.
	 */
	public PodcasterPanel() {

		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setBounds(923, 11, 51, 51);
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
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
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		add(seeYourProfileLbl);
		podcasterPanelBackBtn = new JButton("Volver");
		podcasterPanelBackBtn.setBounds(844, 556, 98, 33);
		podcasterPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(podcasterPanelBackBtn);
		podcasterPanelBackBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(true);
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

		lblFavoriteTitle = new JLabel("Descubre Podcasters");
		lblFavoriteTitle.setBounds(279, 32, 398, 64);
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(200, 40, 255));
		lblFavoriteTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		add(lblFavoriteTitle);
		

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		collectionInfoBtn = new JButton("Mas informacion");
		collectionInfoBtn.setBounds(440, 561, 186, 28);
		add(collectionInfoBtn);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(103, 147, 756, 366);
		add(scrollBar);
		
		tablePodcaster = new JTable();
		tablePodcaster.setColumnSelectionAllowed(true);
		tablePodcaster.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
		tablePodcaster.setBounds(162, 143, 649, 331);
		
		ArtistController artistController = new ArtistController();
		List<Podcaster> podcasters = null;
		try {
			podcasters = artistController.getPodcasterByArtistType(ArtistType.Podcaster);
		} catch (ClassNotFoundException e1) {
			JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
		}
		
	    String[] headers= {"Grupo","Descripción"};
	    
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(headers);
		
		Object[] row = {"Grupo","Descripción"};
		//model.addRow(row);
				
		for (Podcaster podcaster : podcasters) {
			String grupo = podcaster.getArtistName();
			String descripcionGrupo = podcaster.getArtistDesc();
			Object[] rowPodcaster = {grupo, descripcionGrupo};
			model.addRow(rowPodcaster);
		}
		tablePodcaster.setModel(model);
		add(tablePodcaster);
		
		List<Podcaster> podcastersSelected = podcasters;
		
		tablePodcaster.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tablePodcaster.getSelectedRow();
				Artist artist = podcastersSelected.get(selectedRow);
				PodcastPanel podcastPanel = new PodcastPanel();
				podcastPanel.setCreatorId(artist.getArtistID());
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
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(true);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

			}
		});
		
		collectionInfoBtn.addActionListener(new ActionListener() {
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

	}

	public JPanel getPodcasterPanel() {
		// TODO Auto-generated method stub
		return this;
	}
}

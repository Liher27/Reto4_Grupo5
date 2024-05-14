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
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.logica.Sesion;
import errekamusic.enumerado.ArtistType;

import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;


public class GroupPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblGroupTitle = null;

	private JLabel lblProfilePicture = null;
	private JButton groupPanelBackBtn = null;
	private JButton collectionInfoBtn = null;
	private JLabel seeYourProfileLbl = null;
	private JTable tableGroups;


	/**
	 * Create the panel.
	 */
	public GroupPanel() {
				
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

		groupPanelBackBtn = new JButton("Volver");
		groupPanelBackBtn.setBounds(844, 556, 98, 33);
		groupPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(groupPanelBackBtn);
		groupPanelBackBtn.addActionListener(new ActionListener() {
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

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblGroupTitle = new JLabel("Descubre grupos");
		lblGroupTitle.setBounds(328, 32, 349, 64);
		lblGroupTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupTitle.setForeground(new Color(200, 40, 255));
		lblGroupTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		add(lblGroupTitle);

		collectionInfoBtn = new JButton("Mas informacion");
		collectionInfoBtn.setBounds(440, 561, 186, 28);
		add(collectionInfoBtn);
		
		
		tableGroups = new JTable();
		tableGroups.setColumnSelectionAllowed(true);
		tableGroups.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
		tableGroups.setBounds(162, 143, 649, 331);
		
//		ArtistController artistController = new ArtistController();
//		List<Artist> artists = artistController.getByArtistType(ArtistType.Group);
//		
//	    String[] headers= {"Grupo","Descripción"};
//	    
//		DefaultTableModel model = new DefaultTableModel();
//		model.setColumnIdentifiers(headers);
//		
//		Object[] row = {"Grupo","Descripción"};
//		//model.addRow(row);
//		
//		for (Artist artist : artists) {
//			String grupo = artist.getArtistName();
//			String descripcionGrupo = artist.getArtistDesc();
//			Object[] rowArtistas = {grupo, descripcionGrupo};
//			model.addRow(rowArtistas);
//		}
//		tableGroups.setModel(model);
//		add(tableGroups);
//
//		tableGroups.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int selectedRow = tableGroups.getSelectedRow();
//				Artist artist = artists.get(selectedRow);
//				DiscsPanel discsPanel = new DiscsPanel();
//				discsPanel.setArtistId(artist.getArtistID());
//				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
//				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
//				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
//				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
//				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
//				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
//				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
//				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
//				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
//				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
//				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(true);
//				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
//				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
//				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
//
//			}
//		});
//	
//
//		collectionInfoBtn.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
//				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
//				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
//				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
//				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
//				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
//				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
//				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
//				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(true);
//				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
//				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
//				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
//				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
//				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
//
//			}
//
//		});
	}

	public JPanel getGroupPanel() {
		
		
		return this;
	}
}

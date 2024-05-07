package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.logica.ArtistController;
import errekamusic.logica.CollectionController;
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
	private JTable tableCollections;


	/**
	 * Create the panel.
	 */
	public GroupPanel(ArrayList<JPanel> paneles) {
				
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
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		add(seeYourProfileLbl);

		groupPanelBackBtn = new JButton("Volver");
		groupPanelBackBtn.setBounds(844, 556, 98, 33);
		groupPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(groupPanelBackBtn);
		groupPanelBackBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
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
		
//		ArtistsInterface artistsInterfaceController = new GroupManager();
//		List<Artist> artists = artistsInterfaceController.getByArtistType(ArtistType.Group);
//		
//	    String[] headers= {"Grupo","Descripción"};
//	    
//		DefaultTableModel model = new DefaultTableModel();
//		model.setColumnIdentifiers(headers);
//		
//		for (Artist artist : artists) {
//			String grupo = artist.getArtistName();
//			String descripcionGrupo = artist.getArtistDesc();
//			Object[] row = {grupo, descripcionGrupo};
//			model.addRow(row);
//		}
//		tableGroups.setModel(model);
//		add(tableGroups);
//		
//		tableCollections = new JTable();
//		tableCollections.setColumnSelectionAllowed(true);
//		tableCollections.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
//		tableCollections.setBounds(162, 143, 649, 331);
//		tableGroups.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int selectedRow = tableGroups.getSelectedRow();
//				Artist artist = artists.get(selectedRow);
//				tableGroups.setVisible(false);
//				CollectionInterface collectionInterface = new DiscManager();
//				List<Disc> discs = collectionInterface.GetCollectionByArtist(artist.getArtistID());
//				
//				String[] headersDisc= {"Grupo","Descripción"};
//			    
//				DefaultTableModel modelDisc = new DefaultTableModel();
//				modelDisc.setColumnIdentifiers(headersDisc);
//				
//				for (Disc disc : discs) {
//					String name = disc.getCollectionName();
//					String type = disc.getCollectionType();
//					String genre = disc.getCollectionGenre();
//					String desc = disc.getCollectionDesc();
//					Object[] row = {name, type, genre, desc};
//					modelDisc.addRow(row);
//				}
//				tableCollections.setModel(modelDisc);
//				add(tableCollections);
//
//			}
//		});
//		
		collectionInfoBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
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
				paneles.get(10).setVisible(true);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}

		});
	}

	public JPanel getPanelGrupos() {
		// TODO Auto-generated method stub
		return this;
	}
}

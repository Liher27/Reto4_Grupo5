package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import errekamusic.logica.Sesion;

public class DiscsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblDiscsTitle = null;
	private JLabel lblProfilePicture = null;

	private JButton discsPanelBackBtn = null;
	private JButton songInfoBtn = null;
	private JLabel seeYourProfileLbl = null;
	private JTable tableCollections;


	/**
	 * Create the panel.
	 */
	public DiscsPanel() {

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

		discsPanelBackBtn = new JButton("Volver");
		discsPanelBackBtn.setBounds(844, 556, 98, 33);
		discsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(discsPanelBackBtn);
		discsPanelBackBtn.addActionListener(new ActionListener() {
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
		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblDiscsTitle = new JLabel("Descubre discos");
		lblDiscsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscsTitle.setForeground(new Color(200, 40, 255));
		lblDiscsTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblDiscsTitle.setBounds(328, 32, 349, 64);
		add(lblDiscsTitle);

//		songInfoBtn = new JButton("Mas informacion");
//		songInfoBtn.setBounds(440, 561, 186, 28);
//		add(songInfoBtn);
//		songInfoBtn.addActionListener(new ActionListener() {
//			/**
//			 * Confirmamos para logearnos
//			 * 
//			 * @param e
//			 */
//			public void actionPerformed(ActionEvent e) {
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
//				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
//				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
//				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
//				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(true);
//				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
//			}
//
//		});
		
		tableCollections = new JTable();
		tableCollections.setColumnSelectionAllowed(true);
		tableCollections.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
		tableCollections.setBounds(162, 143, 649, 331);
				
		add(tableCollections);
				
		String[] headersDisc= {"Grupo","Descripción"};
	    
		DefaultTableModel modelDisc = new DefaultTableModel();
		modelDisc.setColumnIdentifiers(headersDisc);
		
//		for (Disc disc : discs) {
//			String name = disc.getCollectionName();
//			String type = disc.getCollectionType();
//			String genre = disc.getCollectionGenre();
//			String desc = disc.getCollectionDesc();
//			Object[] row = {name, type, genre, desc};
//			modelDisc.addRow(row);
//		}
		
		tableCollections.setModel(modelDisc);
		add(tableCollections);
		
		tableCollections.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				int selectedRow = tableCollections.getSelectedRow();
//				Disc disc = discs.get(selectedRow);
//				SongsPanel songsPanel = new SongsPanel();
//				songsPanel.setCollectionId(disc.getCollectionID());
			}
		});
		
	}

	public JPanel getDiscsPanel() {
		// TODO Auto-generated method stub
		return this;
	}
}

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

import errekamusic.bbdd.Pojo.Contenido;
//import errekamusic.logica.ContentController;
import errekamusic.logica.Sesion;

public class SongsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblSongsTitle = null;

	private JButton songsPanelBackBtn = null;
	private JButton btnReproContent = null;
	private JLabel lblProfilePicture = null;
	private JLabel seeYourProfileLbl = null;
	private JTable tableSongs;
	private int collectionId = 0;

	/**
	 * Create the panel.
	 */
	public SongsPanel() {

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
			}
		});

		seeYourProfileLbl = new JLabel("Ver perfil");
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		add(seeYourProfileLbl);

		songsPanelBackBtn = new JButton("Volver");
		songsPanelBackBtn.setBounds(844, 556, 98, 33);
		songsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(songsPanelBackBtn);
		songsPanelBackBtn.addActionListener(new ActionListener() {
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
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(true);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

			}

		});

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblSongsTitle = new JLabel("Descubre canciones");
		lblSongsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSongsTitle.setForeground(new Color(200, 40, 255));
		lblSongsTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblSongsTitle.setBounds(274, 32, 403, 64);
		add(lblSongsTitle);

		btnReproContent = new JButton("Reproducir contenido");
		btnReproContent.setBounds(440, 561, 186, 28);
		add(btnReproContent);
		btnReproContent.addActionListener(new ActionListener() {
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
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(true);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

			}

		});
		
		tableSongs = new JTable();
		tableSongs.setColumnSelectionAllowed(true);
		tableSongs.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(186, 85, 211)));
		tableSongs.setBounds(162, 143, 649, 331);
		
//		ContentController contentControllert = new ContentController();
//		List<Contenido> contenidos = null;
//		try {
//			contenidos = contentControllert.GetContenidoByDisc(this.collectionId);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		String[] headersDisc= {"Grupo","Descripción"};
//	    
//		DefaultTableModel modelDisc = new DefaultTableModel();
//		modelDisc.setColumnIdentifiers(headersDisc);
//		/*
//		for (Contenido contenido : contenidos) {
//			String name = contenido.getCollectionName();
//			String type = disc.getCollectionType();
//			String genre = disc.getCollectionGenre();
//			String desc = disc.getCollectionDesc();
//			Object[] row = {name, type, genre, desc};
//			modelDisc.addRow(row);
//		}*/
//		tableSongs.setModel(modelDisc);
//		add(tableSongs);
	}
	
	public void setCollectionId(int collectionId){
		this.collectionId = collectionId;
	}

	public JPanel getSongsPanel() {
		// TODO Auto-generated method stub
		return this;
	}

}

package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.logica.CollectionController;
import errekamusic.logica.Sesion;

public class DiscsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton collectionInfoBtn = null;
	private JLabel lblProfilePicture = null;
	private JButton discsPanelBackBtn = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JComboBox<String> comboBox = null;
	private JLabel lbldiscsRegDateText = null;
	private JLabel lbldiscsDescText = null;
	private JLabel artistImageLbl = null;
	private ImageIcon artistImageIcon = null;

	private DefaultComboBoxModel<String> boxmodel = null;
	private int discsID = 0;
	private JLabel lbldiscsName = null;
	
	private JLabel layOutFordiscsLbl = null;

	private int[] listUniqueID = null;

	/**
	 * Create the panel.
	 */
	public DiscsPanel() {

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
		discsPanelBackBtn = new JButton("Volver");
		discsPanelBackBtn.setBounds(844, 556, 98, 33);
		discsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(discsPanelBackBtn);
		discsPanelBackBtn.addActionListener(new ActionListener() {
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

		lblFavoriteTitle = new JLabel("Descubre discsos");
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
		collectionInfoBtn.setBounds(385, 560, 186, 28);
		collectionInfoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Sesion.getInstance().setContentID(discsID);
				System.out.println(discsID);
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
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(true);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
			}
		});

		add(collectionInfoBtn);

		collectionInfoBtn.addActionListener(new ActionListener() {
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

		JLabel lblSeleccionaTuPlaylist = new JLabel("Selecciona el discs:");
		lblSeleccionaTuPlaylist.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionaTuPlaylist.setForeground(new Color(200, 40, 255));
		lblSeleccionaTuPlaylist.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblSeleccionaTuPlaylist.setBounds(362, 111, 219, 25);
		add(lblSeleccionaTuPlaylist);

		comboBox = new JComboBox<String>();
		comboBox.setVisible(true);
		comboBox.setBounds(360, 147, 231, 22);
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					getDiscs(Sesion.getInstance().getArtistID());
					comboBox.setModel(boxmodel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					discsID = listUniqueID[comboBox.getSelectedIndex()];
					Sesion.getInstance().setCollectionID(discsID);
					getDiscsInfo(Sesion.getInstance().getArtistID());
				} catch (ClassNotFoundException c) {
					c.printStackTrace();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		add(comboBox);

		lbldiscsName = new JLabel("");
		lbldiscsName.setHorizontalAlignment(SwingConstants.CENTER);
		lbldiscsName.setForeground(new Color(200, 40, 255));
		lbldiscsName.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lbldiscsName.setBounds(21, 245, 248, 64);
		add(lbldiscsName);

		lbldiscsDescText = new JLabel("");
		lbldiscsDescText.setHorizontalAlignment(SwingConstants.CENTER);
		lbldiscsDescText.setForeground(new Color(255, 255, 255));
		lbldiscsDescText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lbldiscsDescText.setBounds(715, 212, 219, 219);
		add(lbldiscsDescText);

		lbldiscsRegDateText = new JLabel("");
		lbldiscsRegDateText.setHorizontalAlignment(SwingConstants.CENTER);
		lbldiscsRegDateText.setForeground(new Color(255, 255, 255));
		lbldiscsRegDateText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lbldiscsRegDateText.setBounds(29, 388, 219, 25);
		add(lbldiscsRegDateText);
		
		artistImageLbl = new JLabel("");
		artistImageLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		artistImageLbl.setBounds(336, 226, 292, 280);
		add(artistImageLbl);
		
		layOutFordiscsLbl = new JLabel("");
		layOutFordiscsLbl.setIcon(new ImageIcon("contents/layOutForPropaganda.png"));
		layOutFordiscsLbl.setForeground(new Color(255, 255, 255));
		layOutFordiscsLbl.setFont(new Font("Myanmar Text", Font.BOLD, 99));
		layOutFordiscsLbl.setBounds(310, 198, 342, 338);
		add(layOutFordiscsLbl);
		
		JLabel lbldiscsRegDate = new JLabel("Fecha de registro:");
		lbldiscsRegDate.setHorizontalAlignment(SwingConstants.CENTER);
		lbldiscsRegDate.setForeground(new Color(200, 40, 255));
		lbldiscsRegDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lbldiscsRegDate.setBounds(29, 336, 219, 25);
		add(lbldiscsRegDate);

	}

	private void getDiscs(int artistID) throws ClassNotFoundException, SQLException {
		List<Disc> discs = new CollectionController().getDiscByArtist(artistID);
		listUniqueID = new int[discs.size()];
		boxmodel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < discs.size(); i++) {
			listUniqueID[i] = discs.get(i).getCollectionID();
			String discsName = discs.get(i).getCollectionName();
			boxmodel.addElement(discsName);
		}
	}

	private void getDiscsInfo(int discsID) throws Exception {
		Disc disc = new CollectionController().getDiscInfo(discsID);
		lbldiscsRegDateText.setText(Converter.convertToSimpleDate(disc.getCollectionDate()));
		lbldiscsDescText.setText(disc.getCollectionDesc());
		lbldiscsName.setText(disc.getCollectionName());
		artistImageIcon = disc.getCollectionImage();
		artistImageLbl.setIcon(artistImageIcon);
		

	}

	public JPanel getDiscsPanel() {
		// TODO Auto-generated method stub
		return this;
	}
}
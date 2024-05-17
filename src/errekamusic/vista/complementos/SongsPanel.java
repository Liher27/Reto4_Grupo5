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

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.logica.ContentController;
import errekamusic.logica.Sesion;

public class SongsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton btnReproContent = null;
	private JLabel lblProfilePicture = null;
	private JButton songsPanelBackBtn = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblDiscoverSongsTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JComboBox<String> comboBox = null;
	private JLabel lblContentDurationText = null;
	private JLabel lbldiscsDescText = null;
	private JLabel artistImageLbl = null;
	private ImageIcon artistImageIcon = null;

	private DefaultComboBoxModel<String> boxmodel = null;
	private int SongID = 0;
	private JLabel lbldiscsName = null;
	
	private JLabel layOutFordiscsLbl = null;

	private int[] listUniqueID = null;

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
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
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
		
		songsPanelBackBtn = new JButton("Volver");
		songsPanelBackBtn.setBounds(844, 556, 98, 33);
		songsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(songsPanelBackBtn);
		songsPanelBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(true);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);
			}

		});
		lblDiscoverSongsTitle = new JLabel("Descubre Songs");
		lblDiscoverSongsTitle.setBounds(279, 32, 398, 64);
		lblDiscoverSongsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscoverSongsTitle.setForeground(new Color(200, 40, 255));
		lblDiscoverSongsTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		add(lblDiscoverSongsTitle);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		btnReproContent = new JButton("Reproducir contenido");
		btnReproContent.setBounds(440, 561, 186, 28);
		add(btnReproContent);
		btnReproContent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sesion.getInstance().setContentID(SongID);
				System.out.println(SongID);
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
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

		JLabel lblSeleccionaTuPlaylist = new JLabel("Selecciona el Song:");
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
					getSongs(Sesion.getInstance().getCollectionID());
					System.out.println(Sesion.getInstance().getCollectionID());
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
					SongID = listUniqueID[comboBox.getSelectedIndex()];
					System.out.println(SongID);
					getSongInfo(SongID);
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

		lblContentDurationText = new JLabel("");
		lblContentDurationText.setHorizontalAlignment(SwingConstants.CENTER);
		lblContentDurationText.setForeground(new Color(255, 255, 255));
		lblContentDurationText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblContentDurationText.setBounds(29, 388, 219, 25);
		add(lblContentDurationText);
		
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
		
		JLabel lbldiscsRegDate = new JLabel("Duracion:");
		lbldiscsRegDate.setHorizontalAlignment(SwingConstants.CENTER);
		lbldiscsRegDate.setForeground(new Color(200, 40, 255));
		lbldiscsRegDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lbldiscsRegDate.setBounds(29, 336, 219, 25);
		add(lbldiscsRegDate);

	}

	private void getSongs(int collectionID) throws ClassNotFoundException, SQLException {
		List<Canciones> Songs = new ContentController().getSongByDiscId(collectionID);
		listUniqueID = new int[Songs.size()];
		boxmodel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < Songs.size(); i++) {
			listUniqueID[i] = Songs.get(i).getContentID();
			String songsNames = Songs.get(i).getContentName();
			boxmodel.addElement(songsNames);
		}
	}

	private void getSongInfo(int SongID) throws Exception {
		Canciones Song = new ContentController().getSongInfo(SongID);
		lblContentDurationText.setText(String.valueOf(Song.getContentDuration()));
		lbldiscsName.setText(Song.getContentName());
		artistImageIcon = Song.getDisc().getCollectionImage();
		artistImageLbl.setIcon(artistImageIcon);
	}

	public JPanel getSongsPanel() {
		return this;
	}
}

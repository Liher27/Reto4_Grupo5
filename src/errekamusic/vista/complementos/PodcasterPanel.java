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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.logica.ArtistController;
import errekamusic.logica.Sesion;

public class PodcasterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton collectionInfoBtn = null;
	private JLabel lblProfilePicture = null;
	private JButton podcasterPanelBackBtn = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JComboBox<String> comboBox = null;
	private JLabel lblPodcasterRegDateText = null;
	private JLabel lblPodcasterDescText = null;
	private JLabel artistImageLbl = null;
	private ImageIcon artistImageIcon = null;

	private DefaultComboBoxModel<String> boxmodel = null;
	private int podcasterID = 0;
	private JLabel lblPodcasterName = null;
	
	private JLabel layOutForPodcasterLbl = null;

	private int[] listUniqueID = null;

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
		collectionInfoBtn.setBounds(385, 560, 186, 28);
		collectionInfoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Sesion.getInstance().setArtistID(podcasterID);
				
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
				Sesion.getInstance().getGroupInfoPanel().getGroupInfoPanel().setVisible(false);

			}
		});
		
		add(collectionInfoBtn);

		JLabel lblSeleccionaTuPlaylist = new JLabel("Selecciona el podcaster:");
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
					getPodcasters();
					comboBox.setModel(boxmodel);
				}   catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					podcasterID = listUniqueID[comboBox.getSelectedIndex()];
					getPodcasterInfo(podcasterID);
				}  catch (ClassNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "Error al encontrar un archivo", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Error en la base de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		add(comboBox);

		lblPodcasterName = new JLabel("");
		lblPodcasterName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcasterName.setForeground(new Color(200, 40, 255));
		lblPodcasterName.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblPodcasterName.setBounds(21, 245, 248, 64);
		add(lblPodcasterName);

		lblPodcasterDescText = new JLabel("");
		lblPodcasterDescText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcasterDescText.setForeground(new Color(255, 255, 255));
		lblPodcasterDescText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblPodcasterDescText.setBounds(715, 212, 219, 219);
		add(lblPodcasterDescText);

		lblPodcasterRegDateText = new JLabel("");
		lblPodcasterRegDateText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcasterRegDateText.setForeground(new Color(255, 255, 255));
		lblPodcasterRegDateText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblPodcasterRegDateText.setBounds(29, 388, 219, 25);
		add(lblPodcasterRegDateText);
		
		artistImageLbl = new JLabel("");
		artistImageLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		artistImageLbl.setBounds(336, 226, 292, 280);
		add(artistImageLbl);
		
		layOutForPodcasterLbl = new JLabel("");
		layOutForPodcasterLbl.setIcon(new ImageIcon("contents/layOutForPropaganda.png"));
		layOutForPodcasterLbl.setForeground(new Color(255, 255, 255));
		layOutForPodcasterLbl.setFont(new Font("Myanmar Text", Font.BOLD, 99));
		layOutForPodcasterLbl.setBounds(310, 198, 342, 338);
		add(layOutForPodcasterLbl);
		
		JLabel lblPodcasterRegDate = new JLabel("Fecha de registro:");
		lblPodcasterRegDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcasterRegDate.setForeground(new Color(200, 40, 255));
		lblPodcasterRegDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblPodcasterRegDate.setBounds(29, 336, 219, 25);
		add(lblPodcasterRegDate);

	}

	private void getPodcasters() throws ClassNotFoundException, SQLException {
		List<Artist> podcasters = new ArtistController().getPodcasterByArtistType("Podcaster");
		listUniqueID = new int[podcasters.size()];
		boxmodel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < podcasters.size(); i++) {
			listUniqueID[i] = podcasters.get(i).getArtistID();
			String podcasterName = podcasters.get(i).getArtistName();
			boxmodel.addElement(podcasterName);
		}
	}

	private void getPodcasterInfo(int podcasterID) throws Exception {
		Artist podcaster = new ArtistController().getArtistByID(podcasterID);
		lblPodcasterRegDateText.setText(Converter.convertToSimpleDate(podcaster.getArtistRegDate()));
		lblPodcasterDescText.setText(podcaster.getArtistDesc());
		lblPodcasterName.setText(podcaster.getArtistName());
		artistImageIcon = podcaster.getArtistImage();
		artistImageLbl.setIcon(artistImageIcon);
		

	}

	public JPanel getPodcasterPanel() {
		// TODO Auto-generated method stub
		return this;
	}
}

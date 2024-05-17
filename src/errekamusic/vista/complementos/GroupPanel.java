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

public class GroupPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton collectionInfoBtn = null;
	private JLabel lblProfilePicture = null;
	private JButton groupPanelBackBtn = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JComboBox<String> comboBox = null;
	private JLabel lblgroupRegDateText = null;
	private JLabel lblgroupDescText = null;
	private JLabel artistImageLbl = null;
	private ImageIcon artistImageIcon = null;

	private DefaultComboBoxModel<String> boxmodel = null;
	private int groupID = 0;
	private JLabel lblgroupName = null;

	private JLabel layOutForgroupLbl = null;

	private int[] listUniqueID = null;

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

		lblFavoriteTitle = new JLabel("Descubre grupos");
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


				Sesion.getInstance().setArtistID(groupID);

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

		JLabel lblSelectYourArtist = new JLabel("Selecciona el grupo:");
		lblSelectYourArtist.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectYourArtist.setForeground(new Color(200, 40, 255));
		lblSelectYourArtist.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblSelectYourArtist.setBounds(362, 111, 219, 25);
		add(lblSelectYourArtist);

		comboBox = new JComboBox<String>();
		comboBox.setVisible(true);
		comboBox.setBounds(360, 147, 231, 22);
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					getgroups();
					comboBox.setModel(boxmodel);
				}  catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					groupID = listUniqueID[comboBox.getSelectedIndex()];
					System.out.println(groupID);
					getgroupInfo(groupID);
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

		lblgroupName = new JLabel("");
		lblgroupName.setHorizontalAlignment(SwingConstants.CENTER);
		lblgroupName.setForeground(new Color(200, 40, 255));
		lblgroupName.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblgroupName.setBounds(21, 245, 248, 64);
		add(lblgroupName);

		lblgroupDescText = new JLabel("");
		lblgroupDescText.setHorizontalAlignment(SwingConstants.CENTER);
		lblgroupDescText.setForeground(new Color(255, 255, 255));
		lblgroupDescText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblgroupDescText.setBounds(715, 212, 219, 219);
		add(lblgroupDescText);

		lblgroupRegDateText = new JLabel("");
		lblgroupRegDateText.setHorizontalAlignment(SwingConstants.CENTER);
		lblgroupRegDateText.setForeground(new Color(255, 255, 255));
		lblgroupRegDateText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblgroupRegDateText.setBounds(29, 388, 219, 25);
		add(lblgroupRegDateText);

		artistImageLbl = new JLabel("");
		artistImageLbl.setFont(new Font("Cambria", Font.BOLD, 20));
		artistImageLbl.setBounds(336, 226, 292, 280);
		add(artistImageLbl);

		layOutForgroupLbl = new JLabel("");
		layOutForgroupLbl.setIcon(new ImageIcon("contents/layOutForPropaganda.png"));
		layOutForgroupLbl.setForeground(new Color(255, 255, 255));
		layOutForgroupLbl.setFont(new Font("Myanmar Text", Font.BOLD, 99));
		layOutForgroupLbl.setBounds(310, 198, 342, 338);
		add(layOutForgroupLbl);

		JLabel lblgroupRegDate = new JLabel("Fecha de registro:");
		lblgroupRegDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblgroupRegDate.setForeground(new Color(200, 40, 255));
		lblgroupRegDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblgroupRegDate.setBounds(29, 336, 219, 25);
		add(lblgroupRegDate);

	}

	private void getgroups() throws ClassNotFoundException, SQLException {
		List<Artist> groups = new ArtistController().getByArtistType("Group");
		listUniqueID = new int[groups.size()];
		boxmodel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < groups.size(); i++) {
			listUniqueID[i] = groups.get(i).getArtistID();
			String groupName = groups.get(i).getArtistName();
			boxmodel.addElement(groupName);
		}
	}

	private void getgroupInfo(int groupID) throws Exception {
		Artist group = new ArtistController().getArtistByID(groupID);
		lblgroupRegDateText.setText(Converter.convertToSimpleDate(group.getArtistRegDate()));
		lblgroupDescText.setText(group.getArtistDesc());
		lblgroupName.setText(group.getArtistName());
		artistImageIcon = group.getArtistImage();
		artistImageLbl.setIcon(artistImageIcon);

	}

	public JPanel getGroupPanel() {
		// TODO Auto-generated method stub
		return this;
	}
}
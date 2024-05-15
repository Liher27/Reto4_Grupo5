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
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.logica.ListsController;
import errekamusic.logica.Sesion;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class ListsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblProfilePicture = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel createListLblBtn = null;
	private JLabel listsPanelBackLblBtn = null;
	private JLabel deleteListLblBtn = null;
	private JLabel exportListsLblBtn = null;
	private JLabel importListsLblBtn = null;
	private JLabel overlayLbl = null;
	private JLabel seeYourProfileLbl = null;

	private DefaultComboBoxModel<String> boxmodel = null;
	JComboBox<String> comboBox = null;
	private JButton listsPanelBackBtn = null;
	int[] listUniqueID = null;

	private JTextArea textArea = null;

	private String playListName = null;

	List<PlayList> playListInfo = null;

	/**
	 * Create the panel. - Crear una lista - Borrar una lista - Ver las canciones de
	 * una lista - Exportar todas las listas a un fichero - Importar todas las
	 * listas de un fichero
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public ListsPanel() throws ClassNotFoundException, SQLException {

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
		listsPanelBackLblBtn = new JLabel("Salir ");
		listsPanelBackLblBtn.setForeground(new Color(200, 40, 255));
		listsPanelBackLblBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		listsPanelBackLblBtn.setBounds(49, 460, 219, 25);
		add(listsPanelBackLblBtn);
		listsPanelBackLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
			}
		});

		createListLblBtn = new JLabel("Crear lista");
		createListLblBtn.setForeground(new Color(255, 255, 255));
		createListLblBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		createListLblBtn.setBounds(49, 166, 214, 25);
		add(createListLblBtn);

		deleteListLblBtn = new JLabel("Eliminar lista");
		deleteListLblBtn.setForeground(new Color(255, 255, 255));
		deleteListLblBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		deleteListLblBtn.setBounds(49, 243, 214, 25);
		add(deleteListLblBtn);
		deleteListLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		importListsLblBtn = new JLabel("Importar lista");
		importListsLblBtn.setForeground(new Color(255, 255, 255));
		importListsLblBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		importListsLblBtn.setBounds(49, 317, 219, 25);
		add(importListsLblBtn);
		importListsLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		exportListsLblBtn = new JLabel("Exportar lista");
		exportListsLblBtn.setForeground(new Color(255, 255, 255));
		exportListsLblBtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		exportListsLblBtn.setBounds(49, 393, 219, 25);
		add(exportListsLblBtn);
		exportListsLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		listsPanelBackBtn = new JButton("Volver");
		listsPanelBackBtn.setBounds(844, 556, 98, 33);
		listsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(listsPanelBackBtn);
		listsPanelBackBtn.addActionListener(new ActionListener() {
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
			}
		});

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(49, 11, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo(1).png"));
		add(lblLogoErrekamusic);

		overlayLbl = new JLabel("");
		overlayLbl.setBounds(0, 0, 305, 611);
		overlayLbl.setIcon(new ImageIcon("contents/overlayClr.jpg"));
		add(overlayLbl);

		lblFavoriteTitle = new JLabel("Playlists");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(200, 40, 255));
		lblFavoriteTitle.setFont(new Font("Segoe UI Black", Font.PLAIN, 36));
		lblFavoriteTitle.setBounds(328, 32, 349, 64);
		add(lblFavoriteTitle);

		comboBox = new JComboBox<String>();
		comboBox.setVisible(true);
		comboBox.setBounds(396, 146, 231, 22);
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					getLists();
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
					int playlistId = listUniqueID[comboBox.getSelectedIndex()];
					System.out.println(playlistId);
					getPlayListInfo(playlistId);
				} catch (ClassNotFoundException c) {
					c.printStackTrace();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
			}
		});

		add(comboBox);

		JLabel lblSeleccionaTuPlaylist = new JLabel("Selecciona tu playlist:");
		lblSeleccionaTuPlaylist.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionaTuPlaylist.setForeground(new Color(200, 40, 255));
		lblSeleccionaTuPlaylist.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblSeleccionaTuPlaylist.setBounds(398, 110, 219, 25);
		add(lblSeleccionaTuPlaylist);

		textArea = new JTextArea(20, 40);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(340, 220, 527, 271);
		add(scrollPane);

		JLabel lblTtulo = new JLabel("Informacion del contenido:");
		lblTtulo.setBackground(new Color(255, 255, 255));
		lblTtulo.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblTtulo);
		lblTtulo.setForeground(new Color(200, 40, 255));
		lblTtulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
	}

	public JPanel getListsPanel() {
		return this;
	}

	private void getLists() throws ClassNotFoundException, SQLException {
		List<PlayList> listsNames = new ListsController()
				.getUserListsNames(Sesion.getInstance().getUserInfo().getLoginUser());
		listUniqueID = new int[listsNames.size()];
		boxmodel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < listsNames.size(); i++) {
			listUniqueID[i] = listsNames.get(i).getPlayListID();
			String listUniqueName = listsNames.get(i).getPlayListTitle();
			boxmodel.addElement(listUniqueName);

		}
	}

	private void getPlayListInfo(int PlayListID) throws ClassNotFoundException, SQLException {
		PlayList playListInfo = new ListsController().getPlayListInfo(PlayListID);
		textArea.setText("Titulo de la cancion: " + playListInfo.getContenido().getContentName()
				+ "   Duracion del contenido: " + playListInfo.getContenido().getContentDuration()
				+ "   Veces reproducido: " + playListInfo.getContenido().getContentReproNum() + "\r\n");
	}
}

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
import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.logica.ContentController;
import errekamusic.logica.ListsController;
import errekamusic.logica.MusicPlayer;
import errekamusic.logica.Sesion;

public class ContentPlayerPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblProfilePicture = null;
	private JButton btn_Registro_1_1 = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JLabel play = null;
	private JLabel previous = null;
	private JLabel next = null;
	private MusicPlayer musicPlayer = null;
	private JLabel songName = null;
	private JLabel artistName = null;
	private JLabel discName = null;
	private ImageIcon discImage = null;
	private List<Song> musicList = null;
	private DefaultComboBoxModel<String> boxmodel = null;
	private JComboBox<String> comboBox = null;
	private PlayList playList = null;
	private JLabel discImageLabel = null;
	private int cancionActual = -1;
	private boolean audioPlay = true;
	int[] listUniqueID = null;
	private int songID = 0;

	/**
	 * Create the panel.
	 */
	public ContentPlayerPanel() {

		musicPlayer = new MusicPlayer();

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

		btn_Registro_1_1 = new JButton("Volver");
		btn_Registro_1_1.setBounds(844, 556, 98, 33);
		btn_Registro_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(btn_Registro_1_1);
		btn_Registro_1_1.addActionListener(new ActionListener() {
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
		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		lblFavoriteTitle = new JLabel("Reproductor de contenido");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(200, 40, 255));
		lblFavoriteTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblFavoriteTitle.setBounds(215, 32, 527, 64);
		add(lblFavoriteTitle);

		previous = new JLabel();
		previous.setIcon(new ImageIcon("./contents/backward-solid.png"));
		previous.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				musicPlayer.stopMusic();
				if (cancionActual > 0) {
					cancionActual--;
				} else {
					cancionActual = musicList.size() - 1;
				}
				musicPlayer.playMusic(musicList.get(cancionActual));
				setSongData();
			}
		});
		previous.setBounds(161, 556, 71, 33);
		add(previous);

		play = new JLabel();
		play.setIcon(new ImageIcon("./contents/play-solid.png"));
		play.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == play) {
					if (!audioPlay) {
						ContentController contentManager = new ContentController();
						try {
							musicList = contentManager.getSongById(Sesion.getInstance().getContentID());
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
						if (cancionActual < 0) {
							musicPlayer = new MusicPlayer();

							cancionActual = 0;
							musicPlayer.playMusic(musicList.get(cancionActual));
							setSongData();
						} else {
							musicPlayer.stopMusic();
							audioPlay = true;
							play.setIcon(new ImageIcon("./contents/play-solid.png"));
							musicPlayer.resumeMusic(musicList.get(cancionActual));
						}
					} else {
						audioPlay = false;
						play.setIcon(new ImageIcon("./contents/pause-solid.png"));
						musicPlayer.pauseMusic();
					}
				}
			}
		});
		play.setBounds(340, 556, 71, 33);
		add(play);

		next = new JLabel();
		next.setIcon(new ImageIcon("./contents/forward-solid.png"));
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				musicPlayer.stopMusic();
				if (cancionActual < musicList.size() - 1) {
					cancionActual++;
				} else {
					cancionActual = 0;
				}
				musicPlayer.playMusic(musicList.get(cancionActual));
				setSongData();
			}
		});
		next.setBounds(496, 552, 89, 40);
		add(next);

		comboBox = new JComboBox<String>();
		comboBox.setVisible(true);
		comboBox.setBounds(737, 197, 231, 22);
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent c) {
				try {
					getLists();
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
				int playlistId = listUniqueID[comboBox.getSelectedIndex()];
				playList.setPlayListID(playlistId);

				try {
					if (insertSongIntoPlayList(playList)) {
						JOptionPane.showMessageDialog(null, "Contenido añadido correctamente a la lista!", "Confirmado",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "No se ha añadido el contenido a la playlist...", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (ClassNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "No se ha encontrado un archivo...", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Esta cancion ya ha sido añadida a la playList.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});

		add(comboBox);

		JLabel presentName = new JLabel("Nombre de la cancion:");
		presentName.setHorizontalAlignment(SwingConstants.CENTER);
		presentName.setForeground(new Color(200, 40, 255));
		presentName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		presentName.setBounds(37, 143, 345, 51);
		add(presentName);

		songName = new JLabel("");
		songName.setHorizontalAlignment(SwingConstants.CENTER);
		songName.setForeground(new Color(255, 255, 255));
		songName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		songName.setBounds(37, 187, 345, 51);
		add(songName);

		JLabel presentArtist = new JLabel("Nombre del artista:");
		presentArtist.setHorizontalAlignment(SwingConstants.CENTER);
		presentArtist.setForeground(new Color(200, 40, 255));
		presentArtist.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		presentArtist.setBounds(37, 265, 345, 51);
		add(presentArtist);

		artistName = new JLabel("");
		artistName.setHorizontalAlignment(SwingConstants.CENTER);
		artistName.setForeground(Color.WHITE);
		artistName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		artistName.setBounds(37, 327, 345, 51);
		add(artistName);

		JLabel presentDisc = new JLabel("Disco al que pertenece:");
		presentDisc.setHorizontalAlignment(SwingConstants.CENTER);
		presentDisc.setForeground(new Color(200, 40, 255));
		presentDisc.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		presentDisc.setBounds(37, 389, 345, 51);
		add(presentDisc);

		discName = new JLabel("");
		discName.setHorizontalAlignment(SwingConstants.CENTER);
		discName.setForeground(Color.WHITE);
		discName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		discName.setBounds(37, 434, 345, 51);
		add(discName);

		discImageLabel = new JLabel("Disc Image");
		discImageLabel.setBounds(379, 151, 331, 290);
		add(discImageLabel);

		JLabel lblAadeEstaCancion = new JLabel("Añade esta canciona tu lista!");
		lblAadeEstaCancion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadeEstaCancion.setForeground(new Color(200, 40, 255));
		lblAadeEstaCancion.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblAadeEstaCancion.setBounds(720, 135, 263, 73);
		add(lblAadeEstaCancion);

	}

	public void setSongData() {
		try {
			playList = new PlayList();
			playList.setContenido(musicList.get(cancionActual));
			songID = musicList.get(cancionActual).getContentID();
			songName.setText(musicList.get(cancionActual).getContentName());
			discName.setText(musicList.get(cancionActual).getDisc().getCollectionName());
			artistName.setText(musicList.get(cancionActual).getDisc().getArtist().getArtistName());
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void getLists() throws ClassNotFoundException, SQLException {
		List<PlayList> lists = new ListsController()
				.getUserListsNames(Sesion.getInstance().getUserInfo().getLoginUser());
		listUniqueID = new int[lists.size()];
		boxmodel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < lists.size(); i++) {
			listUniqueID[i] = lists.get(i).getPlayListID();
			String listUniqueName = lists.get(i).getPlayListTitle();
			boxmodel.addElement(listUniqueName);
		}
	}

	private boolean insertSongIntoPlayList(PlayList playList) throws ClassNotFoundException, SQLException {
		ListsController listsController = new ListsController();
		return listsController.insertContentIntoPlayList(playList);

	}

	public JPanel getContentPlayerPanel() {
		return this;
	}
}
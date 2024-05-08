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

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.logica.MusicPlayer;
import errekamusic.logica.CollectionController;

public class ContentPlayerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPlayerPanel = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblProfilePicture = null;
	private JButton btn_Registro_1_1 = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel seeYourProfileLbl = null;
	private JButton play = null;
	private JButton previous = null;
	private JButton next = null;
	private MusicPlayer musicPlayer = null;
	private JLabel songName = null;
	private JLabel artistName = null;
	private JLabel discName = null;
	private List<Canciones> musicList = null;
	private List<Disc> discList = null;
	private CollectionController collectionController = null;
	private int cancionActual = -1;
	private boolean audioPlay = true;

	/**
	 * Create the panel.
	 */
	public ContentPlayerPanel(ArrayList<JPanel> paneles) {
		contentPlayerPanel = new JPanel();
		contentPlayerPanel.setBounds(0, 0, 984, 611);
		contentPlayerPanel.setBackground(new Color(0, 0, 0));
		contentPlayerPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(923, 11, 51, 51);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.jpg"));
		contentPlayerPanel.add(lblProfilePicture);
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
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		contentPlayerPanel.add(seeYourProfileLbl);

		btn_Registro_1_1 = new JButton("Volver");
		btn_Registro_1_1.setBounds(844, 556, 98, 33);
		btn_Registro_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPlayerPanel.add(btn_Registro_1_1);
		btn_Registro_1_1.addActionListener(new ActionListener() {
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
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		contentPlayerPanel.add(lblLogoErrekamusic);

		lblFavoriteTitle = new JLabel("Reproductor de contenido");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(200, 40, 255));
		lblFavoriteTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblFavoriteTitle.setBounds(215, 32, 527, 64);
		contentPlayerPanel.add(lblFavoriteTitle);

		previous = new JButton("Anterior");
		previous.setIcon(new ImageIcon("./contents/backward.solid.png"));
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				musicPlayer.stopMusic();
				if (cancionActual <= musicList.size()) {
					cancionActual--;
					musicPlayer.playMusic(musicList.get(cancionActual));
					songName.setText(musicList.get(cancionActual).getContentName());

				}
			}
		});
		previous.setBounds(279, 473, 71, 33);
		contentPlayerPanel.add(previous);

		play = new JButton("Play");
		play.setIcon(new ImageIcon("./contents/play-solid.png"));
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == play) {
					if (!audioPlay) {
						if (cancionActual < 0) {
							musicPlayer = new MusicPlayer();
							musicList = musicPlayer.getSongsList();
							cancionActual = 0;
							musicPlayer.playMusic(musicList.get(cancionActual));
							setSongData();
						} else {
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
		play.setBounds(497, 473, 71, 33);
		contentPlayerPanel.add(play);

		next = new JButton("Siguiente");
		next.setIcon(new ImageIcon("./contents/forward-solid.png"));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				musicPlayer.stopMusic();
				if (cancionActual < musicList.size() - 1) {
					cancionActual++;
				} else {
					cancionActual = 0;
				}
				musicPlayer.playMusic(musicList.get(cancionActual));

			}
		});
		next.setBounds(694, 473, 89, 40);
		contentPlayerPanel.add(next);

		JLabel presentName = new JLabel("Nombre de la cancion:");
		presentName.setHorizontalAlignment(SwingConstants.CENTER);
		presentName.setForeground(new Color(200, 40, 255));
		presentName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		presentName.setBounds(37, 158, 345, 51);
		contentPlayerPanel.add(presentName);

		songName = new JLabel("***");
		songName.setHorizontalAlignment(SwingConstants.CENTER);
		songName.setForeground(new Color(255, 255, 255));
		songName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		songName.setBounds(37, 202, 345, 51);
		contentPlayerPanel.add(songName);

		JLabel presentArtist = new JLabel("Nombre de la artista:");
		presentArtist.setHorizontalAlignment(SwingConstants.CENTER);
		presentArtist.setForeground(new Color(200, 40, 255));
		presentArtist.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		presentArtist.setBounds(29, 249, 345, 51);
		contentPlayerPanel.add(presentArtist);

		artistName = new JLabel("***");
		artistName.setHorizontalAlignment(SwingConstants.CENTER);
		artistName.setForeground(Color.WHITE);
		artistName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		artistName.setBounds(37, 311, 345, 51);
		contentPlayerPanel.add(artistName);

		JLabel presentDisc = new JLabel("Disco que pertenece");
		presentDisc.setHorizontalAlignment(SwingConstants.CENTER);
		presentDisc.setForeground(new Color(200, 40, 255));
		presentDisc.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		presentDisc.setBounds(496, 158, 345, 51);
		contentPlayerPanel.add(presentDisc);

		discName = new JLabel("***");
		discName.setHorizontalAlignment(SwingConstants.CENTER);
		discName.setForeground(Color.WHITE);
		discName.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		discName.setBounds(506, 202, 345, 51);
		contentPlayerPanel.add(discName);

	}

	public void setSongData() {
		try {
			songName.setText(musicList.get(cancionActual).getContentName());
			collectionController = new CollectionController();
			discList = collectionController.getDiscList(cancionActual + 1);
			discName.setText(discList.get(cancionActual).getCollectionName());
			artistName.setText(discList.get(cancionActual).getArtist().getArtistName());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public JPanel getContentPlayerPanel() {
// TODO Auto-generated method stub
		return contentPlayerPanel;
	}
}
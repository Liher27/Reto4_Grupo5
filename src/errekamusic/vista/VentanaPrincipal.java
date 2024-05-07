
package errekamusic.vista;

import errekamusic.vista.complementos.*;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Aqui iniciamos el programa
 */
public class VentanaPrincipal extends JFrame {
	/**
	 * el JFrame para panel
	 */
	private JFrame frame;

	private ArrayList<JPanel> paneles = null;
	private JPanel contentPlayerPanel = null;
	private JPanel adminPanel = null;
	private JPanel discsPanel = null;
	private JPanel groupPanel = null;
	private JPanel listsPanel = null;
	private JPanel loginPanel = null;
	private JPanel mainMenuPanel = null;
	private JPanel podcasterPanel = null;
	private JPanel profilePanel = null;
	private JPanel podcastPanel = null;
	private JPanel registerPanel = null;
	private JPanel seriesPanel = null;
	private JPanel songsPanel = null;
	private JPanel welcomePanel = null;
	
	private static String username = null;

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		VentanaPrincipal.username = username;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param metodo main para iniciar el frame con los paneles
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new VentanaPrincipal().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * iniciamos a los paneles aqui
	 */
	public VentanaPrincipal() {
		inicializarPaneles();
	}

	private void inicializarPaneles() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		/**
		 * El array que usaremos para guardar los paneles
		 */
		paneles = new ArrayList<JPanel>();

		// 0
		WelcomePanel welcome = new WelcomePanel(paneles);
		welcomePanel = welcome.inicializarPanelDeBienvenida();
		welcomePanel.setVisible(true);
		paneles.add(welcomePanel);
		frame.getContentPane().add(welcomePanel);
		// 1
		LoginPanel login = new LoginPanel(paneles);
		loginPanel = login.getPanelDeLogin();
		loginPanel.setVisible(false);
		paneles.add(loginPanel);
		frame.getContentPane().add(loginPanel);
		// 2
		RegisterPanel register = new RegisterPanel(paneles);
		registerPanel = register.getPanelDeRegistro();
		registerPanel.setVisible(false);
		paneles.add(registerPanel);
		frame.getContentPane().add(registerPanel);
		// 3
		MainMenuPanel mainMenu = new MainMenuPanel(paneles);
		mainMenuPanel = mainMenu.getPanelPrincipal();
		mainMenuPanel.setVisible(false);
		paneles.add(mainMenuPanel);
		frame.getContentPane().add(mainMenuPanel);
		// 4
		GroupPanel group = new GroupPanel(paneles);
		groupPanel = group.getPanelGrupos();
		groupPanel.setVisible(false);
		paneles.add(groupPanel);
		frame.getContentPane().add(groupPanel);
		// 5
		PodcastPanel podcast = new PodcastPanel(paneles);
		podcastPanel = podcast.getPanelPodcast();
		podcastPanel.setVisible(false);
		paneles.add(podcastPanel);
		frame.getContentPane().add(podcastPanel);
		// 6
		ContentPlayerPanel contentPlayer = new ContentPlayerPanel(paneles);
		contentPlayerPanel = contentPlayer.getContentPlayerPanel();
		contentPlayerPanel.setVisible(false);
		paneles.add(contentPlayerPanel);
		frame.getContentPane().add(contentPlayerPanel);
		// 7
		ListsPanel lists = new ListsPanel(paneles);
		listsPanel = lists.getPanelFavoritos();
		listsPanel.setVisible(false);
		paneles.add(listsPanel);
		frame.getContentPane().add(listsPanel);
		// 8
		ProfilePanel profile = new ProfilePanel(paneles);
		profilePanel = profile.getPanelPerfiles();
		profilePanel.setVisible(false);
		paneles.add(profilePanel);
		frame.getContentPane().add(profilePanel);
		// 9
		AdminPanel admin = new AdminPanel(paneles);
		adminPanel = admin.getPanelAdministrador();
		adminPanel.setVisible(false);
		paneles.add(adminPanel);
		frame.getContentPane().add(adminPanel);
		// 10
		DiscsPanel discs = new DiscsPanel(paneles);
		discsPanel = discs.getDiscsPanel();
		discsPanel.setVisible(false);
		paneles.add(discsPanel);
		frame.getContentPane().add(discsPanel);
		// 11
		PodcasterPanel podcaster = new PodcasterPanel(paneles);
		podcasterPanel = podcaster.getPodcasterPanel();
		podcasterPanel.setVisible(false);
		paneles.add(podcasterPanel);
		frame.getContentPane().add(podcasterPanel);
		// 12
		SeriesPanel series = new SeriesPanel(paneles);
		seriesPanel = series.getSeriesPanel();
		seriesPanel.setVisible(false);
		paneles.add(seriesPanel);
		frame.getContentPane().add(seriesPanel);
		// 13
		SongsPanel songs = new SongsPanel(paneles);
		songsPanel = songs.getSongsPanel();
		songsPanel.setVisible(false);
		paneles.add(songsPanel);
		frame.getContentPane().add(songsPanel);

	}

}

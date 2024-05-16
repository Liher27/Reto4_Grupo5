
package errekamusic.vista;

import errekamusic.logica.Sesion;
import errekamusic.vista.complementos.*;

import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Aqui iniciamos el programa
 */
public class VentanaPrincipal extends JFrame {
	/**
	 * el JFrame para panel
	 */

	private JFrame frame = null;
	
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
	private JPanel groupInfoPanel = null;
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param metodo main para iniciar el frame con los 
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
	 * iniciamos a los  aqui
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public VentanaPrincipal() throws ClassNotFoundException, SQLException {
		inicializar();
	}

	private void inicializar() throws ClassNotFoundException, SQLException {

		frame= new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		/**
		 * El array que usaremos para guardar los 
		 */

		// 0
		WelcomePanel welcome = new WelcomePanel();
		welcomePanel = welcome.getWelcomePanel();
		welcomePanel.setVisible(true);
		frame.getContentPane().add(welcomePanel);
		Sesion.getInstance().setWelcomePanel(welcome);
		// 1
		LoginPanel login = new LoginPanel();
		loginPanel = login.getLoginPanel();
		loginPanel.setVisible(false);
		frame.getContentPane().add(loginPanel);
		Sesion.getInstance().setLoginPanel(login);
		// 2
		RegisterPanel register = new RegisterPanel();
		registerPanel = register.getRegisterPanel();
		registerPanel.setVisible(false);
		frame.getContentPane().add(registerPanel);
		Sesion.getInstance().setRegisterPanel(register);
		// 3
		MainMenuPanel mainMenu = new MainMenuPanel();
		mainMenuPanel = mainMenu.getMainMenuPanel();
		mainMenuPanel.setVisible(false);
		frame.getContentPane().add(mainMenuPanel);
		Sesion.getInstance().setMainMenuPanel(mainMenu);
		// 4
		GroupPanel group = new GroupPanel();
		groupPanel = group.getGroupPanel();
		groupPanel.setVisible(false);
		frame.getContentPane().add(groupPanel);
		Sesion.getInstance().setGroupPanel(group);
		// 5
		PodcastPanel podcast = new PodcastPanel();
		podcastPanel = podcast.getPodcastPanel();
		podcastPanel.setVisible(false);
		frame.getContentPane().add(podcastPanel);
		Sesion.getInstance().setPodcastPanel(podcast);
		// 6
		ContentPlayerPanel contentPlayer = new ContentPlayerPanel();
		contentPlayerPanel = contentPlayer.getContentPlayerPanel();
		contentPlayerPanel.setVisible(false);
		frame.getContentPane().add(contentPlayerPanel);
		Sesion.getInstance().setContentPlayerPanel(contentPlayer);
		// 7
		ListsPanel lists = new ListsPanel();
		listsPanel = lists.getListsPanel();
		listsPanel.setVisible(false);
		frame.getContentPane().add(listsPanel);
		Sesion.getInstance().setListsPanel(lists);
		// 8
		ProfilePanel profile = new ProfilePanel();
		profilePanel = profile.getProfilePanel();
		profilePanel.setVisible(false);
		frame.getContentPane().add(profilePanel);
		Sesion.getInstance().setProfilePanel(profile);
		// 9
		AdminPanel admin = new AdminPanel();
		adminPanel = admin.getAdminPanel();
		adminPanel.setVisible(false);
		frame.getContentPane().add(adminPanel);
		Sesion.getInstance().setAdminPanel(admin);
		// 10
		DiscsPanel discs = new DiscsPanel();
		discsPanel = discs.getDiscsPanel();
		discsPanel.setVisible(false);
		frame.getContentPane().add(discsPanel);
		Sesion.getInstance().setDiscsPanel(discs);
		// 11
		PodcasterPanel podcaster = new PodcasterPanel();
		podcasterPanel = podcaster.getPodcasterPanel();
		podcasterPanel.setVisible(false);
		frame.getContentPane().add(podcasterPanel);
		Sesion.getInstance().setPodcasterPanel(podcaster);
		// 12
		SeriesPanel series = new SeriesPanel();
		seriesPanel = series.getSeriesPanel();
		seriesPanel.setVisible(false);
		frame.getContentPane().add(seriesPanel);
		Sesion.getInstance().setSeriesPanel(series);
		// 13
		SongsPanel songs = new SongsPanel();
		songsPanel = songs.getSongsPanel();
		songsPanel.setVisible(false);
		frame.getContentPane().add(songsPanel);
		Sesion.getInstance().setSongsPanel(songs);
		//14
		GroupInfoPanel groupInfo = new GroupInfoPanel();
		groupInfoPanel = groupInfo.getGroupInfoPanel();
		frame.getContentPane().add(groupInfoPanel);
		groupInfoPanel.setVisible(false);
		Sesion.getInstance().setGroupInfoPanel(groupInfo);
		
	}

}

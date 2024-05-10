package errekamusic.logica;

import errekamusic.vista.complementos.*;

/**
 * El singleton que nos permita conseguir los varaibles de otro panel y hacer
 * cambio de paneles
 */
public class Sesion {
	
	private static Sesion singletonSesion = null;

	private AdminPanel adminPanel = null;
	private ContentPlayerPanel contentPlayerPanel = null;
	private DiscsPanel discsPanel = null;
	private GroupPanel groupPanel = null;
	private ListsPanel listsPanel = null;
	private LoginPanel loginPanel = null;
	private MainMenuPanel mainMenuPanel = null;
	private PodcasterPanel podcasterPanel = null;
	private PodcastPanel podcastPanel = null;
	private ProfilePanel profilePanel = null;
	private RegisterPanel registerPanel = null;
	private SeriesPanel seriesPanel = null;
	private SongsPanel songsPanel = null;
	private WelcomePanel welcomePanel = null;

	/**
	 * codigo de pelicula
	 */
	public String username = null;

	/**
	 * Utilizar este metodo para iniciarlizar y nos devuelve el contenido que lleva
	 * 
	 * @return singletonSesion
	 */
	public static Sesion getInstance() {
		if (null == singletonSesion) {
			singletonSesion = new Sesion();
		}
		return singletonSesion;
	}

	public AdminPanel getAdminPanel() {
		return adminPanel;
	}

	public void setAdminPanel(AdminPanel adminPanel) {
		this.adminPanel = adminPanel;
	}

	public ContentPlayerPanel getContentPlayerPanel() {
		return contentPlayerPanel;
	}

	public void setContentPlayerPanel(ContentPlayerPanel contentPlayerPanel) {
		this.contentPlayerPanel = contentPlayerPanel;
	}

	public DiscsPanel getDiscsPanel() {
		return discsPanel;
	}

	public void setDiscsPanel(DiscsPanel discsPanel) {
		this.discsPanel = discsPanel;
	}

	public GroupPanel getGroupPanel() {
		return groupPanel;
	}

	public void setGroupPanel(GroupPanel groupPanel) {
		this.groupPanel = groupPanel;
	}

	public ListsPanel getListsPanel() {
		return listsPanel;
	}

	public void setListsPanel(ListsPanel listsPanel) {
		this.listsPanel = listsPanel;
	}

	public LoginPanel getLoginPanel() {
		return loginPanel;
	}

	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

	public MainMenuPanel getMainMenuPanel() {
		return mainMenuPanel;
	}

	public void setMainMenuPanel(MainMenuPanel mainMenuPanel) {
		this.mainMenuPanel = mainMenuPanel;
	}

	public PodcasterPanel getPodcasterPanel() {
		return podcasterPanel;
	}

	public void setPodcasterPanel(PodcasterPanel podcasterPanel) {
		this.podcasterPanel = podcasterPanel;
	}

	public PodcastPanel getPodcastPanel() {
		return podcastPanel;
	}

	public void setPodcastPanel(PodcastPanel podcastPanel) {
		this.podcastPanel = podcastPanel;
	}

	public ProfilePanel getProfilePanel() {
		return profilePanel;
	}

	public void setProfilePanel(ProfilePanel profilePanel) {
		this.profilePanel = profilePanel;
	}

	public RegisterPanel getRegisterPanel() {
		return registerPanel;
	}

	public void setRegisterPanel(RegisterPanel registerPanel) {
		this.registerPanel = registerPanel;
	}

	public SeriesPanel getSeriesPanel() {
		return seriesPanel;
	}

	public void setSeriesPanel(SeriesPanel seriesPanel) {
		this.seriesPanel = seriesPanel;
	}

	public SongsPanel getSongsPanel() {
		return songsPanel;
	}

	public void setSongsPanel(SongsPanel songsPanel) {
		this.songsPanel = songsPanel;
	}

	public WelcomePanel getWelcomePanel() {
		return welcomePanel;
	}

	public void setWelcomePanel(WelcomePanel welcomePanel) {
		this.welcomePanel = welcomePanel;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
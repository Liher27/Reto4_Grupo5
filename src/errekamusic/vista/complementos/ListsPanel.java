package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import errekamusic.logica.Singleton;

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

	private JButton listsPanelBackBtn = null;

	/**
	 * Create the panel.
	 * -	Crear una lista
	 *	-	Borrar una lista
	 *	-	Ver las canciones de una lista
	 *	-	Exportar todas las listas a un fichero
	 *	-	Importar todas las listas de un fichero 
	 */
	public ListsPanel() {

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
				Singleton.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Singleton.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Singleton.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Singleton.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Singleton.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Singleton.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Singleton.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Singleton.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Singleton.getInstance().getProfilePanel().getProfilePanel().setVisible(true);
				Singleton.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Singleton.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Singleton.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Singleton.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Singleton.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
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
				Singleton.getInstance().getWelcomePanel().getWelcomePanel().setVisible(true);
				Singleton.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Singleton.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Singleton.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Singleton.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Singleton.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Singleton.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Singleton.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Singleton.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Singleton.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Singleton.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Singleton.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Singleton.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Singleton.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
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
				Singleton.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Singleton.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Singleton.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Singleton.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(true);
				Singleton.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Singleton.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Singleton.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Singleton.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Singleton.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Singleton.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Singleton.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Singleton.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Singleton.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Singleton.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
				
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
		
		
	}

	public JPanel getListsPanel() {
		// TODO Auto-generated method stub
		return this;
	}
}

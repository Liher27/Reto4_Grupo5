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

public class ListsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel listsPanel = null;
	private MainMenuPanel mainMenuPanel = null;

	private JLabel lblProfilePicture = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	private JLabel createListLblBtn = null;
	private JLabel listsPanelBackLblBtn = null;
	private JLabel deleteListLblBtn = null;
	private JLabel exportListsLblBtn = null;
	private JLabel importListsLblBtn = null;
	private JLabel overlayLbl = null;

	private JButton listsPanelBackBtn = null;

	/**
	 * Create the panel.
	 * -	Crear una lista
	 *	-	Borrar una lista
	 *	-	Ver las canciones de una lista
	 *	-	Exportar todas las listas a un fichero
	 *	-	Importar todas las listas de un fichero 
	 */
	public ListsPanel(ArrayList<JPanel> paneles) {

		listsPanel = new JPanel();
		listsPanel.setBounds(0, 0, 984, 611);
		listsPanel.setBackground(new Color(0, 0, 0));
		listsPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		listsPanel.add(lblProfilePicture);
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

		listsPanelBackLblBtn = new JLabel("Salir ");
		listsPanelBackLblBtn.setForeground(new Color(255, 222, 89));
		listsPanelBackLblBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		listsPanelBackLblBtn.setBounds(49, 460, 219, 25);
		listsPanel.add(listsPanelBackLblBtn);
		listsPanelBackLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
			}
		});
		
		createListLblBtn = new JLabel("Crear lista");
		createListLblBtn.setForeground(new Color(255, 222, 89));
		createListLblBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		createListLblBtn.setBounds(49, 166, 214, 25);
		listsPanel.add(createListLblBtn);

		deleteListLblBtn = new JLabel("Eliminar lista");
		deleteListLblBtn.setForeground(new Color(255, 222, 89));
		deleteListLblBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		deleteListLblBtn.setBounds(49, 243, 214, 25);
		listsPanel.add(deleteListLblBtn);
		deleteListLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(true);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}
		});

		importListsLblBtn = new JLabel("Importar lista");
		importListsLblBtn.setForeground(new Color(255, 222, 89));
		importListsLblBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		importListsLblBtn.setBounds(49, 317, 219, 25);
		listsPanel.add(importListsLblBtn);
		importListsLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				

			}
		});

		exportListsLblBtn = new JLabel("Exportar lista");
		exportListsLblBtn.setForeground(new Color(255, 222, 89));
		exportListsLblBtn.setFont(new Font("Cambria", Font.BOLD, 20));
		exportListsLblBtn.setBounds(49, 393, 219, 25);
		listsPanel.add(exportListsLblBtn);
		exportListsLblBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			
			}
		});

		listsPanelBackBtn = new JButton("Volver");
		listsPanelBackBtn.setBounds(844, 556, 98, 33);
		listsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		listsPanel.add(listsPanelBackBtn);
		listsPanelBackBtn.addActionListener(new ActionListener() {
		
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
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo(1).png"));
		listsPanel.add(lblLogoErrekamusic);
		
		overlayLbl = new JLabel("");
		overlayLbl.setBounds(0, 0, 305, 611);
		overlayLbl.setIcon(new ImageIcon("contents/overlayClr.png"));
		listsPanel.add(overlayLbl);

		lblFavoriteTitle = new JLabel("Playlists");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(255, 222, 89));
		lblFavoriteTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblFavoriteTitle.setBounds(328, 32, 349, 64);
		listsPanel.add(lblFavoriteTitle);
		
		
	}

	public JPanel getPanelFavoritos() {
		// TODO Auto-generated method stub
		return listsPanel;
	}
}

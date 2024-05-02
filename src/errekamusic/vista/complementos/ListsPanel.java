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

	private JPanel favoritesPanel = null;

	private JLabel lblProfilePicture = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;

	private JButton listsPanelBackBtn = null;

	/**
	 * Create the panel.
	 */
	public ListsPanel(ArrayList<JPanel> paneles) {

		favoritesPanel = new JPanel();
		favoritesPanel.setBounds(0, 0, 984, 611);
		favoritesPanel.setBackground(new Color(0, 0, 0));
		favoritesPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		favoritesPanel.add(lblProfilePicture);
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

		listsPanelBackBtn = new JButton("Volver");
		listsPanelBackBtn.setBounds(844, 556, 98, 33);
		listsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		favoritesPanel.add(listsPanelBackBtn);
		listsPanelBackBtn.addActionListener(new ActionListener() {
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
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		favoritesPanel.add(lblLogoErrekamusic);

		lblFavoriteTitle = new JLabel("Playlists");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(255, 222, 89));
		lblFavoriteTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblFavoriteTitle.setBounds(328, 32, 349, 64);
		favoritesPanel.add(lblFavoriteTitle);
	}

	public JPanel getPanelFavoritos() {
		// TODO Auto-generated method stub
		return favoritesPanel;
	}

}

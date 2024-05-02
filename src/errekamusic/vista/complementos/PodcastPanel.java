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

public class PodcastPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel podcastPanel = null;

	private JLabel lblProfilePicture = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblSubtitle = null;
	private JLabel lblPodcastTitle = null;

	private JButton podcastPanelBackBtn = null;
	private JButton reproContentBtn = null;

	/**
	 * Create the panel.
	 */
	public PodcastPanel(ArrayList<JPanel> paneles) {

		podcastPanel = new JPanel();
		podcastPanel.setBounds(0, 0, 984, 611);
		podcastPanel.setBackground(new Color(0, 0, 0));
		podcastPanel.setLayout(null);

		lblPodcastTitle = new JLabel("Descubre podcasts");
		lblPodcastTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcastTitle.setForeground(new Color(255, 222, 89));
		lblPodcastTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblPodcastTitle.setBounds(328, 32, 349, 64);
		podcastPanel.add(lblPodcastTitle);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		podcastPanel.add(lblProfilePicture);
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

		podcastPanelBackBtn = new JButton("Volver");
		podcastPanelBackBtn.setBounds(844, 556, 98, 33);
		podcastPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		podcastPanel.add(podcastPanelBackBtn);
		podcastPanelBackBtn.addActionListener(new ActionListener() {
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

		lblSubtitle = new JLabel("Seleccione la opción que desee:");
		lblSubtitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtitle.setBounds(68, 64, 285, 25);
		podcastPanel.add(lblSubtitle);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		podcastPanel.add(lblLogoErrekamusic);

		reproContentBtn = new JButton("Reproducir contenido");
		reproContentBtn.setBounds(440, 561, 186, 28);
		podcastPanel.add(reproContentBtn);
		reproContentBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(true);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}

		});

	}

	public JPanel getPanelPodcast() {
		// TODO Auto-generated method stub
		return podcastPanel;
	}

}

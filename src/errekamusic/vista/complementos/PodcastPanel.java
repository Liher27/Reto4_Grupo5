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

public class PodcastPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblProfilePicture = null;
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblSubtitle = null;
	private JLabel lblPodcastTitle = null;
	private JLabel seeYourProfileLbl = null;

	private JButton reproContentBtn = null;
	private JButton podcastPanelBackBtn = null;

	/**
	 * Create the panel.
	 */
	public PodcastPanel() {

		setBounds(0, 0, 984, 611);
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		lblPodcastTitle = new JLabel("Descubre podcasts");
		lblPodcastTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcastTitle.setForeground(new Color(200, 40, 255));
		lblPodcastTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblPodcastTitle.setBounds(284, 32, 393, 64);
		add(lblPodcastTitle);

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

		podcastPanelBackBtn = new JButton("Volver");
		podcastPanelBackBtn.setBounds(844, 556, 98, 33);
		podcastPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(podcastPanelBackBtn);
		podcastPanelBackBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				Singleton.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
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
				Singleton.getInstance().getSeriesPanel().getSeriesPanel().setVisible(true);
				Singleton.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

			}

		});

		lblSubtitle = new JLabel("Seleccione la opción que desee:");
		lblSubtitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtitle.setBounds(68, 64, 285, 25);
		add(lblSubtitle);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		add(lblLogoErrekamusic);

		reproContentBtn = new JButton("Reproducir contenido");
		reproContentBtn.setBounds(440, 561, 186, 28);
		add(reproContentBtn);
		reproContentBtn.addActionListener(new ActionListener() {
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				Singleton.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Singleton.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Singleton.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Singleton.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Singleton.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Singleton.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Singleton.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(true);
				Singleton.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Singleton.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Singleton.getInstance().getAdminPanel().getAdminPanel().setVisible(false);
				Singleton.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Singleton.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Singleton.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Singleton.getInstance().getSongsPanel().getSongsPanel().setVisible(false);

			}

		});

	}

	public JPanel getPodcastPanel() {
		// TODO Auto-generated method stub
		return this;
	}

}

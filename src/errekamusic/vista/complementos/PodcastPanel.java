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

	private JButton btn_Registro = null;
	private JLabel lblProfilePicture = null;
	private JButton btn_Registro_1_1 = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblDescubregrupos = null;
	private JLabel lblpodcaster = null;
	private JLabel lblseries = null;
	private JLabel lblpodcast = null;

	/**
	 * Create the panel.
	 */
	public PodcastPanel(ArrayList<JPanel> paneles) {

		podcastPanel = new JPanel();
		podcastPanel.setBounds(0, 0, 984, 611);
		podcastPanel.setBackground(new Color(0, 0, 0));
		podcastPanel.setLayout(null);

		btn_Registro = new JButton("Reproducir");
		btn_Registro.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		podcastPanel.add(btn_Registro);
		btn_Registro.addActionListener(new ActionListener() {
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

		btn_Registro_1_1 = new JButton("Volver");
		btn_Registro_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_Registro_1_1.setBounds(739, 524, 149, 43);
		podcastPanel.add(btn_Registro_1_1);
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

		lblDescubregrupos = new JLabel("Seleccione la opción que desee:");
		lblDescubregrupos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescubregrupos.setBounds(68, 64, 285, 25);
		podcastPanel.add(lblDescubregrupos);

		lblpodcaster = new JLabel("1. Podcasters");
		lblpodcaster.setForeground(new Color(255, 222, 89));
		lblpodcaster.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpodcaster.setBounds(68, 166, 142, 54);
		podcastPanel.add(lblpodcaster);

		lblseries = new JLabel("2. Series ");
		lblseries.setForeground(new Color(255, 222, 89));
		lblseries.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblseries.setBounds(68, 253, 142, 49);
		podcastPanel.add(lblseries);

		lblpodcast = new JLabel("3. Podcast ");
		lblpodcast.setForeground(new Color(255, 222, 89));
		lblpodcast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpodcast.setBounds(68, 341, 142, 43);
		podcastPanel.add(lblpodcast);

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		podcastPanel.add(lblLogoErrekamusic);

	}

	public JPanel getPanelPodcast() {
		// TODO Auto-generated method stub
		return podcastPanel;
	}

}

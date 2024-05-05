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

public class DiscsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel discsPanel = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblDiscsTitle = null;
	private JLabel lblProfilePicture = null;

	private JButton discsPanelBackBtn = null;
	private JButton songInfoBtn = null;

	/**
	 * Create the panel.
	 */
	public DiscsPanel(ArrayList<JPanel> paneles) {

		discsPanel = new JPanel();
		discsPanel.setBounds(0, 0, 984, 611);
		discsPanel.setBackground(new Color(0, 0, 0));
		discsPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		discsPanel.add(lblProfilePicture);
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

		discsPanelBackBtn = new JButton("Volver");
		discsPanelBackBtn.setBounds(844, 556, 98, 33);
		discsPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		discsPanel.add(discsPanelBackBtn);
		discsPanelBackBtn.addActionListener(new ActionListener() {
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
		discsPanel.add(lblLogoErrekamusic);

		lblDiscsTitle = new JLabel("Descubre discos");
		lblDiscsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscsTitle.setForeground(new Color(200, 40, 255));
		lblDiscsTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblDiscsTitle.setBounds(328, 32, 349, 64);
		discsPanel.add(lblDiscsTitle);

		songInfoBtn = new JButton("Mas informacion");
		songInfoBtn.setBounds(440, 561, 186, 28);
		discsPanel.add(songInfoBtn);
		songInfoBtn.addActionListener(new ActionListener() {
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
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(true);

			}

		});
	}

	public JPanel getDiscsPanel() {
		// TODO Auto-generated method stub
		return discsPanel;
	}
}

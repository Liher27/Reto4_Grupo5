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

public class AdminPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel adminPanel = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblAdminTitle = null;

	private JButton adminPanelBackBtn = null;
	private JLabel lblProfilePicture = null;

	/**
	 * Create the panel.
	 */
	public AdminPanel(ArrayList<JPanel> paneles) {

		adminPanel = new JPanel();
		adminPanel.setBounds(0, 0, 984, 611);
		adminPanel.setBackground(new Color(0, 0, 0));
		adminPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		adminPanel.add(lblProfilePicture);
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

		adminPanelBackBtn = new JButton("Volver");
		adminPanelBackBtn.setBounds(844, 556, 98, 33);
		adminPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adminPanel.add(adminPanelBackBtn);
		adminPanelBackBtn.addActionListener(new ActionListener() {
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
		adminPanel.add(lblLogoErrekamusic);

		lblAdminTitle = new JLabel("Panel de administrador");
		lblAdminTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminTitle.setForeground(new Color(255, 255, 255));
		lblAdminTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblAdminTitle.setBounds(328, 32, 349, 64);
		adminPanel.add(lblAdminTitle);
	}

	public JPanel getPanelAdministrador() {
		// TODO Auto-generated method stub
		return adminPanel;
	}

}

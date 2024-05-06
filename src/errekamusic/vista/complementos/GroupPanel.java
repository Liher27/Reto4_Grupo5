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

public class GroupPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel groupPanel = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblGroupTitle = null;

	private JLabel lblProfilePicture = null;
	private JButton groupPanelBackBtn = null;
	private JButton collectionInfoBtn = null;
	private JLabel seeYourProfileLbl = null;

	/**
	 * Create the panel.
	 */
	public GroupPanel(ArrayList<JPanel> paneles) {

		groupPanel = new JPanel();
		groupPanel.setBounds(0, 0, 984, 611);
		groupPanel.setBackground(new Color(0, 0, 0));
		groupPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(923, 11, 51, 51);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.jpg"));
		groupPanel.add(lblProfilePicture);
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
		
		seeYourProfileLbl = new JLabel("Ver perfil");
		seeYourProfileLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		seeYourProfileLbl.setForeground(new Color(255, 255, 255));
		seeYourProfileLbl.setBounds(856, 26, 64, 25);
		groupPanel.add(seeYourProfileLbl);

		groupPanelBackBtn = new JButton("Volver");
		groupPanelBackBtn.setBounds(844, 556, 98, 33);
		groupPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		groupPanel.add(groupPanelBackBtn);
		groupPanelBackBtn.addActionListener(new ActionListener() {
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
		lblLogoErrekamusic.setBounds(29, -20, 145, 119);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/secondaryLogo.png"));
		groupPanel.add(lblLogoErrekamusic);

		lblGroupTitle = new JLabel("Descubre grupos");
		lblGroupTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupTitle.setForeground(new Color(200, 40, 255));
		lblGroupTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblGroupTitle.setBounds(328, 32, 349, 64);
		groupPanel.add(lblGroupTitle);

		collectionInfoBtn = new JButton("Mas informacion");
		collectionInfoBtn.setBounds(440, 561, 186, 28);
		groupPanel.add(collectionInfoBtn);
		collectionInfoBtn.addActionListener(new ActionListener() {
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
				paneles.get(10).setVisible(true);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);

			}

		});
	}

	public JPanel getPanelGrupos() {
		// TODO Auto-generated method stub
		return groupPanel;
	}

}

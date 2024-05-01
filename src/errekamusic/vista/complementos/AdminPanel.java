package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JLabel lblFavoriteTitle = null;

	private JButton btn_Registro_1_1 = null;
	private JButton btn_Registro_1 = null;

	/**
	 * Create the panel.
	 */
	public AdminPanel(ArrayList<JPanel> paneles) {

		adminPanel = new JPanel();
		adminPanel.setBounds(0, 0, 984, 611);
		adminPanel.setBackground(new Color(0, 0, 0));
		adminPanel.setLayout(null);

		btn_Registro_1 = new JButton("Perfil");
		btn_Registro_1.setBounds(736, 554, 87, 43);
		btn_Registro_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		adminPanel.add(btn_Registro_1);
		btn_Registro_1.addActionListener(new ActionListener() {
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
				paneles.get(8).setVisible(true);
				paneles.get(9).setVisible(false);
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);


			}

		});

		btn_Registro_1_1 = new JButton("Volver");
		btn_Registro_1_1.setBounds(845, 554, 101, 43);
		btn_Registro_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		adminPanel.add(btn_Registro_1_1);
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

		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10, 10, 145, 145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		adminPanel.add(lblLogoErrekamusic);

		lblFavoriteTitle = new JLabel("Panel de administrador");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(255, 222, 89));
		lblFavoriteTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblFavoriteTitle.setBounds(328, 32, 349, 64);
		adminPanel.add(lblFavoriteTitle);
	}

	public JPanel getPanelAdministrador() {
		// TODO Auto-generated method stub
		return adminPanel;
	}

}

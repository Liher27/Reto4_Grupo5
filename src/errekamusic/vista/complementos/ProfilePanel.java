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

public class ProfilePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelPerfiles = null;

	private JLabel lblLogoErrekamusic = null;

	private JButton btn_Registro_1 = null;
	private JButton btn_Registro_1_1 = null;

	/**
	 * Create the panel.
	 */
	public ProfilePanel(ArrayList<JPanel> paneles) {

		panelPerfiles = new JPanel();
		panelPerfiles.setBounds(0, 0, 984, 611);
		panelPerfiles.setBackground(new Color(0, 152, 218));
		panelPerfiles.setLayout(null);

		btn_Registro_1 = new JButton("Aceptar");
		btn_Registro_1.setBounds(636, 554, 139, 43);
		btn_Registro_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		panelPerfiles.add(btn_Registro_1);
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

		btn_Registro_1_1 = new JButton("Cancelar");
		btn_Registro_1_1.setBounds(807, 554, 139, 43);
		btn_Registro_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		panelPerfiles.add(btn_Registro_1_1);
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
		panelPerfiles.add(lblLogoErrekamusic);
	}

	public JPanel getPanelPerfiles() {
		// TODO Auto-generated method stub
		return panelPerfiles;
	}

}

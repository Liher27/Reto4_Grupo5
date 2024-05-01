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

public class SeriesPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel podcasterPanel = null;
	
	private JLabel lblLogoErrekamusic = null;
	private JLabel lblFavoriteTitle = null;
	
	private JButton btn_Registro_1_1 = null;
	private JButton btn_Registro_1 = null;

	/**
	 * Create the panel.
	 */
	public SeriesPanel(ArrayList<JPanel> paneles) {
		
		podcasterPanel = new JPanel();
		podcasterPanel.setBounds(0, 0, 984, 611);
		podcasterPanel.setBackground(new Color(0, 0, 0));
		podcasterPanel.setLayout(null);
		
		btn_Registro_1 = new JButton("Perfil");
		btn_Registro_1.setBounds(736, 554, 87, 43);
		btn_Registro_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		podcasterPanel.add(btn_Registro_1);
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

					
				}
			
		});
		
		btn_Registro_1_1 = new JButton("Volver");
		btn_Registro_1_1.setBounds(845, 554, 101, 43);
		btn_Registro_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		podcasterPanel.add(btn_Registro_1_1);
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

					
				}
		});
		
		lblLogoErrekamusic = new JLabel("");
		lblLogoErrekamusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoErrekamusic.setBounds(10,10,145,145);
		lblLogoErrekamusic.setIcon(new ImageIcon("contents/errekamusicLogo.png"));
		podcasterPanel.add(lblLogoErrekamusic);
		
		
		lblFavoriteTitle = new JLabel("Descubre canciones");
		lblFavoriteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoriteTitle.setForeground(new Color(255, 222, 89));
		lblFavoriteTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblFavoriteTitle.setBounds(328, 32, 349, 64);
		podcasterPanel.add(lblFavoriteTitle);
	}



	public JPanel getSeriesPanel() {
		// TODO Auto-generated method stub
		return podcasterPanel;
	}

}

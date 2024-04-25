package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPodcast extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelPodcast = null;


	/**
	 * Create the panel.
	 */
	public PanelPodcast(ArrayList<JPanel> paneles) {
		
		panelPodcast = new JPanel();
		panelPodcast.setBounds(0, 0, 984, 611);
		panelPodcast.setBackground(new Color(192, 192, 192));
		panelPodcast.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(68, 501, 250, 66);
		panelPodcast.add(panel);
		
		JButton btn_Registro = new JButton("Reproducir");
		btn_Registro.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		panel.add(btn_Registro);
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

					
				}
			
		});
		
		JButton btn_Registro_1 = new JButton("Perfil");
		btn_Registro_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_Registro_1.setBounds(739, 470, 149, 43);
		panelPodcast.add(btn_Registro_1);
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
		
		JButton btn_Registro_1_1 = new JButton("Volver");
		btn_Registro_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		btn_Registro_1_1.setBounds(739, 524, 149, 43);
		panelPodcast.add(btn_Registro_1_1);
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
		
		
		JLabel lblDescubregrupos = new JLabel("Seleccione la opción que desee:");
		lblDescubregrupos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescubregrupos.setBounds(68, 64, 285, 25);
		panelPodcast.add(lblDescubregrupos);
		
		JLabel lblpodcaster = new JLabel("1. Podcasters");
		lblpodcaster.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpodcaster.setBounds(68, 166, 142, 54);
		panelPodcast.add(lblpodcaster);
		
		JLabel lblseries = new JLabel("2. Series ");
		lblseries.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblseries.setBounds(68, 253, 142, 49);
		panelPodcast.add(lblseries);
		
		JLabel lblpodcast = new JLabel("3. Podcast ");
		lblpodcast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpodcast.setBounds(68, 341, 142, 43);
		panelPodcast.add(lblpodcast);

	}

	public JPanel getPanelPodcast() {
		// TODO Auto-generated method stub
		return panelPodcast;
	}

}

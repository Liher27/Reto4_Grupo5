package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGrupos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelGrupos = null;

	

	/**
	 * Create the panel.
	 */
	public PanelGrupos(ArrayList<JPanel> paneles) {
		
		panelGrupos = new JPanel();
		panelGrupos.setBounds(0, 0, 984, 611);
		panelGrupos.setBackground(new Color(192, 192, 192));
		panelGrupos.setLayout(null);
		
		
		JLabel lblDescubregrupos = new JLabel("Seleccione la opción que desee:");
		lblDescubregrupos.setBounds(101, 81, 285, 25);
		lblDescubregrupos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelGrupos.add(lblDescubregrupos);
		
		JLabel lblDescubrepodcast = new JLabel("1.Grupos");
		lblDescubrepodcast.setBounds(101, 183, 142, 54);
		lblDescubrepodcast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelGrupos.add(lblDescubrepodcast);
		
		JLabel lblListaFavoritos = new JLabel("2.Disco");
		lblListaFavoritos.setBounds(101, 270, 142, 49);
		lblListaFavoritos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelGrupos.add(lblListaFavoritos);
		
		JLabel lblSalir = new JLabel("3.Canción ");
		lblSalir.setBounds(101, 358, 142, 43);
		lblSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelGrupos.add(lblSalir);
		
		JPanel panel = new JPanel();
		panel.setBounds(101, 538, 250, 66);
		panelGrupos.add(panel);
		
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
		btn_Registro_1.setBounds(757, 507, 149, 43);
		panelGrupos.add(btn_Registro_1);
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
		btn_Registro_1_1.setBounds(757, 561, 149, 43);
		panelGrupos.add(btn_Registro_1_1);
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

	}

	public JPanel getPanelGrupos() {
		// TODO Auto-generated method stub
		return panelGrupos;
	}

}

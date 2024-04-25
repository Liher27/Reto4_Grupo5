package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelAdministrador extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelAdministrador = null;


	/**
	 * Create the panel.
	 */
	public PanelAdministrador(ArrayList<JPanel> paneles) {
		
		panelAdministrador = new JPanel();
		panelAdministrador.setBounds(0, 0, 984, 611);
		panelAdministrador.setBackground(new Color(192, 192, 192));
		panelAdministrador.setLayout(null);
		
		JButton btn_Registro_1 = new JButton("Perfil");
		btn_Registro_1.setBounds(736, 554, 87, 43);
		btn_Registro_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		panelAdministrador.add(btn_Registro_1);
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
		btn_Registro_1_1.setBounds(845, 554, 101, 43);
		btn_Registro_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		panelAdministrador.add(btn_Registro_1_1);
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



	public JPanel getPanelAdministrador() {
		// TODO Auto-generated method stub
		return panelAdministrador;
	}

}

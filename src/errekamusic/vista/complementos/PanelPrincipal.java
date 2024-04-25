package errekamusic.vista.complementos;

import javax.swing.JPanel;


import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;


	/**
	 * Create the panel.
	 */
	public PanelPrincipal(ArrayList<JPanel> paneles) {
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 984, 611);
		panelPrincipal.setBackground(new Color(192, 192, 192));
		panelPrincipal.setLayout(null);
		
		
		
		JLabel lblMenuPrincipal = new JLabel(" MENU PRINCIPAL ");
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMenuPrincipal.setBounds(325, 31, 266, 106);
		panelPrincipal.add(lblMenuPrincipal);
		
		JLabel lblDescubregrupos = new JLabel("1. Descubre Grupos");
		lblDescubregrupos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescubregrupos.setBounds(82, 195, 214, 25);
		panelPrincipal.add(lblDescubregrupos);
		lblDescubregrupos.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(true);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
//            
            }
		});
		
		JLabel lblDescubrepodcast = new JLabel("2. Descubre podcast ");
		lblDescubrepodcast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescubrepodcast.setBounds(82, 264, 219, 25);
		panelPrincipal.add(lblDescubrepodcast);
		lblDescubrepodcast.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(true);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
            	
            }
		});
		
		JLabel lblListaFavoritos = new JLabel("3. Lista Favoritos ");
		lblListaFavoritos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblListaFavoritos.setBounds(82, 334, 219, 25);
		panelPrincipal.add(lblListaFavoritos);
		lblListaFavoritos.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(true);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
            	
            }
		});
		
		
		JLabel lblSalir = new JLabel("4. Salir ");
		lblSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSalir.setBounds(82, 405, 219, 25);
		panelPrincipal.add(lblSalir);
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
				paneles.get(7).setVisible(false);
				paneles.get(8).setVisible(false);
				paneles.get(9).setVisible(false);
            }
		});
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("5. Perfil");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(82, 474, 219, 25);
		panelPrincipal.add(lblNewLabel_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1.addMouseListener(new MouseAdapter() {
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
            }
		});
		
		JLabel lblNewLabel_2 = new JLabel("Propagandaaaa ponerrr!!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(491, 204, 376, 210);
		panelPrincipal.add(lblNewLabel_2);

	}

	

	public JPanel getPanelPrincipal() {
		// TODO Auto-generated method stub
		return panelPrincipal;
	}

}

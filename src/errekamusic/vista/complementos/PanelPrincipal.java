package errekamusic.vista.complementos;

import javax.swing.JPanel;

import errakamusic.vistas.Errekamusic_Login;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal() {
		setLayout(null);
		
		JLabel lblMenuPrincipal = new JLabel(" MENU PRINCIPAL ");
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMenuPrincipal.setBounds(325, 31, 266, 106);
		add(lblMenuPrincipal);
		
		JLabel lblDescubregrupos = new JLabel("1. Descubre Grupos");
		lblDescubregrupos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescubregrupos.setBounds(82, 195, 214, 25);
		add(lblDescubregrupos);
		lblDescubregrupos.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
            	PanelGrupos grupos = new PanelGrupos();
				grupos.setVisible(true);
            }
		});
		
		JLabel lblDescubrepodcast = new JLabel("2. Descubre podcast ");
		lblDescubrepodcast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescubrepodcast.setBounds(82, 264, 219, 25);
		add(lblDescubrepodcast);
		lblDescubrepodcast.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
            	PanelPodcast podcast = new PanelPodcast();
				podcast.setVisible(true);
            }
		});
		
		JLabel lblListaFavoritos = new JLabel("3. Lista Favoritos ");
		lblListaFavoritos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblListaFavoritos.setBounds(82, 334, 219, 25);
		add(lblListaFavoritos);
		
		
		JLabel lblSalir = new JLabel("4. Salir ");
		lblSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSalir.setBounds(82, 405, 219, 25);
		add(lblSalir);
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e) {
            	PanelDeBienvenida inicioApp = new PanelDeBienvenida();
				inicioApp.setVisible(true);
            }
		});
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("5. Perfil");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(82, 474, 219, 25);
		add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Propagandaaaa ponerrr!!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(491, 204, 376, 210);
		add(lblNewLabel_2);

	}

}

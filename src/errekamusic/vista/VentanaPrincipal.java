
package errekamusic.vista;


import errekamusic.vista.complementos.PanelAdministrador;
import errekamusic.vista.complementos.PanelDeBienvenida;
import errekamusic.vista.complementos.PanelDeLogin;
import errekamusic.vista.complementos.PanelDeRegistro;
import errekamusic.vista.complementos.PanelFavoritos;
import errekamusic.vista.complementos.PanelGrupos;
import errekamusic.vista.complementos.PanelPerfiles;
import errekamusic.vista.complementos.PanelPodcast;
import errekamusic.vista.complementos.PanelPrincipal;
import errekamusic.vista.complementos.PanelReproduccion;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Aqui iniciamos el programa
 */
public class VentanaPrincipal extends JFrame {
	/**
	 * el JFrame para panel
	 */
	private JFrame frame;
	
	private ArrayList <JPanel> paneles = null;

	/**
	 * El array usaremos para guardar los datos para final
	 */
	//private ArrayList<Entrada> entradas = new ArrayList<Entrada>();

	private static final long serialVersionUID = 1L;

	/**
	 * run
	 * 
	 * @param args main para ejecutar el programa
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new VentanaPrincipal().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * iniciamos a los paneles aqui
	 */
	public VentanaPrincipal() {
		inicializarPaneles();
	}

	private void inicializarPaneles() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		paneles = new ArrayList <JPanel> ();

		// 0
		PanelDeBienvenida panelDeBienvenida = new PanelDeBienvenida(paneles);
		JPanel PanelBienvenida = panelDeBienvenida.inicializarPanelDeBienvenida();
		PanelBienvenida.setVisible(true);
		paneles.add(PanelBienvenida);
		frame.getContentPane().add(PanelBienvenida);

//		// 1
		PanelDeLogin panelDeLogin = new PanelDeLogin(paneles);
		JPanel thePanelDeLogin = panelDeLogin.getPanelDeLogin();
		thePanelDeLogin.setVisible(false);
		paneles.add(thePanelDeLogin);
		frame.getContentPane().add(thePanelDeLogin);
//
//		// 2
		PanelDeRegistro panelDeRegistro = new PanelDeRegistro(paneles);
		JPanel thePanelDeRegistro = panelDeRegistro.getPanelDeRegistro();
		thePanelDeRegistro.setVisible(false);
		paneles.add(thePanelDeRegistro);
		frame.getContentPane().add(thePanelDeRegistro);
//
//		// 3
		PanelPrincipal panelPrincipal = new PanelPrincipal(paneles);
		JPanel thePanelPrincipal = panelPrincipal.getPanelPrincipal();
		thePanelPrincipal.setVisible(false);
		paneles.add(thePanelPrincipal);
		frame.getContentPane().add(thePanelPrincipal);
//
//		// 4
		
		PanelGrupos panelGrupos = new PanelGrupos(paneles);
		JPanel thePanelGrupos = panelGrupos.getPanelGrupos();
		thePanelGrupos.setVisible(false);
		paneles.add(thePanelGrupos);
		frame.getContentPane().add(thePanelGrupos);
		
//
//		// 5
		
		PanelPodcast panelPodcast = new PanelPodcast(paneles);
		JPanel thePanelPodcast = panelPodcast.getPanelPodcast();
		thePanelPodcast.setVisible(false);
		paneles.add(thePanelPodcast);
		frame.getContentPane().add(thePanelPodcast);
		
	
//
//		// 6
		PanelReproduccion panelReproduccion = new PanelReproduccion(paneles);
		JPanel thePanelReproduccion = panelReproduccion.getPanelReproduccion();
		thePanelReproduccion.setVisible(false);
		paneles.add(thePanelReproduccion);
		frame.getContentPane().add(thePanelReproduccion);
//
//		// 7
		PanelFavoritos panelFavoritos = new PanelFavoritos(paneles);
		JPanel thepanelFavoritos = panelFavoritos.getPanelFavoritos();
		thepanelFavoritos.setVisible(false);
		paneles.add(thepanelFavoritos);
		frame.getContentPane().add(thepanelFavoritos);
		// 8
		PanelPerfiles panelPerfiles = new PanelPerfiles(paneles);
		JPanel thePanelPerfiles = panelPerfiles.getPanelPerfiles();
		thePanelPerfiles.setVisible(false);
		paneles.add(thePanelPerfiles);
		frame.getContentPane().add(thePanelPerfiles);
		
		// 9
		
		PanelAdministrador panelAdministrador = new PanelAdministrador(paneles);
		JPanel thePanelAdministrador = panelAdministrador.getPanelAdministrador();
		thePanelAdministrador.setVisible(false);
		paneles.add(thePanelAdministrador);
		frame.getContentPane().add(thePanelAdministrador);

	}

}

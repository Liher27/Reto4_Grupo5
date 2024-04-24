
package errekamusic.vista;


import errekamusic.vista.complementos.PanelDeBienvenida;
import errekamusic.vista.complementos.PanelDeLogin;
import errekamusic.vista.complementos.PanelDeRegistro;

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
		PanelDeRegistro panelDeRegistro = new PanelDeRegistro();
		JPanel thePanelDeRegistro = panelDeRegistro.getPanelDeRegistro();
		thePanelDeRegistro.setVisible(false);
		frame.getContentPane().add(thePanelDeRegistro);
//
//		// 3
//	
//
//		// 4
//		
//
//		// 5
//	
//
//		// 6
//
//
//		// 7
//	

	}

}

package errakamusic.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Errekamusic_Bienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_Bienvenida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Errekamusic_Bienvenida frame = new Errekamusic_Bienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void retardo() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Errekamusic_Bienvenida() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1530, 880);
		panel_Bienvenida = new JPanel();
		panel_Bienvenida.addMouseListener(new MouseAdapter() {

			/**
			 * clicking takes you to the registration panel
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				retardo();
				Errekamusic_Login login = new Errekamusic_Login();
				login.setVisible(true);
				panel_Bienvenida.setVisible(false);
			}
		});
		panel_Bienvenida.setBackground(new Color(245, 245, 245));
		panel_Bienvenida.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_Bienvenida);
		panel_Bienvenida.setLayout(null);

		JLabel lbl_TextoBienvenida = new JLabel("¡Bienvenida!");
		lbl_TextoBienvenida.setForeground(new Color(102, 102, 102));
		lbl_TextoBienvenida.setBackground(new Color(204, 204, 204));
		lbl_TextoBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TextoBienvenida.setFont(new Font("Arial Black", Font.PLAIN, 99));
		lbl_TextoBienvenida.setBounds(404, 36, 703, 157);
		panel_Bienvenida.add(lbl_TextoBienvenida);

		JLabel lbl_Decoration = new JLabel("-----------------------------------");

		lbl_Decoration.setForeground(new Color(102, 102, 51));
		lbl_Decoration.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 99));
		lbl_Decoration.setBounds(0, 0, 1514, 38);
		panel_Bienvenida.add(lbl_Decoration);

		JLabel lbl_Decoration_1 = new JLabel("-----------------------------------");

		lbl_Decoration_1.setForeground(new Color(102, 102, 51));
		lbl_Decoration_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 99));
		lbl_Decoration_1.setBounds(0, 172, 1514, 38);
		panel_Bienvenida.add(lbl_Decoration_1);

		JLabel lbl_Logo = new JLabel("");

		//lbl_Logo.setIcon(new ImageIcon(Errekamusic_Bienvenida.class.getResource("~/Contents/ClaveSol.jpg")));
		lbl_Logo.setBounds(10, 278, 500, 500);
		panel_Bienvenida.add(lbl_Logo);

		JLabel lbl_TextoBienvenida_1 = new JLabel("¡Bienvenida!");

		lbl_TextoBienvenida_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TextoBienvenida_1.setForeground(new Color(0, 0, 0));
		lbl_TextoBienvenida_1.setFont(new Font("Arial Black", Font.PLAIN, 99));
		lbl_TextoBienvenida_1.setBackground(new Color(204, 204, 204));
		lbl_TextoBienvenida_1.setBounds(392, 36, 703, 157);
		panel_Bienvenida.add(lbl_TextoBienvenida_1);

		JLabel lbl_CineDescription = new JLabel("");

		// lbl_CineDescription.setIcon(new
		// ImageIcon(CineElorrieta_Bienvenida.class.getResource("/images/Decoration_Description.png")));
		lbl_CineDescription.setBounds(564, 615, 878, 229);
		panel_Bienvenida.add(lbl_CineDescription);

		JLabel lbl_CineDescription2 = new JLabel("");

		// lbl_CineDescription2.setIcon(new
		// ImageIcon(CineElorrieta_Bienvenida.class.getResource("/images/Decoration_Description.png")));
		lbl_CineDescription2.setBounds(564, 238, 878, 189);
		panel_Bienvenida.add(lbl_CineDescription2);

		JLabel lbl_TextoDescription = new JLabel("Bienvenidos a Errekamusic");

		lbl_TextoDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TextoDescription.setFont(new Font("Sitka Text", Font.PLAIN, 51));
		lbl_TextoDescription.setBounds(626, 390, 759, 83);
		panel_Bienvenida.add(lbl_TextoDescription);

		JLabel lbl_TextoDescription1 = new JLabel("Aqui disfrutareis de nuestra seleccion de música");

		lbl_TextoDescription1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lbl_TextoDescription1.setBounds(739, 472, 577, 83);
		panel_Bienvenida.add(lbl_TextoDescription1);

		JLabel lbl_TextoDescription_2 = new JLabel(" y podcast.");

		lbl_TextoDescription_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lbl_TextoDescription_2.setBounds(737, 555, 368, 49);
		panel_Bienvenida.add(lbl_TextoDescription_2);
	}
}

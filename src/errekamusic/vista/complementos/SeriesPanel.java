package errekamusic.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SeriesPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel seriesPanel = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblSeriesTitle = null;
	private JLabel lblProfilePicture = null;

	private JButton seriesPanelBackBtn = null;
	private JButton collectionInfoBtn = null;

	/**
	 * Create the panel.
	 */
	public SeriesPanel(ArrayList<JPanel> paneles) {

		seriesPanel = new JPanel();
		seriesPanel.setBounds(0, 0, 984, 611);
		seriesPanel.setBackground(new Color(0, 0, 0));
		seriesPanel.setLayout(null);

		lblProfilePicture = new JLabel("");
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(854, 31, 80, 80);
		lblProfilePicture.setIcon(new ImageIcon("contents/profilePicture.png"));
		seriesPanel.add(lblProfilePicture);
		lblProfilePicture.addMouseListener(new MouseAdapter() {
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
				paneles.get(10).setVisible(false);
				paneles.get(11).setVisible(false);
				paneles.get(12).setVisible(false);
				paneles.get(13).setVisible(false);
			}
		});

		seriesPanelBackBtn = new JButton("Volver");
		seriesPanelBackBtn.setBounds(844, 556, 98, 33);
		seriesPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		seriesPanel.add(seriesPanelBackBtn);
		seriesPanelBackBtn.addActionListener(new ActionListener() {
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
		seriesPanel.add(lblLogoErrekamusic);

		lblSeriesTitle = new JLabel("Descubre series");
		lblSeriesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeriesTitle.setForeground(new Color(255, 222, 89));
		lblSeriesTitle.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 28));
		lblSeriesTitle.setBounds(328, 32, 349, 64);
		seriesPanel.add(lblSeriesTitle);

		collectionInfoBtn = new JButton("Mas informacion");
		collectionInfoBtn.setBounds(440, 561, 186, 28);
		seriesPanel.add(collectionInfoBtn);
		collectionInfoBtn.addActionListener(new ActionListener() {
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
				paneles.get(5).setVisible(true);
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
	}

	public JPanel getSeriesPanel() {
		// TODO Auto-generated method stub
		return seriesPanel;
	}

}

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

public class ProfilePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel profilePanel = null;

	private JLabel lblLogoErrekamusic = null;
	private JLabel lblProfileTitle = null;

	private JButton groupPanelNextBtn = null;
	private JButton groupPanelBackBtn = null;

	/**
	 * Create the panel.
	 */
	public ProfilePanel(ArrayList<JPanel> paneles) {

		profilePanel = new JPanel();
		profilePanel.setBounds(0, 0, 984, 611);
		profilePanel.setBackground(new Color(0, 0, 0));
		profilePanel.setLayout(null);

		
		lblProfileTitle = new JLabel("Cambiar perfil");
		lblProfileTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileTitle.setForeground(new Color(200, 40, 255));
		lblProfileTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblProfileTitle.setBounds(328, 32, 349, 64);
		profilePanel.add(lblProfileTitle);
		
		groupPanelNextBtn = new JButton("Aceptar");
		groupPanelNextBtn.setBounds(844, 556, 98, 33);
		groupPanelNextBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		profilePanel.add(groupPanelNextBtn);
		groupPanelNextBtn.addActionListener(new ActionListener() {
			
			
			/**
			 * Confirmamos para logearnos
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				
				SaveNewProfileData();

				/*
				 * popUp datos cambiados if true, else nada
				 */
				
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

		groupPanelBackBtn = new JButton("Volver");
		groupPanelBackBtn.setBounds(844, 556, 98, 33);
		groupPanelBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		profilePanel.add(groupPanelBackBtn);
		groupPanelBackBtn.addActionListener(new ActionListener() {
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
		profilePanel.add(lblLogoErrekamusic);
	}

	public JPanel getPanelPerfiles() {
		// TODO Auto-generated method stub
		return profilePanel;
	}
	
	private boolean SaveNewProfileData() {
		boolean ret = false;
		
		/*
		 * if datosCambiados, ret = true
		 * else false
		 */
		
		return ret;
		
	}

}

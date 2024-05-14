package errekamusic.vista.complementos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import errekamusic.logica.Sesion;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class GroupInfoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nameFiled = null;
	private JTextField genreFiled = null;
	private JTextField descFiled = null;
	private JTextField typeFiled = null;
	private JTextField dateFiled = null;
	private JTextField idFiled = null;
	private JLabel nameLabel = null;
	private JLabel creatorLabel = null;
	private JLabel genreLabel = null;
	private JLabel descLabel = null;
	private JLabel lblTipoColeccion = null;
	private JLabel imageLabel = null;
	private JLabel dateLabel = null;
	private JButton backButton = null;
	private JButton addButton = null;


	public GroupInfoPanel() {
		setBounds(0, 0, 984, 611);
		setBackground(new Color(255,69,90));
		setLayout(null);

		nameLabel = new JLabel("Nombre Coleccion");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setBounds(537, 23, 92, 30);
		add(nameLabel);

		nameFiled = new JTextField();
		nameFiled.setBounds(651, 28, 182, 20);
		add(nameFiled);
		nameFiled.setColumns(10);

		genreLabel = new JLabel("Genero Coleccion");
		genreLabel.setForeground(new Color(255, 255, 255));
		genreLabel.setBounds(537, 77, 92, 30);
		add(genreLabel);

		genreFiled = new JTextField();
		genreFiled.setColumns(10);
		genreFiled.setBounds(651, 82, 182, 20);
		add(genreFiled);

		descLabel = new JLabel("Descripcion Coleccion");
		descLabel.setForeground(new Color(255, 255, 255));
		descLabel.setBounds(537, 118, 130, 30);
		add(descLabel);

		descFiled = new JTextField();
		descFiled.setColumns(10);
		descFiled.setBounds(651, 126, 182, 41);
		add(descFiled);

		lblTipoColeccion = new JLabel("Tipo Coleccion");
		lblTipoColeccion.setForeground(new Color(255, 255, 255));
		lblTipoColeccion.setBounds(537, 182, 92, 30);
		add(lblTipoColeccion);

		typeFiled = new JTextField();
		typeFiled.setColumns(10);
		typeFiled.setBounds(651, 187, 182, 20);
		add(typeFiled);

		creatorLabel = new JLabel("Id Ceador");
		creatorLabel.setForeground(new Color(255, 255, 255));
		creatorLabel.setBounds(537, 234, 92, 30);
		add(creatorLabel);

		idFiled = new JTextField();
		idFiled.setColumns(10);
		idFiled.setBounds(651, 239, 182, 20);
		add(idFiled);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(651, 317, 160, 22);
		add(comboBox);
		
		
		dateLabel = new JLabel("Fecha Coleccion");
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setBounds(537, 278, 92, 30);
		add(dateLabel);
		
		dateFiled = new JTextField();
		dateFiled.setColumns(10);
		dateFiled.setBounds(651, 283, 182, 20);
		add(dateFiled);

		imageLabel = new JLabel("Imagen coleccion");
		imageLabel.setForeground(new Color(255, 255, 255));
		imageLabel.setBounds(537, 313, 92, 30);
		add(imageLabel);
		

		addButton = new JButton("Agregar");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		addButton.setBounds(463, 365, 89, 23);
		add(addButton);
		
		backButton = new JButton("Volver");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sesion.getInstance().getWelcomePanel().getWelcomePanel().setVisible(false);
				Sesion.getInstance().getLoginPanel().getLoginPanel().setVisible(false);
				Sesion.getInstance().getRegisterPanel().getRegisterPanel().setVisible(false);
				Sesion.getInstance().getMainMenuPanel().getMainMenuPanel().setVisible(false);
				Sesion.getInstance().getGroupPanel().getGroupPanel().setVisible(false);
				Sesion.getInstance().getPodcastPanel().getPodcastPanel().setVisible(false);
				Sesion.getInstance().getContentPlayerPanel().getContentPlayerPanel().setVisible(false);
				Sesion.getInstance().getListsPanel().getListsPanel().setVisible(false);
				Sesion.getInstance().getProfilePanel().getProfilePanel().setVisible(false);
				Sesion.getInstance().getAdminPanel().getAdminPanel().setVisible(true);
				Sesion.getInstance().getDiscsPanel().getDiscsPanel().setVisible(false);
				Sesion.getInstance().getPodcasterPanel().getPodcasterPanel().setVisible(false);
				Sesion.getInstance().getSeriesPanel().getSeriesPanel().setVisible(false);
				Sesion.getInstance().getSongsPanel().getSongsPanel().setVisible(false);
			}
		});
		backButton.setBounds(718, 365, 89, 23);
		add(backButton);
	}
	public JPanel getGroupInfoPanel() {
		return this;
	}
}
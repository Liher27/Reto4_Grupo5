package errekamusic.vista.complementos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.logica.ArtistController;
import errekamusic.logica.Sesion;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class GroupInfoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nameFiled = null;;
	private JTextField descFiled = null;
	private JTextField dateFiled = null;
	private JLabel nameLabel = null;
	private JLabel descLabel = null;
	private JLabel lblTipoColeccion = null;
	private JLabel imageLabel = null;
	private JLabel dateLabel = null;
	private JButton backButton = null;
	private JButton addButton = null;
	private JLabel artistImageLabel = null;
	private String directory = "./contents/GroupImage/";
	private JComboBox<String> comboBox = null;
	private JComboBox<String> typeArtist = null;
	private List<String> listPath = new ArrayList<String>() ;
	private JButton searchButton = null;
	private ImageIcon artistImage = null;
	
	public GroupInfoPanel() {
		setBounds(0, 0, 984, 611);
		setBackground(new Color(255,69,90));
		setLayout(null);
		getAllImagePath();

		nameLabel = new JLabel("Nombre Artista");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setBounds(537, 23, 92, 30);
		add(nameLabel);

		nameFiled = new JTextField();
		nameFiled.setBounds(651, 28, 182, 20);
		add(nameFiled);
		nameFiled.setColumns(10);

		dateLabel = new JLabel("Fecha Registro");
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setBounds(537, 77, 92, 30);
		add(dateLabel);

		dateFiled = new JTextField();
		dateFiled.setColumns(10);
		dateFiled.setBounds(651, 82, 182, 20);
		add(dateFiled);

		descLabel = new JLabel("Descripcion Artista");
		descLabel.setForeground(new Color(255, 255, 255));
		descLabel.setBounds(537, 118, 130, 30);
		add(descLabel);

		descFiled = new JTextField();
		descFiled.setColumns(10);
		descFiled.setBounds(651, 126, 182, 41);
		add(descFiled);

		lblTipoColeccion = new JLabel("Tipo Artista");
		lblTipoColeccion.setForeground(new Color(255, 255, 255));
		lblTipoColeccion.setBounds(537, 182, 92, 30);
		add(lblTipoColeccion);

		comboBox = new JComboBox<String>(new Vector<String>(listPath));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				artistImageLabel.setIcon(new ImageIcon(directory + comboBox.getSelectedItem().toString()));
			}
		});
		comboBox.setBounds(651, 243, 160, 22);
		add(comboBox);
	


		imageLabel = new JLabel("Imagen coleccion");
		imageLabel.setForeground(new Color(255, 255, 255));
		imageLabel.setBounds(537, 239, 92, 30);
		add(imageLabel);
		

		addButton = new JButton("Agregar");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artist artist = new Artist();
				artist.setArtistName(nameFiled.getText());
				try {
					artist.setArtistRegDate(Converter.convertFromUtilDateToSqlDate(
								Converter.convertStringToUtilDate(dateFiled.getText())));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				artist.setArtistDesc(descFiled.getText());
				artist.setArtistType(typeArtist.getSelectedItem().toString());
				String imgpath = directory +comboBox.getSelectedItem().toString();
				artist.setPath(imgpath);
				ArtistController artistController = new ArtistController();
				try {
					artistController.insertArtist(artist);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		addButton.setBounds(722, 295, 89, 23);
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
		
		artistImageLabel = new JLabel("Image Artista");
		artistImageLabel.setBounds(125, 28, 349, 269);
		add(artistImageLabel);
		
		typeArtist = new JComboBox<String>();
		typeArtist.setModel(new DefaultComboBoxModel<String>(new String[] { "Group", "Podcast" }));
		typeArtist.setBounds(651, 186, 160, 22);
		add(typeArtist);
		
		searchButton = new JButton("Buscar");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchName = nameFiled.getText();
				ArtistController artistController = new ArtistController();
				try {
					artistController.findArtist(searchName);
				} catch (Exception e1) {
					e1.printStackTrace();
				}			
				Artist artist = new Artist();
				System.out.println(artist.toString());
				dateFiled.setText(Converter.convertDateToString(artist.getArtistRegDate()));
				descFiled.setText(artist.getArtistDesc());
				comboBox.setSelectedItem(artist.getArtistType());
				artistImage = artist.getArtistImage();
				artistImageLabel.setIcon(artistImage);
			
			}
		});
		searchButton.setBounds(537, 295, 89, 23);
		add(searchButton);
	}
	public void getAllImagePath() {
		File file = new File(directory);
		File[] array = file.listFiles();
		 if (!file.exists()) {
	            System.out.println(file + " not exists");
	            return;
	        }
		for(int i = 0; i < array.length;i++) {
			File fs = array[i];
			 if (fs.isDirectory()) {
	            } else {
	            	listPath.add(fs.getName());
	            }
		}
	}
	
	public JPanel getGroupInfoPanel() {
		return this;
	}
}
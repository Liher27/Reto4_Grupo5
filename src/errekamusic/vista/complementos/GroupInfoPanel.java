package errekamusic.vista.complementos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private List<String> listPath = new ArrayList<String>();
	private JButton searchButton = null;
	private ImageIcon artistImage = null;
	private JButton updateInfo = null;
	private JTextField idFiled;
	private JLabel idArtista = null;

	public GroupInfoPanel() {
		setBounds(0, 0, 984, 611);
		setBackground(new Color(255, 69, 90));
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
					artist.setArtistRegDate(Converter
							.convertFromUtilDateToSqlDate(Converter.convertStringToUtilDate(dateFiled.getText())));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
				}
				artist.setArtistDesc(descFiled.getText());
				artist.setArtistType(typeArtist.getSelectedItem().toString());
				String imgpath = directory + comboBox.getSelectedItem().toString();
				artist.setPath(imgpath);
				ArtistController artistController = new ArtistController();
				try {
					artistController.insertArtist(artist);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Error al encontrar un archivo", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Error en la base de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				cleanFileContent();
			}
		});
		addButton.setBounds(722, 295, 89, 23);
		add(addButton);

		backButton = new JButton("Volver");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				addButton.setVisible(false);
				searchButton.setVisible(false);
				updateInfo.setVisible(false);
				
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
				cleanFileContent();
			}
		});
		backButton.setBounds(718, 365, 89, 23);
		add(backButton);

		artistImageLabel = new JLabel("Image Artista");
		artistImageLabel.setBounds(125, 28, 349, 269);
		add(artistImageLabel);

		idFiled = new JTextField();
		idFiled.setBounds(441, 296, 86, 20);
		add(idFiled);
		idFiled.setColumns(10);

		idArtista = new JLabel("ID Artista");
		idArtista.setForeground(Color.WHITE);
		idArtista.setBounds(357, 291, 92, 30);
		add(idArtista);

		typeArtist = new JComboBox<String>();
		typeArtist.setModel(new DefaultComboBoxModel<String>(new String[] { "Group", "Podcast" }));
		typeArtist.setBounds(651, 186, 160, 22);
		add(typeArtist);

		searchButton = new JButton("Buscar");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int searchid = Integer.valueOf(idFiled.getText());
				ArtistController artistController = new ArtistController();
				Artist artist = new Artist();
				try {
					artist = artistController.findArtist(searchid);
					nameFiled.setText(artist.getArtistName());
					dateFiled.setText(Converter.convertDateToString(artist.getArtistRegDate()));
					descFiled.setText(artist.getArtistDesc());
					comboBox.setSelectedItem(artist.getArtistType());
					artistImage = artist.getArtistImage();
					artistImageLabel.setIcon(artistImage);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		searchButton.setBounds(537, 295, 89, 23);
		add(searchButton);

		updateInfo = new JButton("Update");
		updateInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int artistId = Integer.valueOf(idFiled.getText());
				Artist artist = new Artist();
				artist.setArtistName(nameFiled.getText());
				artist.setArtistDesc(descFiled.getText());
				artist.setArtistType(typeArtist.getSelectedItem().toString());
				try {
					artist.setArtistRegDate(Converter
							.convertFromUtilDateToSqlDate(Converter.convertStringToUtilDate(dateFiled.getText())));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error en el programa", "Error", JOptionPane.ERROR_MESSAGE);
				}
				ArtistController artistController = new ArtistController();
				try {
					artistController.updateArtist(artist, artistId);
				} catch (ClassNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "Error al encontrar un archivo", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Error en la base de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				cleanFileContent();
			}
		});
		updateInfo.setBounds(537, 365, 89, 23);
		add(updateInfo);

	}

	public void getAllImagePath() {
		File file = new File(directory);
		File[] array = file.listFiles();
		if (!file.exists()) {
			System.out.println(file + " not exists");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			File fs = array[i];
			if (fs.isDirectory()) {
			} else {
				listPath.add(fs.getName());
			}
		}
	}

	public void setInvisibleForModify() {
		addButton.setVisible(false);
		idFiled.setVisible(true);
		idArtista.setVisible(true);
	}

	public void setInvisibleForCreate() {
		idArtista.setVisible(false);
		addButton.setVisible(true);
		idFiled.setVisible(false);
	}

	private void cleanFileContent() {

		nameFiled.setText("");
		idFiled.setText("");
		descFiled.setText("");
		dateFiled.setText("");
	}

	public JPanel getGroupInfoPanel() {
		return this;
	}
	
	public JButton getAddButton() {
		return addButton;
	}

	public JButton getSearchButton() {
		return searchButton;
	}

	public JButton getUpdateInfo() {
		return updateInfo;
	}

}
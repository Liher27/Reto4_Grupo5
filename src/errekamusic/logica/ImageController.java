package errekamusic.logica;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import errekamusic.bbdd.Utils.DBUtils;

public class ImageController {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private ImageIcon artistImageIcon = null;
	private Random randomNumberToExecute = null;
	int randomArtistID = 0;

	public ImageIcon getDiscImageById() {

		randomNumberToExecute = new Random();
		randomArtistID = (randomNumberToExecute.nextInt(2) + 1);

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "SELECT COLLECTIONIMAGE FROM COLLECTION WHERE COLLECTIONID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, randomArtistID);
			result = pstmt.executeQuery();

			if (result.next()) {
				Blob blob = result.getBlob("COLLECTIONIMAGE");

				byte[] imageBytes = blob.getBytes(1, (int) blob.length());

				Image image = ImageIO.read(new ByteArrayInputStream(imageBytes));

				Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

				ImageIcon icon = new ImageIcon(scaledImage);

				artistImageIcon = icon;

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return artistImageIcon;

	}

}

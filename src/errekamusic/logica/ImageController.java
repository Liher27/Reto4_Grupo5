package errekamusic.logica;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public ImageIcon getDiscImageById(int randomArtistID) {

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "SELECT * FROM collection WHERE CollectionID=? AND CollectionType LIKE 'DISC'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, randomArtistID);
			result = pstmt.executeQuery();

			if (result.next()) {
				Blob blob = result.getBlob("COLLECTIONIMAGE");

				byte[] imageBytes = blob.getBytes(1, (int) blob.length());

				Image image = ImageIO.read(new ByteArrayInputStream(imageBytes));

				ImageIcon icon = new ImageIcon(image);

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

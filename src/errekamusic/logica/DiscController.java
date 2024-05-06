package errekamusic.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Utils.DBUtils;
import errekamusic.utils.Converter;

public class DiscController implements CollectionInterface {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private List<Disc> discInfo = null;
	private Disc disc = null;
	private Artist artist = null;

	@Override
	public List<Disc> GetCollectionByType() {
		discInfo = new ArrayList<Disc>();
		return discInfo;
	}

	@Override
	public List<Disc> GetCollectionByArtist(int creatorID) {
		discInfo = new ArrayList<Disc>();
		return discInfo;
	}

	public List<Disc> GetDiscForPropaganda(int randomArtistID) throws Exception {
		discInfo = new ArrayList<Disc>();
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "select collectionName, collectionGenre, CollectionDate, CollectionImage, g.ArtistName from collection join artist g on collection.creatorId = g.artistId where collectionType = 'disc' and collectionID = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, randomArtistID);
			result = pstmt.executeQuery();

			while (result.next()) {
				artist = new Artist();
				disc = new Disc();

				disc.setCollectionName(result.getString("CollectionName"));
				disc.setCollectionGenre(result.getString("CollectionGenre"));
				disc.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
				disc.setCollectionImage(Converter.getImageFromBlob(result.getBlob("CollectionImage")));
				artist.setArtistName(result.getString("ArtistName"));
				disc.setArtist(artist);
				discInfo.add(disc);

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sql -> " + e.getMessage());
		}

		return discInfo;

	}

}

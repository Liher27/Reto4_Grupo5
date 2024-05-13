package errekamusic.bbdd.manager;

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
import errekamusic.bbdd.Utils.Converter;

public class DiscManager implements CollectionInterface <Disc>, DataBaseInterface <Disc> {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private List<Disc> discInfo = null;
	private Disc disc = null;
	private Artist artist = null;
	
	@Override
	public List<Disc> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean insertInto(Disc disc) {
		return false;
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Disc> GetCollectionByType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Disc> GetCollectionByArtist(int creatorID) {
		discInfo = new ArrayList<Disc>();

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "select collectionName, collectionGenre, CollectionDate, CollectionImage, g.ArtistName from collection join artist g on collection.creatorId = g.artistId where collectionType = 'disc' and creatorId = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, creatorID);
			result = pstmt.executeQuery();

			while (result.next()) {
				artist = new Artist();
				disc = new Disc();

				disc.setCollectionName(result.getString("CollectionName"));
				disc.setCollectionGenre(result.getString("CollectionGenre"));
				disc.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
				//disc.setCollectionImage(Converter.getImageFromBlob(result.getBlob("CollectionImage")));
				artist.setArtistName(result.getString("ArtistName"));
				disc.setArtist(artist);
				discInfo.add(disc);

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sql -> " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error genérico -> " + e.getMessage());

		}

		return discInfo;
	}

	public List<Disc> GetDiscForPropaganda(int randomArtistID) throws Exception {

		return null;
	}
	public Disc getOne(Disc disc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Disc> getDiscForPropaganda(int randomArtistID) throws Exception {
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
	public List<Disc> getDiscBySongId(int contentId) throws Exception {
		discInfo = new ArrayList<Disc>();
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "select collectionName, collectionGenre, CollectionDate, CollectionImage, g.ArtistName from collection join artist g on collection.creatorId = g.artistId "
					+ "join content on collection.CollectionID = content.CollectionID where collectionType = 'disc' and contentID = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, contentId);
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

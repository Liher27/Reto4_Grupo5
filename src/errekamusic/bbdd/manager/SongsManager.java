package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class SongsManager implements DatabaseInterface<Canciones, Integer> {

	public List<Canciones> getAllData() throws Exception {
		List<Canciones> songs = new ArrayList<Canciones>();
		try {
			Class.forName(DBUtils.DRIVER);
			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			Statement statement = connection.createStatement();
			String sql = "select contentName,collectionName,ArtistName,ContentPath,CollectionImage,ContentDuration from content join collection on content.collectionID = collection.collectionid join artist on collection.creatorId = artist.ArtistID;";
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Canciones song = new Canciones();
				song.setContentName(result.getString("ContentName"));
				song.setContentDuration(result.getTime("ContentDuration"));
				song.setContentPath(result.getString("ContentPath"));
				Artist artist = new Artist();
				artist.setArtistName(result.getString("ArtistName"));
				Disc disc = new Disc();
				disc.setCollectionName(result.getString("CollectionName"));
				disc.setCollectionImage(Converter.getImageFromBlob(result.getBlob("CollectionImage")));
				disc.setArtist(artist);
				song.setDisc(disc);
				songs.add(song);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return songs;

	}

	public Canciones getOne(Canciones song) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canciones selectById(Integer z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canciones> selectAll() {
		List<Canciones> songs = new ArrayList<Canciones>();
		try {
			Class.forName(DBUtils.DRIVER);
			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM content";
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Canciones song = new Canciones();
				song.setContentName(result.getString("ContentName"));
				song.setContentDuration(result.getTime("ContentDuration"));
				song.setContentPath(result.getString("ContentPath"));
				songs.add(song);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return songs;
	}

	@Override
	public boolean insert(Canciones t) {
		boolean ret = false;
		return ret;
	}

	@Override
	public boolean update(Canciones t) {
		boolean ret = false;
		return ret;
	}

	@Override
	public boolean delete(Integer t) {
		boolean ret = false;
		return ret;
	}

	public List<Canciones> getSongsByDisc(int discId) throws ClassNotFoundException, SQLException {
		List<Canciones> songs = new ArrayList<Canciones>();
		Class.forName(DBUtils.DRIVER);
		Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM content where collectionID =";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, discId);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Canciones song = new Canciones();
			song.setContentName(result.getString("ContentName"));
			song.setContentDuration(result.getTime("ContentDuration"));
			song.setContentPath(result.getString("ContentPath"));
			songs.add(song);
		}

		return songs;
	}

}

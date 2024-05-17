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
import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class SongsManager implements DatabaseInterface<Song, Integer> {

	public List<Song> getAllData() throws Exception {
		List<Song> songs = new ArrayList<Song>();
		try {
			Class.forName(DBUtils.DRIVER);
			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			Statement statement = connection.createStatement();
			String sql = "select contentID, contentName,collectionName,ArtistName,ContentPath,CollectionImage,ContentDuration from content join collection on content.collectionID = collection.collectionid join artist on collection.creatorId = artist.ArtistID";
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Song song = new Song();
				song.setContentID(result.getInt("contentID"));
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

	@Override
	public Song selectById(Integer songID) throws Exception {
		Song song = new Song();
		try {
			Class.forName(DBUtils.DRIVER);
			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "select contentName,collectionName,ArtistName,ContentPath,CollectionImage,ContentDuration from content join collection on content.collectionID = collection.collectionid join artist on collection.creatorId = artist.ArtistID where contentID = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, songID);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
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
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return song;
	}

	@Override
	public List<Song> selectAll() {
		List<Song> songs = new ArrayList<Song>();
		try {
			Class.forName(DBUtils.DRIVER);
			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM content";
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Song song = new Song();
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
	public boolean insert(Song t) {
		boolean ret = false;
		return ret;
	}

	@Override
	public boolean delete(Integer t) {
		boolean ret = false;
		return ret;
	}

	public List<Song> getSongsByDisc(int discId) throws ClassNotFoundException, SQLException {
		List<Song> songs = new ArrayList<Song>();
		Class.forName(DBUtils.DRIVER);
		Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM content where collectionID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, discId);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Song song = new Song();
			song.setContentID(result.getInt("ContentId"));
			song.setContentName(result.getString("ContentName"));
			song.setContentDuration(result.getTime("ContentDuration"));
			song.setContentPath(result.getString("ContentPath"));
			songs.add(song);
		}
		return songs;
	}

	public List<Song> getSongBySongID(int id) throws Exception {

		List<Song> songs = new ArrayList<Song>();
		Class.forName(DBUtils.DRIVER);
		Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT  ContentName,CollectionName,ArtistName,"
				+ "ContentDuration,ContentPath FROM content join Collection on\r\n"
				+ "content.CollectionID = collection.CollectionID join Artist on artist.ArtistID = collection.CreatorID where ContentID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Song song = new Song();
			song.setContentName(result.getString("ContentName"));
			song.setContentDuration(result.getTime("ContentDuration"));
			song.setContentPath(result.getString("ContentPath"));
			Artist artist = new Artist();
			Disc disc = new Disc();
			disc.setCollectionName(result.getString("CollectionName"));
			artist.setArtistName(result.getString("ArtistName"));
			disc.setArtist(artist);
			song.setDisc(disc);
			songs.add(song);
		}
		return songs;
	}

	@Override
	public boolean update(Song t, Integer z) throws ClassNotFoundException, SQLException {

		return false;
	}

}
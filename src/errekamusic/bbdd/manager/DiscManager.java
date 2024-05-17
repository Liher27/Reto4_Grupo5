package errekamusic.bbdd.manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Utils.DBUtils;
import errekamusic.bbdd.Utils.Converter;

public class DiscManager extends AbstractManager implements DatabaseInterface<Disc, Integer> {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private List<Disc> discInfo = null;
	private Disc disc = null;
	private Artist artist = null;

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

	@Override
	public Disc selectById(Integer discID) {
		Disc discInfo = new Disc();

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "select collectionID, CollectionName, CollectionGenre, CollectionDate, CollectionImage from collection where creatorId = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, discID);
			result = pstmt.executeQuery();

			while (result.next()) {
				discInfo.setCollectionID(result.getInt("collectionID"));
				discInfo.setCollectionName(result.getString("CollectionName"));
				discInfo.setCollectionGenre(result.getString("CollectionGenre"));
				discInfo.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
				discInfo.setCollectionImage(Converter.getImageFromBlob(result.getBlob("CollectionImage")));
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

	@Override
	public List<Disc> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Disc disc) throws IOException, SQLException {
		boolean ret = false;

		String name = disc.getCollectionName();
		String desc = disc.getCollectionDesc();
		String type = disc.getCollectionType();
		String genre = disc.getCollectionGenre();
		int repro = 0;
		String img = Converter.pathToBlob(artist.getPath());
		Date date = artist.getArtistRegDate();
		java.sql.Date regdate = Converter.convertFromUtilDateToSqlDate(date);
		int id = disc.getArtist().getArtistID();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "INSERT INTO ARTIST(CollectionName,CollectionGenre,CollectionReproNum,CollectionDesc,CollectionImage,CollectionType,CreatorID,collectionDate)"
					+ "VALUE(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, genre);
			pstmt.setInt(3, repro);
			pstmt.setString(4, desc);
			pstmt.setString(5, img);
			pstmt.setString(6, type);
			pstmt.setInt(7, id);
			pstmt.setDate(8, regdate);
			if (pstmt.executeUpdate() > 0) {
				ret = true;
			}
		} finally {
			release(conn, pstmt, rs);
		}
		return ret;
	}



	@Override
	public boolean delete(Integer id) throws SQLException {
		boolean ret = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "delete from collection where CollectionID = '"+ id+"'";

			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate(sql);
		
			
		} finally {
			release(conn, pstmt, rs);
		}
		return ret;
	}

	public List<Disc> getByCreator(int creatorId) throws ClassNotFoundException, SQLException {
		List<Disc> listDisc = new ArrayList<Disc>();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "select collectionID, collectionName, collectionGenre, CollectionDate, CollectionImage from collection where creatorId = ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, creatorId);
		result = pstmt.executeQuery();

		while (result.next()) {
			Disc disc = new Disc();
			disc.setCollectionID(result.getInt("collectionID"));
			disc.setCollectionName(result.getString("CollectionName"));
			disc.setCollectionGenre(result.getString("CollectionGenre"));
			disc.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
			listDisc.add(disc);
		}

		return listDisc;
	}
	
	public List<Disc> top10Artist() throws Exception {
		List<Disc> listDisc = new ArrayList<>();

		Class.forName(DBUtils.DRIVER);

		Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

		Statement statement = connection.createStatement();
		String sql = "SELECT CollectionName,CollectionReproNum,CollectionType FROM collection where CollectionType = 'DISC' order by CollectionReproNum desc limit 10 ;";
		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			Disc disc = new Disc();
			disc.setCollectionName(result.getString("CollectionName"));
			disc.setCollectionRepNum(result.getInt("CollectionReproNum"));
			disc.setCollectionType(result.getString("CollectionType"));
			listDisc.add(disc);
		}
		return listDisc;

	}

	@Override
	public boolean update(Disc disc, Integer id) throws ClassNotFoundException, SQLException {
		boolean ret = false;
		
		String name = disc.getCollectionName();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "UPDATE Collection SET CollectionName = ?,CollectionGenre = ?, CollectionDesc = ? , CollectionType =? ,collectionDate =? WHERE ARTISTID =?";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			if (pstmt.executeUpdate() > 0) {
				ret = true;
			}
		} finally {
			release(conn, pstmt, rs);
		}
		return ret;
	}
	public void updateTestado(String name,int id) throws SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "UPDATE Collection SET CollectionName = ? WHERE CollectionID = '"+ id+"'";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate(sql);
		
			
		} finally {
			release(conn, pstmt, rs);
		}
		

	}

}
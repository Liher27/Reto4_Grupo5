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
import errekamusic.bbdd.Pojo.Group;
import errekamusic.bbdd.Pojo.Podcaster;
import errekamusic.bbdd.Utils.*;

public class ArtistManager extends AbstractManager implements DatabaseInterface<Artist, Integer> {

	@Override
	public boolean insert(Artist artist) throws IOException, SQLException {
		boolean ret = false;

		String name = artist.getArtistName();
		String desc = artist.getArtistDesc();
		String type = artist.getArtistType();
		int repro = 0;
		String img = Converter.pathToBlob(artist.getPath());
		Date date = artist.getArtistRegDate();
		java.sql.Date regdate = Converter.convertFromUtilDateToSqlDate(date);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "INSERT INTO ARTIST(ArtistName,ArtistRegDate,ArtistDesc,ArtistRepNum,ArtistType,CreatorIconImage)"
					+ "VALUE(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setDate(2, regdate);
			pstmt.setString(3, desc);
			pstmt.setInt(4, repro);
			pstmt.setString(5, type);
			pstmt.setString(6, img);
			if (pstmt.executeUpdate() > 0) {
				ret = true;
			}
		} finally {
			release(conn, pstmt, rs);
		}
		return ret;
	}

	@Override
	public boolean delete(Integer z) {
		boolean ret = false;
		return ret;
	}

	@Override
	public Artist selectById(Integer artistID) throws Exception {
		Artist artist = new Artist();

		Class.forName(DBUtils.DRIVER);

		Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM ARTIST WHERE ArtistID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, artistID);
		ResultSet result = pstmt.executeQuery();

		if (result.next()) {

			artist.setArtistID(result.getInt("ArtistID"));
			artist.setArtistName(result.getString("ArtistName"));
			artist.setArtistRegDate(result.getDate("ArtistRegDate"));
			artist.setArtistDesc(result.getString("ArtistDesc"));
			artist.setArtistRepNum(result.getInt("ArtistRepNum"));
			artist.setArtistType(result.getString("ArtistType"));
			artist.setArtistImage(Converter.getImageFromBlob(result.getBlob("CreatorIconImage")));
		}
		return artist;
	}

	@Override
	public List<Artist> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Artist> top10Artist() throws Exception {
		List<Artist> listArtist = new ArrayList<>();

		Class.forName(DBUtils.DRIVER);

		Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

		Statement statement = connection.createStatement();
		String sql = "SELECT ArtistName, ArtistType,ArtistRepNum FROM Artist order by ArtistRepNum desc limit 4 ;";
		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			Artist artist = new Artist();
			artist.setArtistName(result.getString("ArtistName"));
			artist.setArtistRepNum(result.getInt("ArtistRepNum"));
			artist.setArtistType(result.getString("ArtistType"));
			listArtist.add(artist);
		}
		return listArtist;

	}

	public List<Artist> getArtistsByType(String artistType) throws SQLException, ClassNotFoundException {
		List<Artist> ArtistInfo = new ArrayList<Artist>();

		Class.forName(DBUtils.DRIVER);

		Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM ARTIST WHERE ArtistType = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, artistType);
		ResultSet result = pstmt.executeQuery();

		while (result.next()) {
			if (result.getString("ArtistType").equals("Podcaster")) {
				Podcaster podcaster = new Podcaster();
				podcaster.setArtistID(result.getInt("ArtistID"));
				podcaster.setArtistName(result.getString("ArtistName"));
				podcaster.setArtistRegDate(result.getDate("ArtistRegDate"));
				podcaster.setArtistDesc(result.getString("ArtistDesc"));
				podcaster.setArtistRepNum(result.getInt("ArtistRepNum"));
				ArtistInfo.add(podcaster);
			} else if (result.getString("ArtistType").equals("Group")) {
				Group group = new Group();
				group.setArtistID(result.getInt("ArtistID"));
				group.setArtistName(result.getString("ArtistName"));
				group.setArtistRegDate(result.getDate("ArtistRegDate"));
				group.setArtistDesc(result.getString("ArtistDesc"));
				group.setArtistRepNum(result.getInt("ArtistRepNum"));
				ArtistInfo.add(group);
			}
		}
		return ArtistInfo;
	}

	public Artist findByName(int id) throws Exception {
		Artist artist = new Artist();
		Class.forName(DBUtils.DRIVER);

		Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

		Statement statement = conn.createStatement();
		String sql = "select * from Artist where ArtistID ='" + id + "'";
		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			artist.setArtistID(result.getInt("ArtistID"));
			artist.setArtistName(result.getString("ArtistName"));
			artist.setArtistRegDate(result.getDate("ArtistRegDate"));
			artist.setArtistDesc(result.getString("ArtistDesc"));
			artist.setArtistRepNum(result.getInt("ArtistRepNum"));
			artist.setArtistType(result.getString("ArtistType"));
		}

		return artist;

	}

	@Override
	public boolean update(Artist artist, Integer id) throws ClassNotFoundException, SQLException {
		boolean ret = false;

		String name = artist.getArtistName();
		String desc = artist.getArtistDesc();
		String type = artist.getArtistType();
		Date date = artist.getArtistRegDate();
		java.sql.Date regdate = Converter.convertFromUtilDateToSqlDate(date);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "UPDATE ARTIST SET ARTISTNAME = ?,ArtistRegDate = ?, ArtistDesc = ? , ArtistType =? WHERE ARTISTID =?";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setDate(2, regdate);
			pstmt.setString(3, desc);
			pstmt.setString(4, type);
			pstmt.setInt(5, id);
			if (pstmt.executeUpdate() > 0) {
				ret = true;
			}
		} finally {
			release(conn, pstmt, rs);
		}
		return ret;
	}

}

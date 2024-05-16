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
import errekamusic.bbdd.Utils.*;

public class ArtistManager extends AbstractManager implements DatabaseInterface <Artist, String> {



	@Override
	public boolean insert(Artist t) {
		boolean ret = false;
		return ret;
	}

	@Override
	public boolean update(Artist t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean delete(String z) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public Artist selectById(String name) {
		Artist artist = new Artist();
		try {
			Class.forName(DBUtils.DRIVER);

			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			Statement statement = conn.createStatement();
			String sql = "select ArtistRegDate, ArtistDesc, ArtistType, CreatorIconImage from Artist where ArtistName ='"+ name +"'";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				artist.setArtistRegDate(rs.getDate("ArtistRegDate"));
				artist.setArtistDesc(rs.getString("ArtistDesc"));
				artist.setArtistType(rs.getString("ArtistType"));
				artist.setArtistImage(Converter.getImageFromBlob(rs.getBlob("CreatorIconImage")));
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return artist;
		
	}

	@Override
	public List<Artist> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean insertNewArtist(Artist artist, String path) throws IOException {
		boolean ret = false;
		
		String name = artist.getArtistName();
		String desc = artist.getArtistDesc();
		String type = artist.getArtistType();
		int repro = 0;
		String img = Converter.pathToBlob(path);
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
			pstmt.setString(5,type);
			pstmt.setString(6, img);
			if (pstmt.executeUpdate() > 0) {
				ret = true;
			} 
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally {
			release(conn, pstmt, rs);
		}
		return ret;
		
	} 
	
	public List<Artist>top10Artist (){
		List<Artist> listArtist = new ArrayList<>();
		
		try {
			Class.forName(DBUtils.DRIVER);

			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			Statement statement = connection.createStatement();
			String sql = "SELECT ArtistName, ArtistRepNum FROM Artist order by ArtistRepNum desc limit 4 ;";
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				Artist artist = new Artist();
				artist.setArtistName(result.getString("ArtistName"));
				artist.setArtistRepNum(result.getInt("ArtistRepNum"));
				listArtist.add(artist);
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listArtist;
		
	}

	
	
}

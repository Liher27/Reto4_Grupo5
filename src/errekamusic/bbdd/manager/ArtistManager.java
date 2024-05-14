package errekamusic.bbdd.manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.*;

public class ArtistManager extends AbstractManager implements DatabaseInterface <Artist, String> {


	@Override
	public void insert(Artist t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Artist t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Artist t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artist selectById(String z) {
		// TODO Auto-generated method stub
		return null;
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
		String type = artist.isArtistType();
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

	
	
}

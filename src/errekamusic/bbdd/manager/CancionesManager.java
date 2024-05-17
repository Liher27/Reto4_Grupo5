package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.Utils.DBUtils;

public class CancionesManager extends AbstractManager implements DatabaseInterface<Song, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private Connection conn = null;
	
	public List<Song> getCancionesByDiscId(int discId) throws ClassNotFoundException, SQLException {
		List<Song> lCanciones = new ArrayList<Song>();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM Content WHERE CollectionID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, discId);
		result = pstmt.executeQuery();
		
		while (result.next()) {
			Song cancion = new Song();
			cancion.setContentID(result.getInt("ContentID"));
			cancion.setContentName(result.getString("ContentName"));
			cancion.setContentDuration(result.getTime("ContentDuration"));
			cancion.setContentType(result.getString("ContentType"));
			cancion.setContentReproNum(result.getInt("ContentRepNum"));
			lCanciones.add(cancion);
		}

		return lCanciones;
	}
	
	@Override
	public Song selectById(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Song> selectAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean insert(Song t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Song t, Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}

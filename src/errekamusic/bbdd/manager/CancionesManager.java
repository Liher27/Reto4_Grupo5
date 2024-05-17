package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Utils.DBUtils;

public class CancionesManager extends AbstractManager implements DatabaseInterface<Canciones, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private Connection conn = null;
	
	public List<Canciones> getCancionesByDiscId(int discId) throws ClassNotFoundException, SQLException {
		List<Canciones> lCanciones = new ArrayList<Canciones>();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM Content WHERE CollectionID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, discId);
		result = pstmt.executeQuery();
		
		while (result.next()) {
			Canciones cancion = new Canciones();
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
	public Canciones selectById(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Canciones> selectAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean insert(Canciones t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Canciones t, Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}

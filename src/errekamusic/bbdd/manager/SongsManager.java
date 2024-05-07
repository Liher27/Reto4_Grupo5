package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Utils.DBUtils;

public class SongsManager implements ContentsInterface <Canciones>, DataBaseInterface <Canciones> {

	@Override
	public List<Canciones> getByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeByID(int ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean changeByID(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Canciones> getAll() {
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
	public void insertInto(Canciones song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Canciones getOne(Canciones song) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

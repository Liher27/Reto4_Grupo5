package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.Utils.DBUtils;

public class MusicManager {
		
	
	
	public List<Song>top10Songs (){
		List<Song> listSongs = new ArrayList<>();
		
		try {
			Class.forName(DBUtils.DRIVER);

			Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			Statement statement = connection.createStatement();
			String sql = "SELECT ContentName,ContentReproNum  FROM Content ORDER BY ContentReproNum DESC LIMIT 4;";
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				Song canciones = new Song();
				canciones.setContentName(result.getString("ContentName"));
				canciones.setContentReproNum(result.getInt("ContentReproNum"));
				listSongs.add(canciones);
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listSongs;
		
	}
}

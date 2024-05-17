package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Coleccion;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.bbdd.Pojo.Serie;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class PodcastManager extends AbstractManager implements DatabaseInterface<Podcast, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private Connection conn = null;
	
	public List<Podcast> getPodcastBySerieId(int serieId) throws ClassNotFoundException, SQLException {
		List<Podcast> podcasts = new ArrayList<Podcast>();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM Content WHERE CollectionID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, serieId);
		result = pstmt.executeQuery();
		
		while (result.next()) {
			Podcast podcast = new Podcast();
			podcast.setContentID(result.getInt("ContentID"));
			podcast.setContentName(result.getString("ContentName"));
			podcast.setContentDuration(result.getTime("ContentDuration"));
			podcast.setContentType(result.getString("ContentType"));
			podcast.setContentReproNum(result.getInt("ContentReproNum"));
			podcasts.add(podcast);
		}

		return podcasts;
	}
	
	@Override
	public Podcast selectById(Integer podcastID) throws ClassNotFoundException, SQLException {
		Podcast podcastInfo = new Podcast();

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "SELECT * FROM reto4_grupo5.content join collection on content.CollectionID = collection.CollectionID where collection.CollectionID = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, podcastID);
			result = pstmt.executeQuery();

			while (result.next()) {
				Serie serie = new Serie();
				serie.setCollectionImage(Converter.getImageFromBlob(result.getBlob("CollectionImage")));
				podcastInfo.setSeries(serie);
				podcastInfo.setContentName(result.getString("ContentName"));
				podcastInfo.setContentID(result.getInt("ContentID"));
				podcastInfo.setContentDuration(result.getTime("ContentDuration"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sql -> " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error genérico -> " + e.getMessage());
		}

		return podcastInfo;
	}
	@Override
	public List<Podcast> selectAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean insert(Podcast t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Podcast t, Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}

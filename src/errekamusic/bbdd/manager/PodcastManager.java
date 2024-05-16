package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.bbdd.Utils.DBUtils;

public class PodcastManager extends AbstractManager implements DatabaseInterface<Podcast, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private Connection conn = null;
	
	public List<Podcast> getPodcastBySerieId(int serieId) throws ClassNotFoundException, SQLException {
		List<Podcast> lPodcast = new ArrayList<Podcast>();

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
			podcast.setContentReproNum(result.getInt("ContentRepNum"));
			lPodcast.add(podcast);
		}

		return lPodcast;
	}
	
	@Override
	public Podcast selectById(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
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
	public boolean update(Podcast t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}

package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Contenido;
import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.Utils.DBUtils;

public class PlayListManager extends AbstractManager implements DatabaseInterface<PlayList, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;
	private Connection conn = null;

	@Override
	public PlayList selectById(Integer ID) throws ClassNotFoundException, SQLException {
		PlayList ret = null;
		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		sql = "SELECT content.ContentName, content.ContentReproNum, content.ContentDuration FROM content "
				+ "join playlistcontent on content.ContentID = playlistcontent.ContentID"
				+ " join playlist on playlistcontent.playListID = playlist.PlayListID where playlist.PlayListID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ID);
		result = pstmt.executeQuery();

		if (result.next()) {
			Contenido content = new Contenido();
			content.setContentName(result.getString("ContentName"));
			content.setContentDuration(result.getTime("ContentDuration"));
			content.setContentReproNum(result.getInt("ContentReproNum"));
			
		}
		return ret;
	}

	@Override
	public List<PlayList> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(PlayList t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(PlayList t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(PlayList t) {
		// TODO Auto-generated method stub

	}

	public List<PlayList> getUsersAllLists(String username) throws ClassNotFoundException, SQLException {
		List<PlayList> ret = new ArrayList<PlayList>();
		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		sql = "select playListTitle, playListID from playlist where LoginUserPlayList = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, username);
		result = pstmt.executeQuery();

		while (result.next()) {
			PlayList playList = new PlayList();
			playList.setPlayListID(result.getInt("playListID"));
			playList.setPlayListTitle(result.getString("playListID"));
			ret.add(playList);
		}

		return ret;
	}

}

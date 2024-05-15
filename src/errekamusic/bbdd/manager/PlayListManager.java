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
		sql = "SELECT playlist.playListTitle, content.ContentName, content.ContentReproNum, content.ContentDuration FROM content "
				+ "join playlistcontent on content.ContentID = playlistcontent.ContentID"
				+ " join playlist on playlistcontent.playListID = playlist.PlayListID where playlist.PlayListID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ID);
		result = pstmt.executeQuery();

		if (result.next()) {
			Contenido content = new Contenido();
			ret = new PlayList();
			content.setContentName(result.getString("ContentName"));
			content.setContentDuration(result.getTime("ContentDuration"));
			content.setContentReproNum(result.getInt("ContentReproNum"));
			ret.setContenido(content);

		}
		return ret;
	}

	@Override
	public List<PlayList> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(PlayList newPlayList) throws ClassNotFoundException, SQLException {
		boolean ret = false;

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		sql = "INSERT INTO `reto4_grupo5`.`playlist` (`PlayListTitle`, `LoginUserPlayList`) VALUES (?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, newPlayList.getPlayListTitle());
		pstmt.setString(2, newPlayList.getUsers().getLoginUser());
		int i = pstmt.executeUpdate();
		if (i > 0) {
			ret = true;
		}
		return ret;
	}

	@Override
	public boolean update(PlayList t) {
		boolean ret = false;
		return ret;

	}

	@Override
	public boolean delete(Integer playlistId) throws ClassNotFoundException, SQLException {
		boolean ret = false;

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		sql = "Delete FROM reto4_grupo5.playlist where PlayListID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, playlistId);
		int i = pstmt.executeUpdate();
		if (i > 0) {
			ret = true;
		}
		return ret;
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
			playList.setPlayListTitle(result.getString("playListTitle"));
			ret.add(playList);
		}

		return ret;
	}

	public List<PlayList> getPlayListInfoByID(Integer ID) throws ClassNotFoundException, SQLException {
		List<PlayList> ret = new ArrayList<PlayList>();
		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		sql = "SELECT playlist.playListTitle, content.ContentName, content.ContentReproNum, content.ContentDuration FROM content "
				+ "join playlistcontent on content.ContentID = playlistcontent.ContentID"
				+ " join playlist on playlistcontent.playListID = playlist.PlayListID where playlist.PlayListID = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ID);
		result = pstmt.executeQuery();

		while (result.next()) {
			Contenido content = new Contenido();
			PlayList playList = new PlayList();
			content.setContentName(result.getString("ContentName"));
			content.setContentDuration(result.getTime("ContentDuration"));
			content.setContentReproNum(result.getInt("ContentReproNum"));
			playList.setContenido(content);
			ret.add(playList);

		}
		return ret;
	}

}

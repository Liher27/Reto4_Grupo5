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

public class PlayListManager extends AbstractManager implements DatabaseInterface<PlayList, String> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;
	private Connection conn = null;

	@Override
	public PlayList selectById(String z) {
		// TODO Auto-generated method stub
		return null;
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
		sql = "select playlist.PlayListTitle, content.contentName, content.contentDuration, content.contentReproNum from playlist "
				+ "join playlistcontent on playlist.PlayListID = playlistcontent.PlaylistID "
				+ "join content on playlistcontent.ContentID = content.ContentID where playlist.LoginUserPlayList = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, username);
		result = pstmt.executeQuery();

		while (result.next()) {
			PlayList playListInfo = new PlayList();
			Contenido contenido = new Contenido();
			playListInfo.setPlayListTitle(((result.getString("PlayListTitle"))));
			contenido.setContentName(result.getString("contentName"));
			contenido.setContentDuration(result.getTime("contentDuration"));
			contenido.setContentReproNum(result.getInt("contentReproNum"));
			playListInfo.setContenido(contenido);
			ret.add(playListInfo);
		}

		return ret;
	}

}

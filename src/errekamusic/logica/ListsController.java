package errekamusic.logica;

import java.sql.SQLException;
import java.util.List;

import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.manager.PlayListManager;

public class ListsController {

	public List<PlayList> getUserListsNames(String loginUser) throws ClassNotFoundException, SQLException {
		List<PlayList> ret = new PlayListManager().getUsersAllLists(loginUser);
		return ret;
	}

	public PlayList getPlayListInfo(int PlayListId) throws ClassNotFoundException, SQLException {
		PlayList ret = new PlayListManager().selectById(PlayListId);
		return ret;
	}

	// Codigo para administrar la informacion de las playlists

}
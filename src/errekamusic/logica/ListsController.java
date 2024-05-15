package errekamusic.logica;

import java.sql.SQLException;
import java.util.List;

import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.manager.PlayListManager;

public class ListsController {

	public List<PlayList> getUserListsNames(String loginUser) throws ClassNotFoundException, SQLException {
		return new PlayListManager().getUsersAllLists(loginUser);
	}
	public List<PlayList> getPlayListInfo(int PlayListId) throws ClassNotFoundException, SQLException {
		return new PlayListManager().getPlayListInfoByID(PlayListId);
	}
	public boolean createPlayList(PlayList newPlayList) throws ClassNotFoundException, SQLException {
		return new PlayListManager().insert(newPlayList);
	}
	public boolean deletePlayList(int playlistId) throws ClassNotFoundException, SQLException {
		return new PlayListManager().delete(playlistId);
	}
}
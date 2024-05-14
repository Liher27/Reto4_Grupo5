package errekamusic.logica;

import java.sql.SQLException;
import java.util.List;

import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.manager.PlayListManager;

public class ListsController {

	public List<PlayList> getUserLists(String loginUser) throws ClassNotFoundException, SQLException {
		List<PlayList> ret = new PlayListManager().getUsersAllLists(loginUser);
		return ret;
	}

	// Codigo para administrar la informacion de las playlists

}
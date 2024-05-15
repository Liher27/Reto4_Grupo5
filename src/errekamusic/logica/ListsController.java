package errekamusic.logica;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.manager.PlayListManager;

public class ListsController {

	public List<PlayList> getUserListsNames(String loginUser) throws ClassNotFoundException, SQLException {
		return new PlayListManager().getUsersAllListsNames(loginUser);
	}

	public List<PlayList> getPlayListInfo(int PlayListId) throws ClassNotFoundException, SQLException {
		return new PlayListManager().getPlayListInfoByID(PlayListId);
	}

	public List<PlayList> getAllPlayListInfo(String loginUser) throws ClassNotFoundException, SQLException {
		return new PlayListManager().getUsersAllLists(loginUser);
	}

	public boolean createPlayList(PlayList newPlayList) throws ClassNotFoundException, SQLException {
		return new PlayListManager().insert(newPlayList);
	}

	public boolean deletePlayList(int playlistId) throws ClassNotFoundException, SQLException {
		return new PlayListManager().delete(playlistId);
	}

	public void exportAllUserLists(List<PlayList> playListInfo) throws IOException {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		fileOutputStream = new FileOutputStream(Sesion.getPathFichero() + Sesion.getNombreFichero());
		objectOutputStream = new ObjectOutputStream(fileOutputStream);

		for (PlayList playList : playListInfo)
			objectOutputStream.writeObject(playList);

		try {
			objectOutputStream.close();
		} catch (IOException e1) {

		}
		System.out.println("FIN!");

	}

	public List<PlayList> importAllUserPlayLists() throws IOException, ClassNotFoundException {
		List<PlayList> ret = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream(Sesion.getPathFichero() + Sesion.getNombreFichero());
			objectInputStream = new ObjectInputStream(fileInputStream);
			for (;;) {
				ret = (ret == null ? new ArrayList<PlayList>() : ret);
				ret.add((PlayList) objectInputStream.readObject());
			}
		} finally {
			try {
				objectInputStream.close();
			} catch (IOException e1) {
			}
			try {
				fileInputStream.close();
			} catch (IOException e) {
			}
		}
	}

	public void insertImportedPlayLists(List<PlayList> lists) throws ClassNotFoundException, SQLException {
		if (null != lists) {
			for (PlayList playList : lists)
				new PlayListManager().insert(playList);
		} else {
			System.out.println ("No hay libros que insertar");
		}
	}

}
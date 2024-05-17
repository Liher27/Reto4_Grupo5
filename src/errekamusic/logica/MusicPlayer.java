package errekamusic.logica;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.manager.SongsManager;
import javazoom.jl.player.Player;

public class MusicPlayer {
	private boolean paused = false;
	private Player player;

	public List<Song> getSongsList() throws Exception {
		SongsManager songsController = new SongsManager();
		return songsController.getAllData();
	}
	
	public Song getSong(int songID) throws Exception {
		SongsManager songsController = new SongsManager();
		return songsController.selectById(songID);
	}

	public void playMusic(Song canciones) {
		new Thread() {
			@Override
			public void run() {
				try {
					FileInputStream fileInputStream = new FileInputStream(canciones.getContentPath());
					player = new Player(fileInputStream);
					player.play();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}.start();
	}

	public void runMusic(Song canciones) {

	}

	public void resumeMusic(Song canciones) {
		if (paused) {
			paused = false;
			playMusic(canciones);
		}
	}

	public void stopMusic() {
		if (player != null) {
			player.close();
		}
	}

	public void pauseMusic() {
		try {
			if (player != null) {
				paused = true;
				player.close();
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
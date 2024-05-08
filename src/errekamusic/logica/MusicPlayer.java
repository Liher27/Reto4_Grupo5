package errekamusic.logica;



import java.io.FileInputStream;

import java.security.PublicKey;

import java.util.ArrayList;

import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.manager.SongsManager;
import javazoom.jl.player.Player;
public class MusicPlayer {

	private int pausedLocation = 0;

	private boolean paused = false;

	private Player player;

	private List<Canciones> allSongs = null;

	/*

	 * public String musicPath(String ruta) { getSongsList(); for (int i = 0; i <

	 * allSongs.size(); i++) { ruta = allSongs.get(i).getContentPath();

	 * System.out.println(allSongs.get(i).getContentPath()); } return ruta; }

	 */



//	public List<String> musicPaths() {

//	    List<String> paths = new ArrayList<>();

//	    allSongs = getSongsList();

//	    for (int i = 0; i < allSongs.size();i++) {

//	        paths.add(allSongs.get(i).getContentPath());

//	    }

//	    return paths;

//	}

	public List<Canciones> getSongsList() {

		SongsManager songsController = new SongsManager();

		return songsController.getAll();

	}



	public void playMusic(Canciones canciones) {

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

	

	public void resumeMusic(Canciones canciones) {

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

		if(player != null) {

		paused = true;

		player.close();

	}

		

	

	}	

}
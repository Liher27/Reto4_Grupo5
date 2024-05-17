package errekamusic.logica;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Song;
import errekamusic.bbdd.Pojo.Content;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.bbdd.manager.CancionesManager;
import errekamusic.bbdd.manager.DiscManager;
import errekamusic.bbdd.manager.MusicManager;
import errekamusic.bbdd.manager.PodcastManager;
import errekamusic.bbdd.manager.SongsManager;

public class ContentController {

	// Codigo para administrar los manager de Musica y podcasts

	public List<Song> GetSongsByDisc(int discId) throws Exception {
		List<Song> ret = new ArrayList<Song>();
		ret = new CancionesManager().getCancionesByDiscId(discId);
		return ret;
	}
	public List<Song> getSongById(int id ) throws Exception{
		
		return new SongsManager().getSongBySongID(id);
	}
	public List<Song> getTop10Songs() {
		MusicManager musicManager = new MusicManager();
		List<Song> songsList = new ArrayList<>();
		songsList = musicManager.top10Songs();

		return songsList;
	}

	public List<Song> getCancionesByDiscId(int discId) throws ClassNotFoundException, SQLException {
		return new CancionesManager().getCancionesByDiscId(discId);
	}

	public List<Podcast> getPodcastBySerieId(int discId) throws ClassNotFoundException, SQLException{
			return new PodcastManager().getPodcastBySerieId(discId);
	}
	
	public Podcast getPodcastInfo(int podcastID) throws ClassNotFoundException, SQLException {
		return new PodcastManager().selectById(podcastID);
	}

	public List<Song> getSongByDiscId(int collectionID) throws ClassNotFoundException, SQLException {
		return new SongsManager().getSongsByDisc(collectionID);
	}

	public Song getSongInfo(int songID) throws Exception {
		return new SongsManager().selectById(songID);
	}
	
}

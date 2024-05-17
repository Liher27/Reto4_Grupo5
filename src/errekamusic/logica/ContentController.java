package errekamusic.logica;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Pojo.Contenido;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.PlayList;
import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.bbdd.manager.CancionesManager;
import errekamusic.bbdd.manager.DiscManager;
import errekamusic.bbdd.manager.MusicManager;
import errekamusic.bbdd.manager.PodcastManager;

public class ContentController {

	// Codigo para administrar los manager de Musica y podcasts

	public List<Canciones> GetSongsByDisc(int discId) throws Exception {
		List<Canciones> ret = new ArrayList<Canciones>();
		ret = new CancionesManager().getCancionesByDiscId(discId);
		return ret;
	}

	public List<Canciones> getTop10Songs() {
		MusicManager musicManager = new MusicManager();
		List<Canciones> songsList = new ArrayList<>();
		songsList = musicManager.top10Songs();

		return songsList;
	}

	public List<Canciones> getCancionesByDiscId(int discId) throws ClassNotFoundException, SQLException {
		return new CancionesManager().getCancionesByDiscId(discId);
	}

	public List<Podcast> getPodcastBySerieId(int discId) throws ClassNotFoundException, SQLException{
			return new PodcastManager().getPodcastBySerieId(discId);
	}
	
	public Podcast getPodcastInfo(int podcastID) throws ClassNotFoundException, SQLException {
		return new PodcastManager().selectById(podcastID);
	}
	
}

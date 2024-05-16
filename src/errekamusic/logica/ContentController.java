package errekamusic.logica;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Pojo.Contenido;
import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.bbdd.manager.CancionesManager;
import errekamusic.bbdd.manager.MusicManager;
import errekamusic.bbdd.manager.PodcastManager;

public class ContentController {

	// Codigo para administrar los manager de Musica y podcasts

	public List<Contenido> GetContenidoByDisc(int discId) throws Exception {
		// contentsInterface = new SongsManager();
		List<Contenido> ret = new ArrayList<>();

		// ret = contentsInterface.GetContenidoByDisc(discId);

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

}

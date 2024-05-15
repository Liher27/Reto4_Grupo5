package errekamusic.logica;

import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;
import errekamusic.bbdd.Pojo.Contenido;
import errekamusic.bbdd.manager.MusicManager;


public class ContentController {

	//Codigo para administrar los manager de Musica y podcasts

	private List<Contenido> cancionesList = null;

	public List<Contenido> GetContenidoByDisc(int discId) throws Exception {
		//contentsInterface = new SongsManager();
		List<Contenido> ret = new ArrayList<>();

		//ret = contentsInterface.GetContenidoByDisc(discId);

		return ret;
	}
	public List<Canciones>getTop10Songs(){
		MusicManager musicManager = new MusicManager();
		List<Canciones> songsList = new ArrayList<>();
		songsList = musicManager.top10Songs();
		
		return songsList;
		
	}
}

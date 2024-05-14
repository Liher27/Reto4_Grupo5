package errekamusic.logica;

import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.manager.ArtistManager;
import errekamusic.enumerado.ArtistType;

public class ArtistController {

private List<Artist> artistInfo = null;



public void insertArtist (Artist artist,String path) throws IOException {
	ArtistManager artistManager = new ArtistManager();
	artistManager.insertNewArtist(artist, path);
	
}

//
//	public List<Artist> getByArtistType(ArtistType artistType) {
//
//		artistsInterface = new ArtistManager();
//		artistInfo = artistsInterface.getByArtistType(artistType);
//		if (artistInfo.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
//		}
//		return artistInfo;
//
//	}
//	
//	public List<Artist> getById(int id) {
//
//		artistsInterface = new ArtistManager();
//		artistInfo = artistsInterface.getById(id);
//		if (artistInfo.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
//		}
//		return artistInfo;
//	}
//
}

package errekamusic.logica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;

import errekamusic.bbdd.manager.ArtistManager;

public class ArtistController {




public void insertArtist (Artist artist,String path) throws IOException {
	ArtistManager artistManager = new ArtistManager();
	artistManager.insertNewArtist(artist, path);
	
	
}

public void findArtist (String name) {
	ArtistManager artistManager = new ArtistManager();
	artistManager.selectById(name);

}

public List<Artist> top10Artist (){
	
	ArtistManager artistManager = new ArtistManager();
	List<Artist> artistList = new ArrayList<>();
	artistList =artistManager.top10Artist();
	return artistList;
	
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

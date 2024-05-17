package errekamusic.logica;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.manager.ArtistManager;

public class ArtistController {

	public List<Artist> getByArtistType(String artistType) throws ClassNotFoundException, SQLException {
		return new ArtistManager().getArtistsByType(artistType);
	}

	public List<Artist> getPodcasterByArtistType(String artistType) throws ClassNotFoundException, SQLException {
		return new ArtistManager().getArtistsByType(artistType);
	}

	public void insertArtist(Artist artist) throws IOException, SQLException {
		new ArtistManager().insert(artist);
	}

	public Artist findArtist(String name) throws Exception {
		return new ArtistManager().findByName(name);

	}

	public List<Artist> top10Artist() throws Exception {
		List<Artist> artistList = new ArrayList<>();
		artistList = new ArtistManager().top10Artist();
		return artistList;
	}
	

	public Artist getArtistByID(int ArtistID) throws Exception {
		Artist artistInfo = new Artist();
		artistInfo = new ArtistManager().selectById(ArtistID);
		return artistInfo;
	}
}

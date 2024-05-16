package errekamusic.logica;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Group;
import errekamusic.bbdd.Pojo.Podcaster;
import errekamusic.bbdd.manager.ArtistManager;
import errekamusic.bbdd.manager.GroupManager;
import errekamusic.bbdd.manager.PodcasterManager;
import errekamusic.enumerado.ArtistType;

public class ArtistController {

	public List<Group> getGroupByArtistType(ArtistType artistType) throws ClassNotFoundException, SQLException {
		return new GroupManager().getGroupByArtistType(artistType);
	}

	public List<Podcaster> getPodcasterByArtistType(ArtistType artistType) throws ClassNotFoundException, SQLException {
		return new PodcasterManager().getPodcasterByArtistType(artistType);
	}

	public void insertArtist(Artist artist, String path) throws IOException {
		ArtistManager artistManager = new ArtistManager();
		artistManager.insertNewArtist(artist, path);

	}

	public void findArtist(String name) {
		ArtistManager artistManager = new ArtistManager();
		artistManager.selectById(name);

	}

	public List<Artist> top10Artist() {

		ArtistManager artistManager = new ArtistManager();
		List<Artist> artistList = new ArrayList<>();
		artistList = artistManager.top10Artist();
		return artistList;

	}
}

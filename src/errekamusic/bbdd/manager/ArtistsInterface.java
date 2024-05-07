package errekamusic.bbdd.manager;

import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.enumerado.ArtistType;

public interface ArtistsInterface {
	
	public List<Artist> getByArtistType (ArtistType artistType);
		
	public List<Artist> getById(int id);
}

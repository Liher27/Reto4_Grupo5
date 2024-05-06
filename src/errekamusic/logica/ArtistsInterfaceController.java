package errekamusic.logica;

import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.enumerado.ArtistType;

public interface ArtistsInterfaceController {
	
	public List<Artist> getByArtistType (ArtistType artistType);
		
	public List<Artist> getById(int id);
}

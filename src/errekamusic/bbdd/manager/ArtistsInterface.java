package errekamusic.bbdd.manager;

import java.util.List;

import errekamusic.enumerado.ArtistType;

public interface ArtistsInterface<T> {
	
	public List<T> getByArtistType (ArtistType artistType);
		
	public List<T> getById(int id);
}

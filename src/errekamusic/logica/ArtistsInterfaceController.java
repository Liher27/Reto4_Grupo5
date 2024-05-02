package errekamusic.logica;

import java.util.List;

public interface ArtistsInterfaceController<T> {
	
	public List <T> getByArtistType (boolean artistType);
		
	public List <T> getById(int id);
	
}

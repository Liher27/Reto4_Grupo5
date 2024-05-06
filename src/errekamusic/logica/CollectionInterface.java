package errekamusic.logica;

import java.util.List;


public interface CollectionInterface<T>{

	public List <T> GetCollectionByType ();
	
	public List <T> GetCollectionByArtist (int creatorID);
	
}

package errekamusic.logica;

import java.util.List;


public interface CollectionInterface<T>{

	public List<T> GetAllCollection();
	
	public List <T> GetCollectionByType (boolean collectionType);
	
	public List <T> GetCollectionByArtist (int creatorID);
	
}

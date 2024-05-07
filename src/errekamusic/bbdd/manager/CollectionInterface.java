package errekamusic.bbdd.manager;

import java.util.List;

import errekamusic.bbdd.Pojo.Disc;


public interface CollectionInterface <T>{

	public List<T> GetCollectionByType ();
	
	public List<T> GetCollectionByArtist (int creatorID);
	
}

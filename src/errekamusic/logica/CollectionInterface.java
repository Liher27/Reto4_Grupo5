package errekamusic.logica;

import java.util.List;

import errekamusic.bbdd.Pojo.Disc;


public interface CollectionInterface{

	public <T> List<T> GetCollectionByType ();
	
	public <T> List<T> GetCollectionByArtist (int creatorID);
	
}

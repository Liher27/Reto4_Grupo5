package errekamusic.logica;

import java.util.List;

import errekamusic.bbdd.Pojo.Disc;


public interface CollectionInterface{

	public List<Disc> GetCollectionByType ();
	
	public List<Disc> GetCollectionByArtist (int creatorID);
	
}

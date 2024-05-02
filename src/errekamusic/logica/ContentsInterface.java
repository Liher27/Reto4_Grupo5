package errekamusic.logica;

import java.util.List;

public interface ContentsInterface<T> {

	public List<T> GetAllContent();

	public List<T> GetContentByCollectionId(int collectionID);

}

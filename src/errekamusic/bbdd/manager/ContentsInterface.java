package errekamusic.bbdd.manager;

import java.util.List;

public interface ContentsInterface<T> {

	public List<T> getByID(int ID);
	
	public List<T> GetContenidoByDisc(int discId);

	public void removeByID(int ID);

	public boolean changeByID(int ID);

}

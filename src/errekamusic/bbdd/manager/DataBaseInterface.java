package errekamusic.bbdd.manager;

import java.util.List;

public interface DataBaseInterface<T> {
	
	public List <T> getAll();
	
	public boolean insertInto(T t);
	
}

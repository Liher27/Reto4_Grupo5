package errekamusic.bbdd.manager;

import java.util.List;

public interface DataBaseInterface<T> {
	
	public List <T> getAll();
	
	public void insertInto(T t);
	
	public T getOne(T t);
	
}

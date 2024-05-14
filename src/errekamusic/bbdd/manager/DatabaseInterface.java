package errekamusic.bbdd.manager;

import java.util.List;

public interface DatabaseInterface <T, Z> {

	 public T selectById(Z z); 
	 
	 public List <T> selectAll();
	 
	 public void insert(T t);
	 
	 public void update(T t);
	 
	 public void delete(T t);
	 
}

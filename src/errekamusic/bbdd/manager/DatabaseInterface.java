package errekamusic.bbdd.manager;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface <T, Z> {

	 public T selectById(Z z) throws ClassNotFoundException, SQLException; 
	 
	 public List <T> selectAll();
	 
	 public void insert(T t);
	 
	 public void update(T t);
	 
	 public void delete(T t);
	 
}

package errekamusic.bbdd.manager;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface <T, Z> {

	 public T selectById(Z z) throws ClassNotFoundException, SQLException; 
	 
	 public List <T> selectAll()throws ClassNotFoundException, SQLException;
	 
	 public boolean insert(T t) throws ClassNotFoundException, SQLException;
	 
	 public boolean update(T t)throws ClassNotFoundException, SQLException;
	 
	 public boolean delete(Z z)throws ClassNotFoundException, SQLException;
	 
}

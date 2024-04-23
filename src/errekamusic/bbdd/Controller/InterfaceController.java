package errekamusic.bbdd.Controller;

import java.util.List;

public interface InterfaceController<T> {
		
	public List <T> getAll();
	public List <T> getById(int id );
}

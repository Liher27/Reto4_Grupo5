package errekamusic.bbdd.manager;

import java.util.List;

public interface UserInterface <T>{

	public boolean changeByUserName(String userName, T t);
	
	public void removeByUserName(String userName);
	
	public List <T> getByUserName(String userName);

}

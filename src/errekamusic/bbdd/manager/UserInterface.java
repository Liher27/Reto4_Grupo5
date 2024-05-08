package errekamusic.bbdd.manager;

import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Users;

public interface UserInterface <T>{

	public void removeByUserName(String userName);
	
	public Users getByUserName(String userName);
	
	public boolean changeUserPassword (String newPasswordToInsert, String registerUsername);

}

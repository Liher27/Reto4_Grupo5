package errekamusic.logica;

import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.manager.UserManager;

public class UserController {

	UserManager userManager = null;
	
	public boolean confirmLogedUser(String username, String password) {
		userManager = new UserManager();
		List <Users> userInfoToCompare = new ArrayList<Users>();
		Users user = new Users();
		userInfoToCompare = userManager.getByUserName(username);
		if (null!=userInfoToCompare )
		{
			user = userInfoToCompare.get(0);
			if (user.getUserPassword().equals(password));
			return true;
		}
		return false;
	}

	public boolean changeUserPassword(String newPasswordToInsert, String registerUsername) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Users> getLogedUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	//Codigo para administrar los usuarios
	
}

package errekamusic.logica;

import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.manager.UserManager;

public class UserController {

	UserManager userManager = null;

	public boolean confirmLogedUser(String username, String password) {
		userManager = new UserManager();
		Users user = new Users();
		user = userManager.getByUserName(username);
		if (null != user) {
			if (user.getUserPassword().equals(password))
				;
			return true;
		} else
			return false;
	}

	public boolean changeUserPassword(String newPasswordToInsert, String registerUsername) {
		boolean ret = false;
		userManager = new UserManager();
		if (userManager.changeUserPassword(newPasswordToInsert, registerUsername)) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public Users getLogedUser(String username) {
		userManager = new UserManager();
		Users user = new Users();
		user = userManager.getByUserName(username);

		if (null != user) {
			return user;
		} else
			return null;
	}

	public PremiumUser getPremiumUserInfo(String username) {
		userManager = new UserManager();
		PremiumUser user = new PremiumUser();
		user = userManager.getPremiumInfo(username);

		if (null != user) {
			return user;
		} else
			return null;
	}

	public boolean insertNewUser(Users user) {
		boolean ret = false;
		userManager = new UserManager();
		userManager.insertInto(user);

		return ret;
	}

	public boolean insertFreeUserInfo(Users user) {
		boolean ret = false;

		return ret;
	}

	public boolean insertPremiumUserInfo(Users user) {
		boolean ret = false;

		return ret;
	}

	public boolean isAdminUser() {
		boolean ret = false;
		Users admin = new Users();
		admin = userManager.getByUserName(Singleton.getInstance().getUsername());
		if (admin.getIsAdmin().equals("Si")) {
			ret = true;
		} else
			ret = false;

		return ret;
	}

	// Codigo para administrar los usuarios

}

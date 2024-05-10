package errekamusic.logica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.manager.UserManager;

public class UserController {
	
	
	public void insertPremiumData(PremiumUser premiumUser, String loginUser) {
		UserManager userManager = new UserManager();
		userManager.insertPremiumUserData(premiumUser,loginUser );
	}
	
	
	public void registerUser(Users users) throws ParseException {
//		
		UserManager userManager = new UserManager();
		userManager.userRegister(users);
		
		
//		String cpLong = users.getcPUser() + "";
//		if (users.getUserPassword() != pass2) {
//			reged = false;
////		} else if (users == null) {
////			reged = false;
////		} else if (cpLong.length() > 5) {
////			reged = false;
////		}
//		}else {
//		UserManager userManager = new UserManager();
//		userManager.userRegister(users);
//		}
//		return reged;

	}

	public boolean confirmLogedUser(String username, String password) {
		boolean ret = false;
		UserManager userManager = new UserManager();
		Users user = new UserManager().getByUserName(username);

		if (user.getUserPassword().equals(password)
				&& userManager.setLastLoginDate(Converter.getCurrentDate(), username)) {
			ret = true;
		}
		return ret;
	}

	public boolean changeUserPassword(String newPasswordToInsert, String registerUsername) {
		boolean ret = false;
		UserManager userManager = new UserManager();

		if (userManager.changeUserPassword(newPasswordToInsert, registerUsername)) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public Users getLogedUser(String username) {
		UserManager userManager = new UserManager();
		Users user = new Users();
		user = userManager.getByUserName(username);

		if (null != user) {
			return user;
		} else
			return null;
	}

	public PremiumUser getPremiumUserInfo(String username) {
		UserManager userManager = new UserManager();
		PremiumUser user = new PremiumUser();
		user = userManager.getPremiumInfo(username);

		if (null != user) {
			return user;
		} else
			return null;
	}

	public boolean insertNewUser(Users user) {
		boolean ret = false;
		UserManager userManager = new UserManager();
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

	public boolean cplength(int num) {
		String a = "" + num;
		int length = a.length();
		if (length > 5) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isAdminUser(String username) {
		boolean ret = false;
		Users admin = new Users();
		UserManager userManager = new UserManager();
		admin = userManager.getByUserName(username);
		if (admin.getIsAdmin().equals("Yes")) {
			ret = true;
		} else
			ret = false;

		return ret;
	}

}

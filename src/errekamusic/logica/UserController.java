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

	public void registerUser(JTextField userName, JTextField dni, JTextField password, JTextField password2,
			JTextField name, JTextField sur1, JTextField sur2, JTextField dir, JTextField city, JTextField cp,
			JTextField birty, JTextField province, String type) throws ParseException {
		boolean reged = false;
		if (password == password2) {
			UserManager userManager = new UserManager();
			userManager.userRegister(userName, name, sur1, sur2, dni, birty, dir, cp, city, province, password,
					password2, type);
			reged = true;
		} else if (password2 != password) {
			reged = false;
		} else if (cp.getText().toString().length() > 5) {
			reged = false;
		}

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

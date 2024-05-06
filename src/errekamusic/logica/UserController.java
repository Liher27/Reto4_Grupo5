package errekamusic.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import errekamusic.bbdd.Pojo.FreeUser;
import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.DBUtils;
import errekamusic.utils.Converter;

public class UserController {

	private List<Users> userInfo = null;
	private Users user = null;
	private PremiumUser premiumUser = null;
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;

	public List<FreeUser> getAllFrees() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FreeUser> getFreeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PremiumUser> getAllPremiums() {
		return null;
	}

	public List<PremiumUser> insertPremiumUserToDatabase() {
		return null;
	}

	public List<PremiumUser> getPremiumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean confirmLogedUser(JTextField userField, JPasswordField passwdTextField) {
		boolean ret = false;

		String getUsernameInput = userField.getText();
		String getPasswdInput = new String(passwdTextField.getPassword());

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERS WHERE LOGINUSER = ? AND USERPASSWORD = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, getUsernameInput);
			pstmt.setString(2, getPasswdInput);
			result = pstmt.executeQuery();
			if (result.next()) {
				ret = true;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return ret;
	}

	public List<Users> getLogedUser(String username) {
		userInfo = new ArrayList<Users>();
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERS WHERE LOGINUSER = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			result = pstmt.executeQuery();
			
				while (result.next()) {
					user = new Users();
//					premiumUser = new PremiumUser();
					user.setLoginUser(result.getString("LoginUser"));
					user.setNameUser(result.getString("NameUser"));
					user.setSurName1(result.getString("SurnameUser1"));
					user.setSurName1(result.getString("SurnameUser2"));
					user.setDNI(result.getString("SurnameUser2"));
					user.setBirthDateUser(Converter.convertFromSqlDateToUtilDate(result.getDate("BirthDateUser")));
					user.setDirUser(result.getString("DirUser"));
					user.setcPUser(result.getInt("CPUser"));
					user.setUserCity(result.getString("UserCity"));
					user.setUserProvince(result.getString("UserProvince"));
					user.setRegisterDate(Converter.convertFromSqlDateToUtilDate(result.getDate("RegisterDate")));
					user.setAccountType(result.getString("AccountType"));
//					if ((result.getString("AccountType")).equals("Premium")) {
//						premiumUser.setCountNum(result.getInt("CountNum"));
//						premiumUser.setCaducity(result.getInt("Caducity"));
//						premiumUser.setcVV(result.getInt("CVV"));
//						user.setPremiumUser(premiumUser);
//					}
					userInfo.add(user);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return userInfo;
	}

	public boolean changeUserPassword(String newPasswordToInsert, String registerUsername) {
		boolean ret = false;
			
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "UPDATE users SET UserPassword = ? WHERE LoginUser = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPasswordToInsert);
			pstmt.setString(1, registerUsername);
			result = pstmt.executeQuery();
			if (result.next()) {
			
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return ret;
	}

}

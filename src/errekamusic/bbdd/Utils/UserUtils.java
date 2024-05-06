package errekamusic.bbdd.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Users;

public class UserUtils {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;
	private Users user = null;

	public List<Users> getUser(String getUsernameInput, String passwdTextField) {
		ArrayList<Users> ret = new ArrayList<Users>();
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERS WHERE LOGINUSER = ? AND USERPASSWORD = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, getUsernameInput);
			pstmt.setString(2, passwdTextField);
			result = pstmt.executeQuery();
			while (result.next()) {

				user = new Users();
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
				ret.add(user);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return ret;
	}

}

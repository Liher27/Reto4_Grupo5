package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class UserManager implements DataBaseInterface<Users>, UserInterface<Users>{

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;
	private ArrayList<Users> userInfo = null;
	private Users user = null;
	private PremiumUser premiumUser = null;

	

	@Override
	public ArrayList<Users> getAll() {
		ArrayList<Users> ret = new ArrayList<Users>();
		user = new Users();
		premiumUser = new PremiumUser();
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERS";
			pstmt = conn.prepareStatement(sql);
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
				if ((result.getString("AccountType")).equals("Cuenta premium")) {
					premiumUser.setCountNum(result.getInt("CountNumber"));
					premiumUser.setcVV(result.getInt("CVV"));
					premiumUser.setCaducity(result.getString("Caducity"));
					user.setPremiumUser(premiumUser);
				}
				ret.add(user);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return ret;
	}


	@Override
	public ArrayList<Users> getByUserName(String userName) {
		userInfo = new ArrayList<Users>();
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERS WHERE LOGINUSER = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
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
				user.setUserPassword(result.getString("UserPassword"));
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

	@Override
	public void removeByUserName(String userName) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean changeByUserName(String userNam, Users user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void insertInto(Users user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Users getOne(Users user) {
		// TODO Auto-generated method stub
		return null;
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

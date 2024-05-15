package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import errekamusic.bbdd.Pojo.FreeUser;
import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class UserManager extends AbstractManager implements DatabaseInterface<Users, String> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;
	private Users user = null;
	private PremiumUser premiumUser = null;
	private FreeUser freeUser = null;

	public boolean changeUserPassword(String newPasswordToInsert, String registerUsername) {
		boolean ret = false;
		try {
			Class.forName(DBUtils.DRIVER);

			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "UPDATE users SET UserPassword = ? WHERE LoginUser = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPasswordToInsert);
			pstmt.setString(2, registerUsername);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				ret = true;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return ret;
	}

	public FreeUser getFreeInfo(String username) {
		FreeUser ret = new FreeUser();

		try {
			Class.forName(DBUtils.DRIVER);

			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERLIBRE WHERE LOGINUSERFREE = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			result = pstmt.executeQuery();
			while (result.next()) {
				ret.setPlayListNum(result.getInt("PlaylistQuantity"));
				ret.setLastRepDate(result.getDate("LastRepDate"));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return ret;
	}

	public PremiumUser getPremiumInfo(String username) {
		PremiumUser ret = new PremiumUser();

		try {
			Class.forName(DBUtils.DRIVER);

			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERPREMIUM WHERE LOGINUSERPREMIUM = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			result = pstmt.executeQuery();
			while (result.next()) {
				ret.setCountNum(result.getInt("CountNum"));
				ret.setcVV(result.getInt("CVV"));
				ret.setCaducity(result.getString("Caducity"));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return ret;
	}

	public boolean insertPremiumUserData(PremiumUser premiumUser, String loginUser) {

		int cardnumber = premiumUser.getCountNum();
		String cadu = premiumUser.getCaducity();
		int cvvNumber = Integer.valueOf(premiumUser.getcVV());

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "INSERT INTO userpremium(CountNum,Caducity,CVV,LoginUserPremium) VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cardnumber);
			pstmt.setString(2, cadu);
			pstmt.setInt(3, cvvNumber);
			pstmt.setString(4, loginUser);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
			return false;
		} finally {
			release(conn, pstmt, rs);
		}
	}

	public boolean setLastLoginDate(Date date, String username) {
		boolean ret = false;
		try {
			Class.forName(DBUtils.DRIVER);
			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			String sql = "UPDATE users SET LastLogInDate = ? WHERE LoginUser = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, Converter.convertFromUtilDateToSqlDate(date));
			pstmt.setString(2, username);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				ret = true;
				System.out.println(
						"Fecha de último inicio de sesión actualizada correctamente para el usuario: " + username);
			} else {
				System.out.println("La fecha de último inicio de sesión no se actualizó para el usuario: " + username);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error de SQL al actualizar la fecha de último inicio de sesión: " + e.getMessage());
		}
		return ret;
	}

	@Override
	public Users selectById(String username) {
		try {
			Class.forName(DBUtils.DRIVER);

			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			sql = "SELECT * FROM USERS WHERE LOGINUSER = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			result = pstmt.executeQuery();

			if (result.next()) {
				user = new Users();
				premiumUser = new PremiumUser();
				user.setLoginUser(result.getString("LoginUser"));
				user.setNameUser(result.getString("NameUser"));
				user.setSurName1(result.getString("SurnameUser1"));
				user.setUserPassword(result.getString("UserPassword"));
				user.setSurName2(result.getString("SurnameUser2"));
				user.setDNI(result.getString("DNIUser"));
				user.setBirthDateUser(result.getDate("BirthDateUser"));
				user.setDirUser(result.getString("DirUser"));
				user.setcPUser(result.getInt("CPUser"));
				user.setAdmin(result.getString("IsAdmin"));
				user.setUserCity(result.getString("UserCity"));
				user.setUserProvince(result.getString("UserProvince"));
				user.setRegisterDate(Converter.convertFromSqlDateToUtilDate(result.getDate("RegisterDate")));
				user.setAccountType(result.getString("AccountType"));
				if ((result.getString("AccountType")).equals("Cuenta premium")) {
					premiumUser = getPremiumInfo(result.getString("LoginUser"));
					user.setPremiumUser(premiumUser);
				} else if ((result.getString("AccountType")).equals("Cuenta premium")) {
					freeUser = getFreeInfo(result.getString("LoginUser"));
					user.setFreeUser(freeUser);
				}

			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return user;
	}

	@Override
	public List<Users> selectAll() {
		ArrayList<Users> ret = new ArrayList<Users>();
		user = new Users();
		premiumUser = new PremiumUser();
		freeUser = new FreeUser();
		try {
			Class.forName(DBUtils.DRIVER);

			Connection conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
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
				user.setBirthDateUser(result.getDate("BirthDateUser"));
				user.setDirUser(result.getString("DirUser"));
				user.setcPUser(result.getInt("CPUser"));
				user.setUserCity(result.getString("UserCity"));
				user.setUserProvince(result.getString("UserProvince"));
				user.setRegisterDate(Converter.convertFromSqlDateToUtilDate(result.getDate("RegisterDate")));
				user.setAccountType(result.getString("AccountType"));
				if ((result.getString("AccountType")).equals("Cuenta premium")) {
					premiumUser = getPremiumInfo(result.getString("LoginUser"));
					user.setPremiumUser(premiumUser);
				} else if ((result.getString("AccountType")).equals("Cuenta premium")) {
					freeUser = getFreeInfo(result.getString("LoginUser"));
					user.setFreeUser(freeUser);
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
	public boolean insert(Users users) {
		boolean ret = false;

		String countName = users.getLoginUser();
		String dniUser = users.getDNI();
		String pass = users.getUserPassword();
		String nameUser = users.getNameUser();
		String surname1 = users.getSurName1();
		String surname2 = users.getSurName2();
		String direction = users.getDirUser();
		String userCity = users.getUserCity();
		String isAmdin = users.getIsAdmin();
		String userProvince = users.getUserProvince();
		Date current = new Date();
		int userCP = users.getcPUser();
		String type = users.getAccountType();
		java.sql.Date userBirty = Converter.convertFromUtilDateToSqlDate(users.getBirthDateUser());
		java.sql.Date resDate = Converter.convertFromUtilDateToSqlDate(current);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			String sql = "INSERT INTO USERS(LoginUser,Nameuser,SurnameUser1,SurnameUser2,DNIUser,BirthDateUser,DirUser,CPUser,IsAdmin,UserCity,UserProvince,UserPassword,registerDate,accountType) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, countName);
			pstmt.setString(2, nameUser);
			pstmt.setString(3, surname1);
			pstmt.setString(4, surname2);
			pstmt.setString(5, dniUser);
			pstmt.setDate(6, userBirty);
			pstmt.setString(7, direction);
			pstmt.setInt(8, userCP);
			pstmt.setString(9, isAmdin);
			pstmt.setString(10, userCity);
			pstmt.setString(11, userProvince);
			pstmt.setString(12, pass);
			pstmt.setDate(13, resDate);
			pstmt.setString(14, type);
			if (pstmt.executeUpdate() > 0) {
				ret = true;
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			release(conn, pstmt, rs);
		}
		return ret;
	}

	@Override
	public boolean update(Users t) {
		boolean ret = false;
		return ret;
	}

	@Override
	public boolean delete(String z) {
		boolean ret = false;
		return ret;
	}

}

package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import errekamusic.bbdd.Pojo.FreeUser;
import errekamusic.bbdd.Pojo.PremiumUser;
import errekamusic.bbdd.Pojo.Users;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class UserManager implements DataBaseInterface<Users>, UserInterface<Users> {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String sql = null;
	private Users user = null;
	private PremiumUser premiumUser = null;
	private FreeUser freeUser = null;

	@Override
	public ArrayList<Users> getAll() {
		ArrayList<Users> ret = new ArrayList<Users>();
		user = new Users();
		premiumUser = new PremiumUser();
		freeUser = new FreeUser();
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
	public Users getByUserName(String username) {
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
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
	public void removeByUserName(String userName) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean changeUserPassword(String newPasswordToInsert, String registerUsername) {
		boolean ret = false;
		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
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

	@Override
	public boolean insertInto(Users users) {
		boolean ret = false;
//		
//		String username = users.getLoginUser();
//		String name = users.getLoginUser();
//		String surnameUser = autorLibro;
//		String surnameUser2 = editorialLibro;
//		String DNIUser = users.getLoginUser();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String birthDate = users.getBirthDateUser().toString();
//		java.util.Date fechaEnSQLConvertida = dateFormat.parse(birthDate);
//		java.sql.Date sqlDate = new java.sql.Date(fechaEnSQLConvertida.getTime());
//		String DirUser = autorLibro;
//		String CPUser = editorialLibro;
//		String IsAdmin = users.getLoginUser();
//		String UserCity = users.getLoginUser();
//		String UserProvince = autorLibro;
//		String userPassword = editorialLibro;
//		String registerDate = users.getRegisterDate().toString();
//		java.util.Date fechaEnSQLConvertida = dateFormat.parse(birthDate);
//		java.sql.Date sqlDate = new java.sql.Date(fechaEnSQLConvertida.getTime());
//		String userPassword = editorialLibro;
//
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
//			String sql = "INSERT INTO Users (`LoginUser`, `TITULO`, `AUTOR`, `EDITORIAL`, `FECHAPUBLICACION`)"
//					+ " VALUES (?,?,?,?,?);";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, getInputIdLibro);
//			pstmt.setString(2, getInputTitulo);
//			pstmt.setString(3, getInputAutor);
//			pstmt.setString(4, getInputEditorial);
//			pstmt.setDate(5, sqlDate);
//
//			int i = pstmt.executeUpdate();
//			if (i > 0) {
//				return true;
//			}
//
//		} catch (ClassNotFoundException e) {
//			System.out.println("Ha dado fallo -> " + e.getMessage());
//		} catch (SQLException e) {
//			System.out.println("Malformacion sqlazo -> " + e.getMessage());
//		}
//		
		return ret;
	}
	
	
	public FreeUser getFreeInfo(String username) {
		FreeUser ret = new FreeUser();

		try {
			Class.forName(DBUtils.DRIVER);

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
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

			conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
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

}

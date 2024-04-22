package errekamusic.bbdd.Pojo;

import java.util.Date;
import java.util.Objects;

public class Users {
	private String loginUser = null;
	private String nameUser = null;
	private String surName1 = null;
	private String surName2 = null;
	private String dNI = null;
	private Date birthDateUser = null;
	private String dirUser = null;
	private boolean isAdmin = false;
	private int cPUser = 0;
	private String userCity = null;
	private String userProvince = null;
	private boolean accountType = false;
	private Date registerDate = null;
	private String userPassword = null;
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getSurName1() {
		return surName1;
	}
	public void setSurName1(String surName1) {
		this.surName1 = surName1;
	}
	public String getSurName2() {
		return surName2;
	}
	public void setSurName2(String surName2) {
		this.surName2 = surName2;
	}
	public String getdNI() {
		return dNI;
	}
	public void setdNI(String dNI) {
		this.dNI = dNI;
	}
	public Date getBirthDateUser() {
		return birthDateUser;
	}
	public void setBirthDateUser(Date birthDateUser) {
		this.birthDateUser = birthDateUser;
	}
	public String getDirUser() {
		return dirUser;
	}
	public void setDirUser(String dirUser) {
		this.dirUser = dirUser;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getcPUser() {
		return cPUser;
	}
	public void setcPUser(int cPUser) {
		this.cPUser = cPUser;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserProvince() {
		return userProvince;
	}
	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}
	public boolean isAccountType() {
		return accountType;
	}
	public void setAccountType(boolean accountType) {
		this.accountType = accountType;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountType, birthDateUser, cPUser, dNI, dirUser, isAdmin, loginUser, nameUser,
				registerDate, surName1, surName2, userCity, userPassword, userProvince);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return accountType == other.accountType && Objects.equals(birthDateUser, other.birthDateUser)
				&& cPUser == other.cPUser && Objects.equals(dNI, other.dNI) && Objects.equals(dirUser, other.dirUser)
				&& isAdmin == other.isAdmin && Objects.equals(loginUser, other.loginUser)
				&& Objects.equals(nameUser, other.nameUser) && Objects.equals(registerDate, other.registerDate)
				&& Objects.equals(surName1, other.surName1) && Objects.equals(surName2, other.surName2)
				&& Objects.equals(userCity, other.userCity) && Objects.equals(userPassword, other.userPassword)
				&& Objects.equals(userProvince, other.userProvince);
	}
	@Override
	public String toString() {
		return "Users [loginUser=" + loginUser + ", nameUser=" + nameUser + ", surName1=" + surName1 + ", surName2="
				+ surName2 + ", dNI=" + dNI + ", birthDateUser=" + birthDateUser + ", dirUser=" + dirUser + ", isAdmin="
				+ isAdmin + ", cPUser=" + cPUser + ", userCity=" + userCity + ", userProvince=" + userProvince
				+ ", accountType=" + accountType + ", registerDate=" + registerDate + ", userPassword=" + userPassword
				+ "]";
	}
	
	
}

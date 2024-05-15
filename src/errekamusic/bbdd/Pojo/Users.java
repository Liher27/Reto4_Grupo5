package errekamusic.bbdd.Pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Users implements Serializable{
	private static final long serialVersionUID = 7749054044661142211L;
	private String loginUser = null;
	private String nameUser = null;
	private String surName1 = null;
	private String surName2 = null;
	private String DNI = null;
	private Date birthDateUser = null;
	private String dirUser = null;
	private String isAdmin = null;
	private int cPUser = 0;
	private String userCity = null;
	private String userProvince = null;
	private String accountType = null;
	private Date registerDate = null;
	private String userPassword = null;
	private PremiumUser premiumUser = null;
	private FreeUser freeUser = null;

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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setAdmin(String isAdmin) {
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
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

	public PremiumUser getPremiumUser() {
		return premiumUser;
	}

	public void setPremiumUser(PremiumUser premiumUser) {
		this.premiumUser = premiumUser;
	}

	public FreeUser getFreeUser() {
		return freeUser;
	}

	public void setFreeUser(FreeUser freeUser) {
		this.freeUser = freeUser;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, accountType, birthDateUser, cPUser, dirUser, freeUser, isAdmin, loginUser, nameUser,
				premiumUser, registerDate, surName1, surName2, userCity, userPassword, userProvince);
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
		return Objects.equals(DNI, other.DNI) && Objects.equals(accountType, other.accountType)
				&& Objects.equals(birthDateUser, other.birthDateUser) && cPUser == other.cPUser
				&& Objects.equals(dirUser, other.dirUser) && Objects.equals(freeUser, other.freeUser)
				&& isAdmin == other.isAdmin && Objects.equals(loginUser, other.loginUser)
				&& Objects.equals(nameUser, other.nameUser) && Objects.equals(premiumUser, other.premiumUser)
				&& Objects.equals(registerDate, other.registerDate) && Objects.equals(surName1, other.surName1)
				&& Objects.equals(surName2, other.surName2) && Objects.equals(userCity, other.userCity)
				&& Objects.equals(userPassword, other.userPassword) && Objects.equals(userProvince, other.userProvince);
	}

	@Override
	public String toString() {
		return "Users [loginUser=" + loginUser + ", nameUser=" + nameUser + ", surName1=" + surName1 + ", surName2="
				+ surName2 + ", DNI=" + DNI + ", birthDateUser=" + birthDateUser + ", dirUser=" + dirUser + ", isAdmin="
				+ isAdmin + ", cPUser=" + cPUser + ", userCity=" + userCity + ", userProvince=" + userProvince
				+ ", accountType=" + accountType + ", registerDate=" + registerDate + ", userPassword=" + userPassword
				+ ", premiumUser=" + premiumUser + ", freeUser=" + freeUser + "]";
	}

}

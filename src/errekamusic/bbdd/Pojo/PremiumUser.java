package errekamusic.bbdd.Pojo;

import java.util.Objects;

public class PremiumUser extends Users{
	
	private int countNum = 0;
	private String caducity = null;
	private int cVV = 0;
	public int getCountNum() {
		return countNum;
	}
	public void setCountNum(int countNum) {
		this.countNum = countNum;
	}
	public String getCaducity() {
		return caducity;
	}
	public void setCaducity(String caducity) {
		this.caducity = caducity;
	}
	public int getcVV() {
		return cVV;
	}
	public void setcVV(int cVV) {
		this.cVV = cVV;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cVV, caducity, countNum);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PremiumUser other = (PremiumUser) obj;
		return cVV == other.cVV && caducity == other.caducity && countNum == other.countNum;
	}
	@Override
	public String toString() {
		return "PremiumUser [countNum=" + countNum + ", caducity=" + caducity + ", cVV=" + cVV + "]";
	}
	
}

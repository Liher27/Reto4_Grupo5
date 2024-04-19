package errekamusic.bbdd;

import java.util.Date;
import java.util.Objects;

public class FreeUser extends Users{
	private Date lastRepDate = null;
	private int playListNum = 0;
	public Date getLastRepDate() {
		return lastRepDate;
	}
	public void setLastRepDate(Date lastRepDate) {
		this.lastRepDate = lastRepDate;
	}
	public int getPlayListNum() {
		return playListNum;
	}
	public void setPlayListNum(int playListNum) {
		this.playListNum = playListNum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lastRepDate, playListNum);
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
		FreeUser other = (FreeUser) obj;
		return Objects.equals(lastRepDate, other.lastRepDate) && playListNum == other.playListNum;
	}
	@Override
	public String toString() {
		return "FreeUser [lastRepDate=" + lastRepDate + ", playListNum=" + playListNum + "]";
	}
	
	
}

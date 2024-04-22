package errekamusic.bbdd.Pojo;

import java.util.Date;
import java.util.Objects;

import javax.swing.ImageIcon;

public class Artist {
	private int artistID = 0;
	private String artistName = null;
	private Date artistRegDate = null;
	private String artistDesc = null;
	private int artistRepNum = 0;
	private boolean artistType = false;
	private ImageIcon artistImage = null;

	public int getArtistID() {
		return artistID;
	}

	public void setArtistID(int artistID) {
		this.artistID = artistID;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Date getArtistRegDate() {
		return artistRegDate;
	}

	public void setArtistRegDate(Date artistRegDate) {
		this.artistRegDate = artistRegDate;
	}

	public String getArtistDesc() {
		return artistDesc;
	}

	public void setArtistDesc(String artistDesc) {
		this.artistDesc = artistDesc;
	}

	public int getArtistRepNum() {
		return artistRepNum;
	}

	public void setArtistRepNum(int artistRepNum) {
		this.artistRepNum = artistRepNum;
	}

	public boolean isArtistType() {
		return artistType;
	}

	public void setArtistType(boolean artistType) {
		this.artistType = artistType;
	}

	public ImageIcon getArtistImage() {
		return artistImage;
	}

	public void setArtistImage(ImageIcon artistImage) {
		this.artistImage = artistImage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artistDesc, artistID, artistName, artistRegDate, artistRepNum, artistType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		return Objects.equals(artistDesc, other.artistDesc) && artistID == other.artistID
				&& Objects.equals(artistName, other.artistName) && Objects.equals(artistRegDate, other.artistRegDate)
				&& artistRepNum == other.artistRepNum && artistType == other.artistType;
	}

	@Override
	public String toString() {
		return "Artist [artistID=" + artistID + ", artistName=" + artistName + ", artistRegDate=" + artistRegDate
				+ ", artistDesc=" + artistDesc + ", artistRepNum=" + artistRepNum + ", artistType=" + artistType
				+ ", artistImage=" + artistImage + "]";
	}

}

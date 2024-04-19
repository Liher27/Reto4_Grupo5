package errekamusic.bbdd;

import java.util.Date;
import java.util.Objects;

public class Coleccion {
	private int collectionID = 0;
	private String collectionName = null;
	private Date publicationDate = null;
	private Date collectionDate = null;
	private int collectionRepNum = 0;
	private boolean collectionType = false;
	private String collectionGenre = null;
	private Artist artist = null;

	public int getCollectionID() {
		return collectionID;
	}

	public void setCollectionID(int collectionID) {
		this.collectionID = collectionID;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Date getCollectionDate() {
		return collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	public int getCollectionRepNum() {
		return collectionRepNum;
	}

	public void setCollectionRepNum(int collectionRepNum) {
		this.collectionRepNum = collectionRepNum;
	}

	public boolean isCollectionType() {
		return collectionType;
	}

	public void setCollectionType(boolean collectionType) {
		this.collectionType = collectionType;
	}

	public String getCollectionGenre() {
		return collectionGenre;
	}

	public void setCollectionGenre(String collectionGenre) {
		this.collectionGenre = collectionGenre;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artist, collectionDate, collectionGenre, collectionID, collectionName, collectionRepNum,
				collectionType, publicationDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coleccion other = (Coleccion) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(collectionDate, other.collectionDate)
				&& Objects.equals(collectionGenre, other.collectionGenre) && collectionID == other.collectionID
				&& Objects.equals(collectionName, other.collectionName) && collectionRepNum == other.collectionRepNum
				&& collectionType == other.collectionType && Objects.equals(publicationDate, other.publicationDate);
	}

	@Override
	public String toString() {
		return "Coleccion [collectionID=" + collectionID + ", collectionName=" + collectionName + ", publicationDate="
				+ publicationDate + ", collectionDate=" + collectionDate + ", collectionRepNum=" + collectionRepNum
				+ ", collectionType=" + collectionType + ", collectionGenre=" + collectionGenre + ", artist=" + artist
				+ "]";
	}

}

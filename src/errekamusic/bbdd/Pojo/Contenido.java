package errekamusic.bbdd.Pojo;

import java.sql.Time;
import java.util.Objects;

public class Contenido {
	private int contentID = 0;
	private String contentName = null;
	private Time contentDuration = null;
	private boolean contentType = false;
	private int contentReproNum = 0;
	public int getContentID() {
		return contentID;
	}
	public void setContentID(int contentID) {
		this.contentID = contentID;
	}
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public Time getContentDuration() {
		return contentDuration;
	}
	public void setContentDuration(Time contentDuration) {
		this.contentDuration = contentDuration;
	}
	public boolean isContentType() {
		return contentType;
	}
	public void setContentType(boolean contentType) {
		this.contentType = contentType;
	}
	public int getContentReproNum() {
		return contentReproNum;
	}
	public void setContentReproNum(int contentReproNum) {
		this.contentReproNum = contentReproNum;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contentDuration, contentID, contentName, contentReproNum, contentType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contenido other = (Contenido) obj;
		return Objects.equals(contentDuration, other.contentDuration) && contentID == other.contentID
				&& Objects.equals(contentName, other.contentName) && contentReproNum == other.contentReproNum
				&& contentType == other.contentType;
	}
	@Override
	public String toString() {
		return "Contenido [contentID=" + contentID + ", contentName=" + contentName + ", contentDuration="
				+ contentDuration + ", contentType=" + contentType + ", contentReproNum=" + contentReproNum + "]";
	}
	
		
}

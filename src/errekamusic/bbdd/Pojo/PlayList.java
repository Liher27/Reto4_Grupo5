package errekamusic.bbdd.Pojo;

import java.util.Objects;

public class PlayList {
	private int playListID = 0;
	private String playListTitle = null;
	private int playListContentNum = 0;
	private Contenido contenido = null;
	private Users users = null;
	public int getPlayListID() {
		return playListID;
	}
	public void setPlayListID(int playListID) {
		this.playListID = playListID;
	}
	public String getPlayListTitle() {
		return playListTitle;
	}
	public void setPlayListTitle(String playListTitle) {
		this.playListTitle = playListTitle;
	}
	public int getPlayListContentNum() {
		return playListContentNum;
	}
	public void setPlayListContentNum(int playListContentNum) {
		this.playListContentNum = playListContentNum;
	}
	public Contenido getContenido() {
		return contenido;
	}
	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contenido, playListContentNum, playListID, playListTitle, users);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		return Objects.equals(contenido, other.contenido) && playListContentNum == other.playListContentNum
				&& playListID == other.playListID && Objects.equals(playListTitle, other.playListTitle)
				&& Objects.equals(users, other.users);
	}
	@Override
	public String toString() {
		return "PlayList [playListID=" + playListID + ", playListTitle=" + playListTitle + ", playListContentNum="
				+ playListContentNum + ", contenido=" + contenido + ", users=" + users + "]";
	}
	
	
	
}

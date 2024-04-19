package errekamusic.bbdd;

import java.util.Objects;

public class Canciones {
	
	private Disc disc = null;

	public Disc getDisc() {
		return disc;
	}

	public void setDisc(Disc disc) {
		this.disc = disc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canciones other = (Canciones) obj;
		return Objects.equals(disc, other.disc);
	}

	@Override
	public String toString() {
		return "Canciones [disc=" + disc + "]";
	}
	
}

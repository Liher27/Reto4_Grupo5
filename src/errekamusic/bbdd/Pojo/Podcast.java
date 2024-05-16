package errekamusic.bbdd.Pojo;

import java.util.Objects;

public class Podcast extends Contenido{
	private Serie series = null;

	public Serie getSeries() {
		return series;
	}

	public void setSeries(Serie series) {
		this.series = series;
	}

	@Override
	public int hashCode() {
		return Objects.hash(series);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Podcast other = (Podcast) obj;
		return Objects.equals(series, other.series);
	}

	@Override
	public String toString() {
		return "Podcast [series=" + series + "]";
	}
	
}

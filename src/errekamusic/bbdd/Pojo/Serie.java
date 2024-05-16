package errekamusic.bbdd.Pojo;

import java.util.Date;
import java.util.Objects;

public class Serie extends Coleccion {
	private Date seriesEndDate = null;

	public Date getSeriesEndDate() {
		return seriesEndDate;
	}

	public void setSeriesEndDate(Date seriesEndDate) {
		this.seriesEndDate = seriesEndDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(seriesEndDate);
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
		Serie other = (Serie) obj;
		return Objects.equals(seriesEndDate, other.seriesEndDate);
	}

	@Override
	public String toString() {
		return "Series [seriesEndDate=" + seriesEndDate + "]";
	}
	
}

package errekamusic.utils;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.time.LocalDate;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Converter {

	public static ImageIcon getImageFromBlob(Blob blobFromDatabase) throws Exception {

		ImageIcon ret = null;

		byte[] imageBytes = blobFromDatabase.getBytes(1, (int) blobFromDatabase.length());

		Image image = ImageIO.read(new ByteArrayInputStream(imageBytes));

		ImageIcon icon = new ImageIcon(image);

		ret = icon;

		return ret;
	}

	public static LocalDate convertFromSqlDateToUtilDate(java.sql.Date sqlDateFromDatabase) {

		return sqlDateFromDatabase.toLocalDate();
	}

	public static java.sql.Date convertFromUtilDateToSqlDate(java.util.Date utilDateToDatabase) {

		java.sql.Date ret = null;

		ret = new java.sql.Date(utilDateToDatabase.getTime());

		return ret;
	}
}

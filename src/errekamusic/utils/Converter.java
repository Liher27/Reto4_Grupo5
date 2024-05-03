package errekamusic.utils;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Blob;

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

	public static java.util.Date convertFromSqlDateToUtilDate(java.sql.Date sqlDateFromDatabase) {

		java.util.Date ret = null;

		ret = new java.util.Date(sqlDateFromDatabase.getTime());

		return ret;
	}

	public static java.sql.Date convertFromUtilDateToSqlDate(java.util.Date utilDateFromDatabase) {

		java.sql.Date ret = null;

		ret = new java.sql.Date(utilDateFromDatabase.getTime());

		return ret;
	}
}

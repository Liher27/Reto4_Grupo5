package errekamusic.bbdd.Utils;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Converter {

	public static ImageIcon getImageFromBlob(Blob blobFromDatabase) throws Exception {
		byte[] imageBytes = blobFromDatabase.getBytes(1, (int) blobFromDatabase.length());
		Image image = ImageIO.read(new ByteArrayInputStream(imageBytes));
		return new ImageIcon(image);
	}

	public static java.util.Date convertFromSqlDateToUtilDate(java.sql.Date sqlDateFromDatabase) {
		return new java.util.Date(sqlDateFromDatabase.getTime());
	}

	public static java.sql.Date convertStringToSqlDate(String textDate) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date ret = (java.sql.Date) formatter.parse(textDate);
		return ret;
	}

	public static java.util.Date convertStringToUtilDate(String textDate) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date ret = (java.util.Date) formatter.parse(textDate);
		return ret;
	}
	
	public static java.sql.Date convertFromUtilDateToSqlDate(java.util.Date utilDateToDatabase) {
		java.sql.Date ret = null;
		ret = new java.sql.Date(utilDateToDatabase.getTime());
		return ret;
	}

	public java.sql.Date convertDateToSqDate(Date utilDate) {
		java.sql.Date sqldate = null;
		sqldate = new java.sql.Date(utilDate.getTime());
		return sqldate;
	}
	
	public static Date getCurrentDate() {
		return new Date(System.currentTimeMillis());
	}
	
}

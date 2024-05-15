package errekamusic.bbdd.Utils;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Converter {

	public static byte[] readImageData(File imageFile) throws FileNotFoundException, IOException {
		try (FileInputStream inputStream = new FileInputStream(imageFile)) {
			byte[] buffer = new byte[(int) imageFile.length()];
			inputStream.read(buffer);
			return buffer;
		}
	}
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

	public static Date getCurrentDate() {
		return new Date(System.currentTimeMillis());
	}

	public static String pathToBlob(String pathFile) throws IOException {
		byte[] fileContent = Files.readAllBytes(Paths.get(pathFile));
		return Base64.getEncoder().encodeToString(fileContent);
	}
	
	
	public static String convertDateToString(java.util.Date date){
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = formatter.format(date);
		
		
		return s;
		
	}

}
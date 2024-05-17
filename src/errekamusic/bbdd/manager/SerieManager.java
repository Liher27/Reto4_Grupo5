package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.Serie;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class SerieManager implements DatabaseInterface <Serie, Integer> {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	
	public List<Serie> getByCreator(int creatorId) throws ClassNotFoundException, SQLException {
		List<Serie> listSeries = new ArrayList<Serie>();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "select collectionID, collectionName, collectionGenre, CollectionDate, CollectionImage from collection where creatorId = ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, creatorId);
		result = pstmt.executeQuery();

		while (result.next()) {
			Serie serie = new Serie();
			serie.setCollectionID(result.getInt("collectionID"));
			serie.setCollectionName(result.getString("CollectionName"));
			serie.setCollectionGenre(result.getString("CollectionGenre"));
			serie.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
			listSeries.add(serie);
		}
		return listSeries;
	}

	@Override
	public Serie selectById(Integer collectionId) throws ClassNotFoundException, SQLException {
	    Serie serieInfo = new Serie();

	    try {
	        Class.forName(DBUtils.DRIVER);

	        conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
	        String sql = "SELECT CollectionName, CollectionGenre, CollectionDate, CollectionImage FROM collection WHERE CollectionID = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, collectionId);
	        result = pstmt.executeQuery();

	        if (result.next()) {
	            serieInfo.setCollectionName(result.getString("CollectionName"));
	            serieInfo.setCollectionGenre(result.getString("CollectionGenre"));
	            serieInfo.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
	            serieInfo.setCollectionImage(Converter.getImageFromBlob(result.getBlob("CollectionImage")));
	        }
	    } catch (ClassNotFoundException e) {
	        System.out.println("Ha dado fallo -> " + e.getMessage());
	    } catch (SQLException e) {
	        System.out.println("Malformacion sql -> " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("Error genérico -> " + e.getMessage());
	    } finally {
	        // Cerrar recursos (Connection, PreparedStatement, ResultSet) aquí si es necesario
	        // closeResources();
	    }

	    return serieInfo;
	}


	@Override
	public List<Serie> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Serie t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean update(Serie t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean delete(Integer t) {
		boolean ret = false;
		return ret;		
	}
	

}

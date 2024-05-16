package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Podcast;
import errekamusic.bbdd.Pojo.Serie;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.Utils.DBUtils;

public class SerieManager implements DatabaseInterface <Podcast, Integer> {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	
	public List<Serie> getByCreator(int creatorId) throws ClassNotFoundException, SQLException {
		List<Serie> listSeries = new ArrayList<Serie>();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "select collectionName, collectionGenre, CollectionDate, CollectionImage, g.ArtistName from collection where collectionType = 'serie' and creatorId = ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, creatorId);
		result = pstmt.executeQuery();

		while (result.next()) {
			Serie serie = new Serie();
			serie.setCollectionName(result.getString("CollectionName"));
			serie.setCollectionGenre(result.getString("CollectionGenre"));
			serie.setCollectionDate(Converter.convertFromSqlDateToUtilDate(result.getDate("CollectionDate")));
			listSeries.add(serie);
		}

		return listSeries;
	}

	@Override
	public Podcast selectById(Integer z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Podcast> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Podcast t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean update(Podcast t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean delete(Integer t) {
		boolean ret = false;
		return ret;		
	}
	

}

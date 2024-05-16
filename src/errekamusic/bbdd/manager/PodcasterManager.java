package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Podcaster;
import errekamusic.bbdd.Utils.DBUtils;
import errekamusic.enumerado.ArtistType;

public class PodcasterManager extends AbstractManager implements DatabaseInterface<Podcaster, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private Connection conn = null;

	public List<Podcaster> getPodcasterByArtistType(ArtistType artistType) throws ClassNotFoundException, SQLException {
		List<Podcaster> PodcasterInfo = new ArrayList<Podcaster>();
		System.out.println("Podcaster "+artistType);
		String artistTypeSend = artistType.toString();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM ARTIST WHERE ArtistType = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, artistTypeSend);
		result = pstmt.executeQuery();

		while (result.next()) {
			Podcaster podcaster = new Podcaster();
			podcaster.setArtistID(result.getInt("ArtistID"));
			podcaster.setArtistName(result.getString("ArtistName"));
			podcaster.setArtistRegDate(result.getDate("ArtistRegDate"));
			podcaster.setArtistDesc(result.getString("ArtistDesc"));
			podcaster.setArtistRepNum(result.getInt("ArtistRepNum"));
			// artist.setArtistImage((ImageIcon) result.getObject("CreatorIconImage"));
			PodcasterInfo.add(podcaster);
		}

		return PodcasterInfo;

	}

	@Override
	public Podcaster selectById(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Podcaster> selectAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Podcaster t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Podcaster t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}

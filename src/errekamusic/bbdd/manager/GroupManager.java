package errekamusic.bbdd.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Group;
import errekamusic.bbdd.Utils.DBUtils;
import errekamusic.enumerado.ArtistType;

public class GroupManager extends AbstractManager implements DatabaseInterface<Group, Integer> {

	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private Connection conn = null;

	public List<Group> getGroupByArtistType(ArtistType artistType) throws ClassNotFoundException, SQLException {
		List<Group> groupInfo = new ArrayList<Group>();
		String artistTypeSend = artistType.toString();

		Class.forName(DBUtils.DRIVER);

		conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		String sql = "SELECT * FROM ARTIST WHERE ArtistType = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, artistTypeSend);
		result = pstmt.executeQuery();

		while (result.next()) {
			Group group = new Group();
			group.setArtistID(result.getInt("ArtistID"));
			group.setArtistName(result.getString("ArtistName"));
			group.setArtistRegDate(result.getDate("ArtistRegDate"));
			group.setArtistDesc(result.getString("ArtistDesc"));
			group.setArtistRepNum(result.getInt("ArtistRepNum"));
			// artist.setArtistImage((ImageIcon) result.getObject("CreatorIconImage"));
			groupInfo.add(group);
		}

		return groupInfo;

	}

	@Override
	public Group selectById(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> selectAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Group t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Group t) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer z) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}

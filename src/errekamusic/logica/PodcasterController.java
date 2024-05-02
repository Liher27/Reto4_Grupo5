package errekamusic.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Utils.DBUtils;

public class PodcasterController implements ArtistsInterfaceController<Artist> {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private List<Artist> artistInfo = null;

	@Override
	public List<Artist> getById(int id) {
		 int getInputArtistId = id;
		    try {
		        Class.forName(DBUtils.DRIVER);

		        conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		        String sql = "SELECT * FROM ARTIST WHERE ArtistID = ?";
		        pstmt = conn.prepareStatement(sql);
		        pstmt.setInt(1, getInputArtistId);
		        result = pstmt.executeQuery();
		        
		        while (result.next()) {
		            Artist artist = new Artist();
		            artist.setArtistName(result.getString("ArtistName"));
		            artist.setArtistRegDate(result.getDate("ArtistRegDate"));
		            artist.setArtistDesc(result.getString("ArtistDesc"));
		            artist.setArtistRepNum(result.getInt("ArtistRepNum"));
		            artist.setArtistImage((ImageIcon) result.getObject("CreatorIconImage"));
		            artistInfo.add(artist);
		        }
		        if (artistInfo.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
		        } 
		        else {
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return artistInfo;
	}

	@Override
	public List<Artist> getByArtistType(boolean artistType) {
		
		    boolean getInputArtistType = artistType;
		    try {
		        Class.forName(DBUtils.DRIVER);

		        conn = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
		        String sql = "SELECT * FROM ARTIST WHERE ArtistType = ?";
		        pstmt = conn.prepareStatement(sql);
		        pstmt.setBoolean(1, getInputArtistType);
		        result = pstmt.executeQuery();
		        
		        while (result.next()) {
		            Artist artist = new Artist();
		            artist.setArtistName(result.getString("ArtistName"));
		            artist.setArtistRegDate(result.getDate("ArtistRegDate"));
		            artist.setArtistDesc(result.getString("ArtistDesc"));
		            artist.setArtistRepNum(result.getInt("ArtistRepNum"));
		            artist.setArtistImage((ImageIcon) result.getObject("CreatorIconImage"));
		            artistInfo.add(artist);
		        }
		        if (artistInfo.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
		        } 
		        else {
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return artistInfo;
	
	}
	
}

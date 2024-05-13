//package errekamusic.logica;
//
//import java.util.List;
//
//import javax.swing.JOptionPane;
//
//import errekamusic.bbdd.Pojo.Artist;
////import errekamusic.bbdd.manager.ArtistManager;
//import errekamusic.bbdd.manager.ArtistsInterface;
//import errekamusic.enumerado.ArtistType;
//
//public class ArtistController {
//
//	private List<Artist> artistInfo = null;
//	private ArtistsInterface<Artist> artistsInterface = null;
//
//	public List<Artist> getByArtistType(ArtistType artistType) {
//
//		artistsInterface = new ArtistManager();
//		artistInfo = artistsInterface.getByArtistType(artistType);
//		if (artistInfo.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
//		}
//		return artistInfo;
//
//	}
//	
//	public List<Artist> getById(int id) {
//
//		artistsInterface = new ArtistManager();
//		artistInfo = artistsInterface.getById(id);
//		if (artistInfo.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "No se encontraron artistas del tipo especificado");
//		}
//		return artistInfo;
//	}
//
//}

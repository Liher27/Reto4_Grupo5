package errrekamusicTest.bbddTest;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import errekamusic.bbdd.Pojo.Artist;

import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.manager.ArtistManager;

public class ArtistManagerTest {

	@Test

	public void test() {

		fail("Not yet implemented");

	}

	@Test

	public void selectTestado() throws Exception {

		Artist artist = new Artist();

		ArtistManager artistManger = new ArtistManager();

		artist = artistManger.selectById(1);

		String varName = "La pija y la quinqui";

		assertEquals(artist.getArtistName(), varName);

	}

	@Test

	public void insertTestado() throws Exception {

		ArtistManager artistManger = new ArtistManager();

		Artist artist = new Artist();

		artist.setArtistName("test1");

		artist.setArtistDesc("esto es un test");

		artist.setArtistRegDate(Converter.convertStringToUtilDate("2015-08-22"));

		artist.setArtistRepNum(0);

		artist.setArtistType("Grupo");

		artist.setArtistImage(null);

		artistManger.insert(artist);

		artistManger.selectById(4);

		assertNotNull(artist.toString());

	}

	@Test

	public void deleteTestado() throws Exception {

		ArtistManager artistManger = new ArtistManager();

		int id = 3;

		artistManger.delete(id);

		Artist artist = new Artist();

		artist = artistManger.selectById(3);

		assertNull(artist.getArtistName());

	}

	@Test

	public void testadoCompleja() throws ClassNotFoundException, SQLException {

		ArtistManager artistManger = new ArtistManager();

		Artist artist = new Artist();

		int numContenido = 1;

		artistManger.getDiscInfo(numContenido);

		assertNotNull(artist.toString());

	}

}

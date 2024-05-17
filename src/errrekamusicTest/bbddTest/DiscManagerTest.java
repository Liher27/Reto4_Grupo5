package errrekamusicTest.bbddTest;

import static org.junit.Assert.*;


import java.io.IOException;

import java.sql.SQLException;
import java.text.ParseException;


import org.junit.Test;

import errekamusic.bbdd.Pojo.Artist;
import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Utils.Converter;
import errekamusic.bbdd.manager.AbstractManager;
import errekamusic.bbdd.manager.DiscManager;



public class DiscManagerTest extends AbstractManager {

	@Test
	public void test() {
		
	}
	
	@Test
	public void updateTestado() throws SQLException, ClassNotFoundException {
	DiscManager discManager = new DiscManager ();
	Disc disc = new Disc();
	String name = "hola";
	int id = 2;
	discManager.updateTestado(name,id);
	
	assertEquals(disc.getCollectionName(),"hola");
	}
	@Test
	public void selectTestado() {
		DiscManager discManager = new DiscManager ();
		int id = 2;
		Disc disc = discManager.selectById(id);
		String varName = "Coleccion1";
		assertEquals(disc.getCollectionName(),varName);
		
	}
//	@Test
//	public void deleteTestado() throws SQLException {
//		DiscManager discManager = new DiscManager ();
//		int id = 4;
//		discManager.delete(id);
//		Disc disc = discManager.selectById(id);
//		assertNull(disc.getCollectionName());
//		
//	}
	@Test
	public void insertTestado() throws ParseException, IOException, SQLException {
		DiscManager discManager = new DiscManager ();
		Disc disc = new Disc();
		Artist artist = new Artist();
		disc.setCollectionName("ooo");
		disc.setCollectionDesc("sfaga");
		disc.setCollectionGenre("Rock");
		disc.setCollectionRepNum(0);
		disc.setCollectionType("Disco");
		disc.setCollectionDate(Converter.convertStringToUtilDate("2015-08-22"));
		disc.setCollectionImage(null);
		discManager.insert(disc);
		disc = discManager.selectById(4);
		assertNotNull(disc.toString());
		
	}
	@Test
	public void testCompleja() throws Exception {
		DiscManager discManager = new DiscManager ();
		Disc disc = new Disc();
		int numContenido = 1;
		
		discManager.getDiscBySongId(numContenido);
		assertNotNull(disc.toString());
	}

}

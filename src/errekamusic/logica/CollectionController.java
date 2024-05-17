package errekamusic.logica;

import java.security.PublicKey;
import java.sql.SQLException;
import java.util.List;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.Pojo.Serie;
import errekamusic.bbdd.manager.DiscManager;
import errekamusic.bbdd.manager.SerieManager;

public class CollectionController {


	public List<Disc> GetDiscForPropaganda(int randomDiscID) throws Exception {
		DiscManager discManager = new DiscManager();
		List<Disc> ret = discManager.getDiscForPropaganda(randomDiscID);
		return ret;
	}

	public List<Disc> getDiscList(int id) throws Exception {
		DiscManager discManager = new DiscManager();
		return discManager.getDiscBySongId(id);

	}
	

	public List<Disc> GetAllDiscByCreatorId (int creatorId ) throws ClassNotFoundException, SQLException{
		DiscManager discManager = new DiscManager();
		List<Disc> ret = discManager.getByCreator(creatorId);
		return ret;
	}

	public List<Disc> top10Disc() throws Exception{
		DiscManager discManager = new DiscManager();
		List<Disc> ret = discManager.top10Artist();
		return ret;
	}
	public List<Serie> top10Serie() throws Exception{
		SerieManager serieManager = new SerieManager();
		List<Serie> ret = serieManager.top10Serie();

		return ret;
	}
	
	public List<Disc> getDiscByArtist(int creatorId) throws ClassNotFoundException, SQLException {
		return new DiscManager().getByCreator(creatorId);
	}
	
	public Disc getDiscInfo(int discID) throws ClassNotFoundException, SQLException {
		return new DiscManager().selectById(discID);
	}
	
	public List<Serie> getSerieByArtist(int creatorId) throws ClassNotFoundException, SQLException {
		return new SerieManager().getByCreator(creatorId);
	}
	
	public Serie getSerieInfo(int discID) throws ClassNotFoundException, SQLException {
		return new SerieManager().selectById(discID);
	}


}

package errekamusic.logica;

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
	
	public List<Disc> getDiscByArtist(int creatorId) throws ClassNotFoundException, SQLException {
		return new DiscManager().getByCreator(creatorId);
	}

	public List<Serie> getSerieByPodcaster(int creatorId) throws ClassNotFoundException, SQLException {
		return new SerieManager().getByCreator(creatorId);
	}
}

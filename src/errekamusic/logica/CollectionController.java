package errekamusic.logica;

import java.util.List;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.manager.DiscManager;

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

	public List<Disc> GetDiscByArtist(int creatorId) {
		DiscManager discManager = new DiscManager();
		List<Disc> discList = discManager.getByCreator(creatorId);
		if (discList.isEmpty()) {
			return null;
		}
		return discList;

	}

}

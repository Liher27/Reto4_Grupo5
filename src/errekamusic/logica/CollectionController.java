package errekamusic.logica;

import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.manager.DiscManager;

public class CollectionController {

	DiscManager discManager = null;
	private List<Disc>discList = null;
	public List<Disc> GetDiscForPropaganda(int randomDiscID) throws Exception {
		discManager = new DiscManager();
		List <Disc> ret = new ArrayList<>();
		
		ret = discManager.getDiscForPropaganda(randomDiscID);

		return ret;
	}
	
	public List<Disc> getDiscList(int id) throws Exception{
		discManager = new DiscManager();
		return discManager.getDiscBySongId(id);
		
	}

}

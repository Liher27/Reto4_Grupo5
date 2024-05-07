package errekamusic.logica;

import java.util.ArrayList;
import java.util.List;

import errekamusic.bbdd.Pojo.Disc;
import errekamusic.bbdd.manager.DiscManager;

public class CollectionController {

	DiscManager discManager = null;
	
	public List<Disc> GetDiscForPropaganda(int randomDiscID) throws Exception {
		discManager = new DiscManager();
		List <Disc> ret = new ArrayList<>();
		
		ret = discManager.getDiscForPropaganda(randomDiscID);

		return ret;
	}
	
	//Codigo para administrar los managers de disco y serie

}

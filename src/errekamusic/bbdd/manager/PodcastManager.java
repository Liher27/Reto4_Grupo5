package errekamusic.bbdd.manager;

import java.util.List;

import errekamusic.bbdd.Pojo.Podcast;

public class PodcastManager implements DatabaseInterface <Podcast, Integer> {


	@Override
	public Podcast selectById(Integer z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Podcast> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Podcast t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean update(Podcast t) {
		boolean ret = false;
		return ret;		
	}

	@Override
	public boolean delete(Integer t) {
		boolean ret = false;
		return ret;		
	}
	

}

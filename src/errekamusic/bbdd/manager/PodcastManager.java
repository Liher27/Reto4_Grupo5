package errekamusic.bbdd.manager;

import java.util.List;

import errekamusic.bbdd.Pojo.Podcast;

public class PodcastManager implements ContentsInterface<Podcast>,DataBaseInterface <Podcast> {

	@Override
	public List<Podcast> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertInto(Podcast podcast) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeByID(int ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean changeByID(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Podcast getOne(Podcast podcast) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
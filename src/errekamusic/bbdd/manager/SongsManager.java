package errekamusic.bbdd.manager;

import java.util.List;

import errekamusic.bbdd.Pojo.Canciones;

public class SongsManager implements ContentsInterface <Canciones>, DataBaseInterface <Canciones> {

	@Override
	public List<Canciones> getByID(int ID) {
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
	public List<Canciones> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertInto(Canciones song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Canciones getOne(Canciones song) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

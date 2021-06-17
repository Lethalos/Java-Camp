package GameBackend.Concrete;

import java.util.ArrayList;
import java.util.List;

import GameBackend.Abstract.GameService;
import GameBackend.Entities.Game;

public class GameManager implements GameService{
	public List<Game> mainLibrary = new ArrayList<Game>();
	
	@Override
	public void addToMainLibrary(Game game) {
		mainLibrary.add(game);
	}

	@Override
	public List<Game> getMainLibrary() {
		return mainLibrary;
	}
}

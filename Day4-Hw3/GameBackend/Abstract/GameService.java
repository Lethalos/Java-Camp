package GameBackend.Abstract;

import java.util.List;

import GameBackend.Entities.Game;

public interface GameService {
	public void addToMainLibrary(Game game);
	public List<Game> getMainLibrary();
}

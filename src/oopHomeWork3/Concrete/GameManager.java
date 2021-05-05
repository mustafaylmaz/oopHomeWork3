package oopHomeWork3.Concrete;

import oopHomeWork3.Abstract.GameService;
import oopHomeWork3.Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added: "+ game.getGameName() );
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game added: "+ game.getGameName() );
	}

	@Override
	public void update(Game game) {
		System.out.println("Game added: "+ game.getGameName() );
		
	}

}

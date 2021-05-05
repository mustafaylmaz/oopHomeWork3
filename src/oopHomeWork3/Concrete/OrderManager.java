package oopHomeWork3.Concrete;

import oopHomeWork3.Abstract.OrderService;
import oopHomeWork3.Entity.Game;
import oopHomeWork3.Entity.User;

public class OrderManager implements OrderService{
	
	Game game;
	User user; 

	public OrderManager(Game game, User user) {
		super();
		this.game = game;
		this.user = user;
	}

	@Override
	public void order(User user) {
		System.out.println(game.getGameName() + " The game was ordered: " + user.getName());
		
	}

	@Override
	public void cancel(User user) {
		System.out.println(game.getGameName() + " The game order was canceled: " + user.getName());
		
	}
	

}

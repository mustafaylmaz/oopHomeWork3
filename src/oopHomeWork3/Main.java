package oopHomeWork3;

import oopHomeWork3.Concrete.*;

import oopHomeWork3.Entity.*;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setName("Super Gamer");
		
		UserManager manager = new UserManager(new UserCheckManager(),user1);
		manager.add(user1);
		
		System.out.println("********Game test************");
		
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("metin2");
		
		GameManager gm1 = new GameManager();
		gm1.add(game1);

		System.out.println("********Campaign Test********");
		
		Campaign campaign = new Campaign();
		campaign.setCampaignId(1);
		campaign.setCampaignName("awesome campaign");
		CampaignManager cmpManager = new CampaignManager();
		cmpManager.add(campaign);

		System.out.println("********OrderTest************");
		Order order1 = new Order();
		order1.setOrderId(1);
		
		OrderManager ordermanager = new OrderManager(game1, user1);
		ordermanager.order(user1);
		
		System.out.println("********Sale Test************");
		SaleManager saleManager = new SaleManager();
		saleManager.sold(order1);
	}	

}

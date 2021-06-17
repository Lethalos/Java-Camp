package GameBackend;

import java.util.ArrayList;
import java.util.List;

import GameBackend.Adapters.MernisServiceAdapter;
import GameBackend.Concrete.CampaignManager;
import GameBackend.Concrete.CustomerManager;
import GameBackend.Concrete.GameManager;
import GameBackend.Concrete.GameSaleManager;
import GameBackend.Entities.Campaign;
import GameBackend.Entities.Customer;
import GameBackend.Entities.Game;

public class Main {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		GameSaleManager gameSaleManager = new GameSaleManager(gameManager);		
		CampaignManager campaignManager = new CampaignManager();

		Customer customer = new Customer(1, "Kaan","Ozdo", "11111111111", 1999, "Lethalos", "kaan123@gmail.com",
				"kaan123", 1000);
	
		List<Game> games = new ArrayList<Game>();
		games.add(new Game(1, "Skyrim", 230));
		games.add(new Game(2, "Hades", 50));
		games.add(new Game(3, "Devil May Cry 5", 350));
		games.add(new Game(4, "Metin 2", 500));
		games.add(new Game(5, "Batman: Arkham City", 150));
		
		for(Game game : games) {
			gameManager.addToMainLibrary(game);
		}
		
		customerManager.save(customer);
		//customerManager.update(customer);
		//customerManager.delete(customer);

		gameSaleManager.sellGame(customer, games.get(0));
		gameSaleManager.sellGame(customer, games.get(1));
		
		Campaign summerCampaign = new Campaign("Summer Campaign", 60);
		Campaign winterCampaign = new Campaign("Winter Campaign", 45);
		Campaign weekendCampaign = new Campaign("Weekend Campaign", 10);
		
		campaignManager.add(summerCampaign);
		campaignManager.add(winterCampaign);
		campaignManager.add(weekendCampaign);
		//campaignManager.update(weekendCampaign);
		//campaignManager.delete(winterCampaign);
		
		gameSaleManager.enableCampaign(weekendCampaign);
		//gameSaleManager.disableAllCampaigns();
		//gameSaleManager.enableCampaign(winterCampaign);
		//gameSaleManager.enableCampaign(summerCampaign);
		//gameSaleManager.disableAllCampaigns();		
	}
}

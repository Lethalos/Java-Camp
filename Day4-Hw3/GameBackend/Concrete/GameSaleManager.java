package GameBackend.Concrete;

import GameBackend.Abstract.GameSaleService;
import GameBackend.Abstract.GameService;
import GameBackend.Entities.Campaign;
import GameBackend.Entities.Customer;
import GameBackend.Entities.Game;

public class GameSaleManager implements GameSaleService {
	private GameService gameService;

	private Campaign currentCampaign;

	public GameSaleManager(GameService gameService) {
		this.gameService = gameService;
	}

	@Override
	public void sellGame(Customer customer, Game game) {
		if (customer.getBalance() >= game.getPrice()) {
			customer.setBalance(customer.getBalance() - game.getPrice());
			customer.gameLibrary.add(game);
			System.out.println(game.getName() + " added to " + customer.getUserName() + "'s library.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	@Override
	public void enableCampaign(Campaign campaign) {
		currentCampaign = campaign;

		for (Game game : gameService.getMainLibrary()) {
			System.out.println(game);
			game.setPrice(game.getPrice() * (100 - currentCampaign.getDiscountRate()) / 100);
			System.out.println(game);
		}
	}

	public void disableAllCampaigns() {
		for (Game game : gameService.getMainLibrary()) {
			System.out.println(game);
			game.setPrice(game.getOriginalPrice());
			System.out.println(game);
		}
	}
}

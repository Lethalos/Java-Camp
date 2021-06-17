package GameBackend.Abstract;

import GameBackend.Entities.Campaign;
import GameBackend.Entities.Customer;
import GameBackend.Entities.Game;

public interface GameSaleService {
	public void sellGame(Customer customer, Game game);
	public void enableCampaign(Campaign campaign);
	public void disableAllCampaigns();
}

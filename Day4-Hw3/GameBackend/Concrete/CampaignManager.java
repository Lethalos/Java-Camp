package GameBackend.Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import GameBackend.Abstract.CampaignService;
import GameBackend.Entities.Campaign;

public class CampaignManager implements CampaignService {
	public List<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println(campaign.getName() + " added to campaigns.");
	}

	@Override
	public void update(Campaign campaign) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select what you want to update");
		System.out.println("1-) Campaign name");
		System.out.println("2-) Discount rate");
		
		int choice = scanner.nextInt();
		if(choice == 1) {
			System.out.print("Enter your new campaign name: ");
			campaign.setName(scanner.next());
		} else if(choice == 2) {
			System.out.println("Enter your new discount rate: ");
			campaign.setDiscountRate(scanner.nextInt());			
		}
		
		scanner.close();
	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
		System.out.println(campaign.getName() + " deleted");
	}
}

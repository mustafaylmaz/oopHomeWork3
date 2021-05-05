package oopHomeWork3.Concrete;

import oopHomeWork3.Abstract.CampaignService;
import oopHomeWork3.Entity.Campaign;



public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" added");
		
	}
	
	

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"deleted");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" updated");
		
	}



	@Override
	public void addBulk(Campaign[] campaign) {
		for (Campaign campaign2 : campaign) {
			System.out.println( campaign2.getCampaignName() + " Campagin added");
		}
		
	}





}

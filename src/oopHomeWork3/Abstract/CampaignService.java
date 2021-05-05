package oopHomeWork3.Abstract;

import oopHomeWork3.Entity.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	void addBulk(Campaign[] campaign); 
}

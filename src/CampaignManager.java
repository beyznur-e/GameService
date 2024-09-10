import java.util.ArrayList;
import java.util.List;

public class CampaignManager implements ICampaign {
    private List<Campaign> campaigns;

    public CampaignManager() {
        campaigns = new ArrayList<>();
    }

    @Override
    public void addCampaign(Campaign campaign) {
        campaigns.add(campaign);
        System.out.println(campaign.getName() + " kampanyası eklendi.");
    }

    @Override
    public void removeCampaign(Campaign campaign) {
        campaigns.remove(campaign);
        System.out.println(campaign.getName() + " kampanyası silindi.");
    }

    @Override
    public void updateCampaign(Campaign campaign, String newName, double newDiscountRate) {
        campaign.setName(newName);
        campaign.setDiscountRate(newDiscountRate);
        System.out.println(campaign.getName() + " kampanyası güncellendi. Yeni indirim oranı: " + campaign.getDiscountRate());
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }
}

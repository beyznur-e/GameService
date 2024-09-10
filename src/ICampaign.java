public interface ICampaign {
    void addCampaign(Campaign campaign);
    void removeCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign, String newName, double newDiscountRate);
}


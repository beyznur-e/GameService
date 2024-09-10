import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Oyuncu oluşturma
        Player player = new Player();
        player.setId(1);
        player.setFirstName("Beyza");
        player.setLastName("Ertem");
        player.setNationalityId("123456789");
        player.setBirthD(new Date());
        player.setOyunKoleksiyonu(new ArrayList<>());  // Oyuncunun oyun koleksiyonu

        // Oyun oluşturma
        Game game1 = new Game(1, "The Witcher 3", 49.99);
        Game game2 = new Game(2, "Cyberpunk 2077", 59.99);

        // Kampanya oluşturma
        Campaign summerCampaign = new Campaign(1, "Yaz İndirimi", 20.0);
        Campaign winterCampaign = new Campaign(2, "Kış İndirimi", 15.0);

        // Satış işlemi
        SalesManager salesManager = new SalesManager();

        // Kampanyalı satış
        System.out.println("Kampanyalı satış:");
        salesManager.sellGame(player, game1, summerCampaign);

        // Kampanyasız satış
        System.out.println("\nKampanyasız satış:");
        salesManager.sellGame(player, game2, null);  // Kampanya olmadan satış

        // Oyuncunun oyun koleksiyonunu yazdırma
        System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + "'nin koleksiyonundaki oyunlar:");
        for (Game game : player.getOyunKoleksiyonu()) {
            System.out.println("Oyun: " + game.getName() + " - Fiyat: " + game.getPrice());
        }

        // Campaign Manager oluşturma
        CampaignManager campaignManager = new CampaignManager();

        // Kampanyalar oluşturma
        Campaign campaign1 = new Campaign(1, "Yaz İndirimi", 20.0);
        Campaign campaign2 = new Campaign(2, "Kış İndirimi", 15.0);

        // Kampanya ekleme
        campaignManager.addCampaign(campaign1);
        campaignManager.addCampaign(campaign2);

        // Kampanya güncelleme
        campaignManager.updateCampaign(campaign1, "Sonbahar İndirimi", 25.0);

        // Kampanya silme
        campaignManager.removeCampaign(campaign2);


    }
}
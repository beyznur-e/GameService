public class SalesManager {

    public void sellGame(Player player, Game game, Campaign campaign) {
        double finalPrice = game.getPrice();

        // Kampanya varsa, indirimli fiyatı hesapla
        if (campaign != null) {
            finalPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100);
            System.out.println(campaign.getName() + " kampanyası uygulandı. İndirimli fiyat: " + finalPrice);
        } else {
            System.out.println("Kampanya yok. Normal fiyat: " + finalPrice);
        }

        // Oyuncunun koleksiyonuna oyunu ekle
        player.getOyunKoleksiyonu().add(game);
        System.out.println(player.getFirstName() + " " + player.getLastName() + " oyuncusuna " + game.getName() + " oyunu satıldı. Satış fiyatı: " + finalPrice);
    }
}

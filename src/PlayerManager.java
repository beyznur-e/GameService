public class PlayerManager extends Player implements IPlayer{
    @Override
    public void save() {
        System.out.println("Kullanıcı kaydedildi." + getFirstName() + getLastName());
    }

    @Override
    public void update() {
        System.out.println("Kullanıcı güncellendi." + getFirstName() + getLastName());

    }

    @Override
    public void delete() {
        System.out.println("Kullanıcı silindi." + getFirstName() + getLastName());

    }
}

public class ServiceManager extends Player implements IService{
    @Override
    public void dogrula() {
        int tc =getNationalityId().length();
        if(!getFirstName().isEmpty() && !getLastName().isEmpty() && !getNationalityId().isEmpty() && tc < 11){
            System.out.println("Doğrulanmış kullanıcı");
        }
        else{
            System.out.println("Girdiğiniz bilgilerde hata var.");
        }
    }
}

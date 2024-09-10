import java.util.Date;
import java.util.List;

public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private Date birthD;
    List<Game> oyunKoleksiyonu;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Date getBirthD() {
        return birthD;
    }

    public void setBirthD(Date birthD) {
        this.birthD = birthD;
    }

    public List<Game> getOyunKoleksiyonu() {
        return oyunKoleksiyonu;
    }

    public void setOyunKoleksiyonu(List<Game> oyunKoleksiyonu) {
        this.oyunKoleksiyonu = oyunKoleksiyonu;
    }


}


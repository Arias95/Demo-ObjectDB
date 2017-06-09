package demoobjectdb;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client extends Person
{
    private String city;
    private String province;

    public Client(String nombre, String primerApellido, String segundoApellido, String gender, int phoneNum, String city,
                  String province)
    {
        super(nombre, primerApellido, segundoApellido, gender, phoneNum);
        this.city = city;
        this.province = province;
    }

    // GETTERS:
    public int getID()
    {
        return this.findID();
    }

    public String getCity() {
        return city;
    }

    public String getProvince()
    {
        return province;
    }

    // SETTERS:
    public void setCity(String city)
    {
        this.city = city;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }
    
    @Override
    public String toString()
    {
        return String.format("%d | %s %s %s | %s, %s | %d", this.findID(), this.getNombre(),
                this.getPrimerApellido(), this.getSegundoApellido(), this.city,
                this.province, this.getPhoneNum());
    }
}

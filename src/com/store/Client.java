package com.store;
import javax.persistence.Entity;

@Entity
public class Client extends Person
{
    private String city;
    private String province;

    public Client(String nombre, String primerApellido, String segundoApellido, char gender, int phoneNum, String city,
                  String province)
    {
        super(nombre, primerApellido, segundoApellido, gender, phoneNum);
        this.city = city;
        this.province = province;
    }

    // GETTERS:
    public String getCity()
    {
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
}

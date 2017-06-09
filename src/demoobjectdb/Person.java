package demoobjectdb;

import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import static javax.persistence.InheritanceType.JOINED;

@Entity
@Inheritance(strategy=JOINED)
public class Person
{
    @Id private int ID;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String gender;
    private int phoneNum;

    public Person(String nombre, String primerApellido, String segundoApellido, String gender, int phoneNum)
    {
        Random rand = new Random();
        this.ID = rand.nextInt(1000) + 1;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public int findID() {
        return ID;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public String getPrimerApellido()
    {
        return primerApellido;
    }

    public String getSegundoApellido()
    {
        return segundoApellido;
    }

    public String getGender()
    {
        return gender;
    }

    public int getPhoneNum()
    {
        return phoneNum;
    }

    //SETTERS:
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido)
    {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido)
    {
        this.segundoApellido = segundoApellido;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setPhoneNum(int phoneNum)
    {
        this.phoneNum = phoneNum;
    }
}

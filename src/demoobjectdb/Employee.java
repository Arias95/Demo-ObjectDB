package demoobjectdb;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends Person
{
    private int salary;
    private int phoneExt;
    private String office;
    private String birthDate;

    public Employee(String nombre, String primerApellido, String segundoApellido, String gender, int phoneNum, int salary,
                    int phoneExt, String office, String birthDate)
    {
        super(nombre, primerApellido, segundoApellido, gender, phoneNum);
        this.salary = salary;
        this.phoneExt = phoneExt;
        this.office = office;
        this.birthDate = birthDate;
    }

    // GETTERS:
    public int getID()
    {
        return this.findID();
    }

    public int getSalary() {
        return salary;
    }

    public int getPhoneExt()
    {
        return phoneExt;
    }

    public String getOffice()
    {
        return office;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    // SETTERS:
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void setPhoneExt(int phoneExt)
    {
        this.phoneExt = phoneExt;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString()
    {
        return String.format("%d | %s %s %s | %s | %s | (%d) %d | %d",
                this.findID(), this.getNombre(), this.getPrimerApellido(),
                this.getSegundoApellido(), this.getBirthDate(), this.getOffice(),
                this.getPhoneExt(), this.getPhoneNum(), this.getSalary());
    }
}

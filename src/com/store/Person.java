package com.store;

import javax.persistence.Id;
import java.util.Random;

public class Person
{
    @Id private int ID;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private char gender;
    private int phoneNum;

    public Person(String nombre, String primerApellido, String segundoApellido, char gender, int phoneNum)
    {
        Random rand = new Random();
        this.ID = rand.nextInt(1000) + 1;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    //GETTERS:
    public int getID()
    {
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

    public char getGender()
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

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public void setPhoneNum(int phoneNum)
    {
        this.phoneNum = phoneNum;
    }
}

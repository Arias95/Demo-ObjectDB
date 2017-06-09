package com.store;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Item
{
    @Id private int ID;
    private String description;
    private int askingPrice;
    private String condition;

    public Item(String description, int askingPrice, String condition)
    {
        Random rand = new Random();
        this.ID = rand.nextInt(1000) + 1;
        this.description = description;
        this.askingPrice = askingPrice;
        this.condition = condition;
    }

    // GETTERS:
    public int getID()
    {
        return ID;
    }

    public String getDescription()
    {
        return description;
    }

    public int getAskingPrice()
    {
        return askingPrice;
    }

    public String getCondition()
    {
        return condition;
    }

    // SETTERS:
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAskingPrice(int askingPrice) {
        this.askingPrice = askingPrice;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}

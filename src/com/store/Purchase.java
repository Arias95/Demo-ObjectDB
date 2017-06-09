package com.store;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Purchase
{
    @Id private int ID;
    private int cost;
    private String purchaseDate;
    private String condition;

    public Purchase(int cost, String purchaseDate, String condition)
    {
        Random rand = new Random();
        this.ID = rand.nextInt(1000) + 1;
        this.cost = cost;
        this.purchaseDate = purchaseDate;
        this.condition = condition;
    }

    // GETTERS:
    public int getID()
    {
        return ID;
    }

    public int getCost()
    {
        return cost;
    }

    public String getPurchaseDate()
    {
        return purchaseDate;
    }

    public String getCondition()
    {
        return condition;
    }

    // SETTERS:
    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }
}

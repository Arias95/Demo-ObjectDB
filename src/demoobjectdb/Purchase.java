package demoobjectdb;
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
    private int client;

    public Purchase(int cost, String purchaseDate, String condition, int client)
    {
        Random rand = new Random();
        this.ID = rand.nextInt(1000) + 1;
        this.cost = cost;
        this.purchaseDate = purchaseDate;
        this.condition = condition;
        this.client = client;
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

    public int getClient() {
        return client;
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

    public void setClient(int client) {
        this.client = client;
    }
    
    @Override
    public String toString()
    {
        return String.format("%d | %d | %s | %s", this.ID, this.cost,
                this.purchaseDate, this.condition);
    }
}

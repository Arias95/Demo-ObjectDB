package demoobjectdb;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Sale
{
    @Id private int ID;
    private int sellingPrice;
    private int salesTax;
    private String dateSold;

    public Sale(int sellingPrice, int salesTax, String dateSold)
    {
        Random rand = new Random();
        this.ID = rand.nextInt(1000) + 1;
        this.sellingPrice = sellingPrice;
        this.salesTax = salesTax;
        this.dateSold = dateSold;
    }

    // GETTERS:
    public int getID()
    {
        return ID;
    }

    public int getSellingPrice()
    {
        return sellingPrice;
    }

    public int getSalesTax()
    {
        return salesTax;
    }

    public String getDateSold()
    {
        return dateSold;
    }

    // SETTERS:
    public void setSellingPrice(int sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public void setSalesTax(int salesTax)
    {
        this.salesTax = salesTax;
    }

    public void setDateSold(String dateSold)
    {
        this.dateSold = dateSold;
    }
    
    @Override
    public String toString()
    {
        return String.format("%d | %d | %s", this.ID, this.sellingPrice + this.salesTax,
                this.dateSold);
    }
}

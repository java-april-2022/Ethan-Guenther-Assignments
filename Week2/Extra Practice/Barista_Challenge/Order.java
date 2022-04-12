import java.util.ArrayList;

public class Order
{
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();


    public Order()
    {
        this.name = "Gertrude";
        this.ready = false;
    }

    public Order(String name)
    {
        this.name = name;
        this.ready = false;
    }

    public void addItem(Item item)
    {
        this.items.add(item);
    }

    public String getStatusMessage()
    {
        if(this.ready == true)
        {
            return "Your Order is Ready";
        }
        else
        {
            return "Thank you for waiting. Your order will be ready soon";
        }
    }

    public double getOrderTotal()
    {
        double total = 0.0;

        for(Item sum : this.items)
        {
            total += sum.getPrice();
        }
        return total;
    }

    public void display()
    {
        System.out.println("Customer Name:" + this.name);
        for(Item list : items)
        {
            System.out.println(list.getName() + "- $" + list.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public boolean getReady()
    {
        return this.ready;
    }

    public void setReady(boolean ready)
    {
        this.ready = ready;
    }

    public String getName(String name)
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class CafeUtil
{
    public int getStreakGoal()
    {
        int sum = 0;
        for(int i = 0; i<=10; i++)
        {
            sum +=i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices)
    {
        double sum = 0;
        for(int i = 0; i < prices.length; i++)
        {
            sum+=prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems)
    {
        for(int i = 0; i < menuItems.size(); i++)
        {
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customer)
    {
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello" + userName);
        System.out.println("There are " + customer.size() + "in front of you");
        customer.add(userName);

        for(int i = 0; i < customer.size(); i++)
        {
            System.out.println(customer.get(i));
        }
    }
    //     public void addCustomer(ArrayList<String> customer)
    // {
    //     System.out.println("Please enter your name");
    //     Scanner scan = new Scanner(System.in);
    //     String userName = scan.nextLine();
    //     System.out.println("Hello" + userName);
    //     System.out.println("There are " + customer.size() + "in front of you");
    //     customer.add(userName);

    //     for(int i = 0; i < customer.size(); i++)
    //     {
    //         System.out.println(customer.get(i));
    //     }
    // }
}
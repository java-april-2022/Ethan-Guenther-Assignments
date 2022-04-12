public class Test
{
    public static void main(String[] args)
    {
        Item item1 = new Item("Capuccino", 3.2);
        Item item2 = new Item("Mocha", 3.5);
        Item item3 = new Item("Drip Coffee", 4.25);
        Item item4 = new Item("Latte", 5.00);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Ethan");
        Order order4 = new Order("Jacob");
        Order order5 = new Order("Lexie");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item3);
        
        order4.addItem(item2);
        order4.addItem(item4);

        order5.addItem(item2);
        order5.addItem(item3);

        order1.setReady(true);
        order3.setReady(true);
        order5.setReady(true);

        System.out.println(order1.getOrderTotal());

        System.out.println(order1.getItems());

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        order1.display();
        order2.display();

        order3.display();
        order4.display();
        order5.display();

        
    }
}
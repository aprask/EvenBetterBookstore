package Commands.User;

import Commands.Item.Item;

import java.util.ArrayList;

public class Cart
{
    ArrayList<Order> orderList;
    private Item item;
    public Cart(int numberOfOrders, int locationID)
    {
        int i = numberOfOrders;
        while(i > 0)
        {
            orderList = new ArrayList<>();
            orderList.add(locationID,new Order(null));
            i--;
        }
    }
}

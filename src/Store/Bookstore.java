package Store;

import Inventory.Inventory;
import Store.Customer.Party;

import java.util.*;
public class Bookstore
{
    private Inventory inventory;
    private Party customerLine;
    public Bookstore()
    {
        while(true)
        {
            System.out.println("How many people are in line? ");
            Scanner scan = new Scanner(System.in);
            int numberOfMembers = scan.nextInt();
            if(numberOfMembers == 0)
            {
                System.out.println("You need more than 0 people...");
            }
            else
            {
                registerMembers(numberOfMembers);
                break;
            }
        }
        // loop n of times while asking for their order
        // ask for payment method and deduct from the user's bank
        // after each n person, ask if they would like a refund or a receipt
        // move on to the next person
    }
    public void registerMembers(int numberOfMembers)
    {
        while(numberOfMembers >= 0)
        {
            numberOfMembers--;
        }
    }
}

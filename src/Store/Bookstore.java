package Store;

import Inventory.Inventory;
import Store.Customer.Customer;
import Store.Customer.Party;

import java.util.*;
public class Bookstore
{
    private Inventory inventory;
    private final Party customerLine = new Party();
    private final Scanner scan = new Scanner(System.in);
    public Bookstore()
    {
        while(true)
        {
            System.out.println("How many people are in line? ");
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
    }
    public void registerMembers(int numberOfMembers)
    {
        int i = 1;
        while(numberOfMembers >= 0)
        {
            System.out.println("Customer #" +  i + " Enter name: ");
            String name = scan.next();
            System.out.println("Customer #" +  i + " Enter balance: ");
            double balance = scan.nextDouble();
            System.out.println("Customer #" +  i + " Enter gender: ");
            String gender = scan.next();
            System.out.println("Customer #" +  i + " Payment type: ");
            String payment = scan.next();
            this.customerLine.registerCustomer(new Customer(name,balance,gender,payment));
            numberOfMembers--;
            i++;
        }
    }
}

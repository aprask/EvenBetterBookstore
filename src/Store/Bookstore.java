package Store;
import Inventory.Inventory;
import Inventory.Item.Item;
import Store.Customer.Customer;
import Store.Customer.Party;
import java.util.*;
public class Bookstore implements Register, BookStoreSpecification {
    private final Party customerLine = new Party();
    private final Inventory inventory = new Inventory();
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
        orderItems();
    }

    public void orderItems()
    {
        int i = this.customerLine.getSizeOfLine();
        while(i > 0)
        {
            System.out.println(this.customerLine.getCustomerName(i) + ", how many items are you checking out? ");

            i--;
        }
    }
    public void checkOut(int numberOfOrders)
    {

    }

    @Override
    public void memberOrder(Customer customer) {
        System.out.println(customer.getName() + " ordered ");
    }

    @Override
    public void checkOut(Customer customer) {

    }

    @Override
    public void refundOrder(Customer customer) {

    }

    @Override
    public void restockProduct(Item item) {
        this.inventory.addItem(item);
    }

    @Override
    public double inventoryValue() {
        int total = 0;
        for(int i = 0; i < inventory.getItemList().size(); i++)
        {
            total+=inventory.getItemList().get(i).getPrice();
        }
        return total;
    }
}

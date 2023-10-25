package Store.Customer;

import java.util.HashMap;

public class Party
{
    private static int placeInLine;
    private final HashMap<Integer, Customer> customerInfo = new HashMap<Integer, Customer>();
    public Party()
    {

    }
    public void initializeCustomerLine()
    {

    }

    public void registerCustomer(Customer customer)
    {
        this.customerInfo.put(placeInLine, customer);
        placeInLine++;
    }
    public void removeCustomer(int placeID)
    {
        this.customerInfo.remove(placeID);
    }
    public int getSizeOfLine()
    {
        return this.customerInfo.size();
    }
    public boolean stillInLine(Customer customer)
    {
        return this.customerInfo.containsValue(customer);
    }
    public String getCustomerName(int locationID)
    {
        return this.customerInfo.get(locationID).getName();
    }
}

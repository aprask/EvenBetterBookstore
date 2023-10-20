package Store.Customer;

import java.util.ArrayList;

public class Party
{
    private String name;
    private int partyID = 0;
    private final ArrayList<Customer> partyMembers = new ArrayList<>();
    public Party(String name)
    {
        this.name = name;
        this.partyID++;
    }
    public void addMember(Customer customer)
    {
        this.partyMembers.add(customer);
    }
    public void removeMember(int customerID)
    {
        this.partyMembers.remove(customerID); // customerID === index
    }
    public double getPartyBalance()
    {
        int total = 0;
        for (Customer partyMember : this.partyMembers) {
            total += partyMember.getBalance();
        }
        return total;
    }

    public int getPartyID() {
        return partyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package Store;

import Store.Customer.Customer;

public interface Register {
    public void registerMembers(int numberOfMembers);
    public void memberOrder(Customer customer);
    public void checkOut(Customer customer);
    public void refundOrder(Customer customer);
}

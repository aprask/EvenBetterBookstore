package Store.Customer;

public class Customer extends Person
{
    private String memberFriendReference;
    public Customer(String name, double balance, String gender, String paymentType) {
        super(name, balance, gender, paymentType);
        this.memberFriendReference = null;
    }

    public String getMemberFriendReference() {
        return memberFriendReference;
    }

    public void setMemberFriendReference(String memberFriendReference) {
        this.memberFriendReference = memberFriendReference;
    }
}

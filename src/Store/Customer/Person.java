package Store.Customer;

public class Person
{
    private String name;
    private double balance;
    private boolean isMale;
    private String paymentType;
    private Account account;

    public Person(String name, double balance, boolean isMale, String paymentType)
    {
        this.name = name;
        this.balance = balance;
        this.isMale = isMale;
        this.paymentType = paymentType;
        new Account(paymentType);
    }
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

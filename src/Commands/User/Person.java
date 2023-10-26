package Commands.User;

import Old.Inventory.Store.Customer.Account;

public class Person
{
    private String name;
    private double balance;
    private String gender;
    private String paymentType;
    private Account account;

    public Person(String name, double balance, String gender, String paymentType)
    {
        this.name = name;
        this.balance = balance;
        this.gender = gender;
        this.paymentType = paymentType;
        new Account(paymentType);
    }
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

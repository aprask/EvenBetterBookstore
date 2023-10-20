package Store.Customer;

import java.util.ArrayList;

public class Bank {
    private final Account account;
    private final double accountBalance;
    private final short cardNumber;
    private final byte securityCode;
    private final String nameOnCard;
    private final String expDate;
    private final ArrayList<Bank> bankAccounts = new ArrayList<>();
    public Bank
    (
                Account account, double accountBalance,
                short cardNumber, byte securityCode,
                String nameOnCard, String expDate
    )
    {
        this.account = account;
        this.accountBalance = accountBalance;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.nameOnCard = nameOnCard;
        this.expDate = expDate;
        this.bankAccounts.add(new Bank(account,accountBalance,cardNumber,securityCode,nameOnCard, expDate));
    }

    public String getExpDate() {
        return expDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public byte getSecurityCode() {
        return securityCode;
    }

    public short getCardNumber() {
        return cardNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Account getAccount() {
        return account;
    }
}

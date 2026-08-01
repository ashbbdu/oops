package prepration.Encapsulation;



public class BankAccount {
    private String name;
    private double balance;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getBalance () {
        return balance;
    }

    public double withdrawMoney () {
        // logic

        return 20.00;
    }
}

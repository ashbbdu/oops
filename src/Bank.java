class BankAccount {
    private double balance;
    private String name;


    public BankAccount () {
        this.balance = 0;
        this.name = "";
    }

    public BankAccount (double _balance , String _name) {
        this.balance = _balance;
        this.name = _name;
    }

    public void setBalance (double _amount) {
        if(_amount <= 0) {
            System.out.println("The amount should be greater than 0");
        }
        this.balance = this.balance + _amount;
    }
    public void getBalance () {
        System.out.println(this.balance);
    }

    public boolean withdrawn (double _amount) {
        if(balance < _amount) {
            System.out.println("Insufficient Funds !");
            return false;
        }
        balance = balance - +_amount;
        return true;
    }

}

public class Bank {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(1000000.00 , "Ashish");
        BankAccount person2 = new BankAccount(290000.00 , "Madhur");
        person1.getBalance();
        person2.getBalance();

        person2.setBalance(120.00);
        person2.getBalance();

        person2.withdrawn(20.00);
        person2.getBalance();

        BankAccount p3 = new BankAccount();
        p3.getBalance();
        person2.setBalance(100);
        person2.getBalance();
    }
}

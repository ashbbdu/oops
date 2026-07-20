package StaticKeyword;

class BankAccount {
    static int counter;
    String name;
    int balance;

    public static int add (int a , int b) {
        return a + b;
    }

    BankAccount (String name , int balance) {
        this.name = name;
        this.balance = balance;
        counter++;
    }




}

class Test {
    int sum = BankAccount.add(10 , 20);

}
public class Concept {
    public static void main(String[] args) {
        System.out.println(BankAccount.counter);
        BankAccount b1 = new BankAccount("Ashish Srivastava" , 1234556612);
        BankAccount b2 = new BankAccount("Test Singh" , 12331);
        System.out.println(BankAccount.counter);

        System.out.println(BankAccount.add(1 , 2));
    }
}

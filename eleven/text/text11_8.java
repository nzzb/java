package text;

public class text11_8 {
    public static void main(String[] args) {
        Account a = new Account("George", 2233, 1000, 1.5);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        a.tostring();
    }
}

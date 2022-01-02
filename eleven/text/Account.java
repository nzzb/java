package text;

import java.util.ArrayList;

import javax.print.event.PrintEvent;

public class Account {
    String name;
    int id;
    double last_money, interest;
    ArrayList<Transactions> transactions = new ArrayList<>();

    public Account(String name, int id, double last_money, double interest) {
        this.name = name;
        this.id = id;
        this.last_money = last_money;
        this.interest = interest;
    }

    public void withdraw(int money) {
        this.last_money -= money;
        Transactions temp = new Transactions('W', money, this.last_money, "nothing");
        transactions.add(temp);
    }

    public void deposit(int money) {
        this.last_money += money;
        Transactions temp = new Transactions('D', money, this.last_money, "nothing");
        transactions.add(temp);
    }

    public void tostring() {
        System.out.println("Name: " + this.name + " interest: " + this.interest + " amount:" + this.last_money);
        for (int i = 0; i < transactions.size(); i++) {
            transactions.get(i).tostring();
        }
    }
}

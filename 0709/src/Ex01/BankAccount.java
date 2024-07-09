package Ex01;

public class BankAccount {

    int balance = 0;

    public int checkMyBalance() {

        System.out.println("잔액 " +balance);
        return balance;
    }

    public void deposit(int a) {
        balance += a;

    }
    public void withdraw(int a) {
        balance -= a;
    }
}

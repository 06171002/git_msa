package Ex01;

public class BankAccountMain {
    public static void main(String[] args) {
        System.out.println("시작");

        BankAccount park = new BankAccount();
        BankAccount yoon = new BankAccount();

        park.checkMyBalance();
        yoon.checkMyBalance();

        park.deposit(3000);
        yoon.deposit(4000);

        park.withdraw(2000);
        yoon.withdraw(1000);

        park.checkMyBalance();
        yoon.checkMyBalance();


        System.out.println("끝");

    }
}

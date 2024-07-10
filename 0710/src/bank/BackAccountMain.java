package bank;

public class BackAccountMain {

//    public static void checkMyBalance(){
//    }

    public static void main(String[] args) {
        System.out.println("시작");

        BankAccount park = new BankAccount("박길동", "1234", "001002", 5000);
        BankAccount yoon = new BankAccount("윤길동", "5678", "001001", 5000);
//        park.initAccount("1234", "001002", 5000);
//        yoon.initAccount("5678", "001001", 5000);

        park.cmb();
        yoon.cmb();

        park.deposit(3000);
        yoon.deposit(4000);

        park.cmb();
        yoon.cmb();

        park.withdraw(1000);
        yoon.withdraw(2000);

        park.cmb();
        yoon.cmb();

        System.out.println("끝");
    }
}
package bank;

public class BankAccount {
    int num = 0;
    String name = "";
    String accNumber="";
    String ssnumber="";

    BankAccount(String na,String acc, String ss, int n){
        name = na;
        accNumber = acc;
        ssnumber = ss;
        num = n;
    }


//    public void initAccount(String acc, String ss, int n) {
//        accNumber = acc;
//        ssnumber = ss;
//        num = n;
//    }

    public void cmb() {
        System.out.println("======================");
        System.out.println("계좌번호 = " +accNumber );
        System.out.println("주민번호 = " +ssnumber );
        System.out.println("이름 "+name+" 잔액 " + num);
        System.out.println("======================");
    }

    public void deposit(int a) {
        num += a;
    }

    public void withdraw(int a){
        num -= a;
    }

}
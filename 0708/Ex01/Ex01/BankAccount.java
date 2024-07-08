package Ex01;

public class BankAccount {
    public int a = 10;

    public void  mod() {
        a = 20;
    }

    @Override
    public String toString() {
        return "aa" + a;
    }
}

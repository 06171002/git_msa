package Ex01;


class Person {


    private String jumin;
    private String passport;

    public Person() {}

    public Person(String jumin) {
        this.jumin = jumin;
    }

    public Person(String jumin, String passport) {
//        this.jumin = jumin;
        this(jumin);
        this.passport = passport;
    }

    public void show() {
        System.out.println("jumin = " +jumin);
        System.out.println("passport = " +passport);

    }

    @Override
    public String toString() {
        return "Person{" +
                "jumin='" + jumin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}



public class Ex04 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("931028");
        Person p3 = new Person("931028","00001");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.show();
        p2.show();
        p3.show();

    }
}

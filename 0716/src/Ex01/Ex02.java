package Ex01;



class Person {
    private String name;
    private int age;
    private int height;

    public Person(){}

    public Person(String name) {
        this.name = name;

    }

    public void greeting() {
        System.out.println(name + "hello");

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

public class Ex02 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

//        p1.setName("홍길동");

        p1.greeting();
        p2.greeting();

        System.out.println(p1);
        System.out.println(p2);
    }


}

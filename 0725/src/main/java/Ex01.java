class AA {
    private String name;

    public AA(String name) {
        this.name = name;
    }

    public void printThis(Object obj){
        System.out.println("this = " +this);
        System.out.println("(A)obj = " +(AA)obj);
        System.out.println("this.name = " +this.name);
    }

    @Override
    public boolean equals(Object o) {
        return  this.name.equals(((AA)o).name);
    }
}

public class Ex01 {
    public static void main(String[] args) {
        AA AA1 = new AA("AA");
        AA AA2 = new AA("AA");
        AA AA3 = new AA("AAA");

        AA1.printThis(AA2);

        System.out.println(AA1.equals(AA2));
        System.out.println(AA2.equals(AA1));
        System.out.println(AA3.equals(AA1));

        System.out.println(AA1 == AA2);
    }
}

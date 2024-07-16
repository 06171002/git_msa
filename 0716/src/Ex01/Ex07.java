package Ex01;




class Test{
    public static void doA(){
        System.out.println("static doA");
    }
    public void doB(){
        System.out.println("그냥,,, instance doB");
    }
}
public class Ex07 {
    int num = 0;
    static void Add(int n){

    }


    public static void main(String[] args) {
        Test.doA();
        Test test = new Test();
        test.doB();


    }
}


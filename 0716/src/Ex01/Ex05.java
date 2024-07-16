package Ex01;



class InstClass{
    static int num = 0;
    InstClass(){
        num++;
        System.out.println(num);
    }
}


public class Ex05 {

    public static void main(String[] args) {
        System.out.println(InstClass.num);
        new InstClass();
        new InstClass();
        new InstClass();
        new InstClass();


    }
}

package Ex01;



class TV {

    private  String name;
    private  int year;
    private  int inch;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println(name +"에서 만든 " +year+ "년형 " +inch+"인치 TV");
    }


    //    public TV(String n, int y, int in){
//        name = n;
//        year = y;
//        inch = in;
//    }
}
public class Ex03 {

    public static void main(String[] args) {

        TV myTV = new  TV("LG",2017,32);
        myTV.show();
    }
}

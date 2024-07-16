package Ex01;



class TV {
    public void show(String n, int i, int j){

        System.out.println(n  + "에서 만든 " + i + "년형 " + j + "인치 TV");

    }

}
public class Problem1 {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.show("LG",2017,32);
    }


}

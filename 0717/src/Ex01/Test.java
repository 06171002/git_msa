package Ex01;

public class Test {
    public static void main(String[] args) {
        Song song = new Song("Dancing Queen","ABBA",1978,"Sweden");
        song.show();

        Student st = new Student(75,90,88);
        st.getTotal();
        st.getAverage();
    }
}

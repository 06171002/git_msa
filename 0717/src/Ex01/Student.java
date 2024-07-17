package Ex01;

public class Student {
    int kor;
    int eng;
    int math;

    public Student(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void getAverage(){
        float a = (float) (kor + eng + math)/3;
        float b = Math.round(a*10);
        float aver = b/10;

        System.out.println(aver);
    }
    public void getTotal(){
        int sum = kor + eng + math;
        System.out.println(sum);
    }
}


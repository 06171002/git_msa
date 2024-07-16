package Ex01;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class AA {
    public static BB bb =new BB();
}

class BB {
    public void doA(){
        System.out.println("BB doA");
    }
}
public class Ex08 {

    public static void main(String[] args) {
//        AA.bb.doA();

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}

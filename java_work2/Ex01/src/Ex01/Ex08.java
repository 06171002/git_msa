package Ex01;

public class Ex08 {

    public static void main(String[] args) {

//       int sum = 0;
//       int num = 1;
//       while (sum<100){
//           if (num %2 != 0){
//               sum = sum + num;
//               System.out.println(num+": "+sum);
//           }else {
//               sum = sum - num;
//               System.out.println(num+": "+sum);
//           }
//           num++;
//       }
//        System.out.println(num -1);
//        System.out.println(sum);
        aa(2);

    }

    public static void aa(int i){
        int sum = 0;
        int num = 1;
        for (;sum<100;num++){
            if (num %2 != 0){
                sum = sum + num;
                System.out.println(num+": "+sum);
            }else {
                sum = sum - num;
                System.out.println(num+": "+sum);
            }
        }
        System.out.println(num -1);
        System.out.println(sum);

    }
}



import java.util.Scanner;

public class Ex06 {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("숫자 입력");
			 int num1 = scan.nextInt();
			 
			 System.out.println(num1);
			 
			 if(num1 < 10) {
				 System.out.println("10미만 입니다");
			 }else if(10 <= num1 && num1 <= 20) {
				 System.out.println("10이상이고 20이하입니다");
			 }else {
				 System.out.println("20초과");
			 }
			}
		
		
		
}

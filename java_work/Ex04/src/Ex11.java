import java.util.Scanner;

public class Ex11 {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			
			int result =num - num%100;
			System.out.println(result);
		}
}

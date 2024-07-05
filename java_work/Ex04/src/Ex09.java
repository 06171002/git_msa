import java.util.Scanner;

public class Ex09 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			
			String result = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
			
			System.out.println(result);
		}
}

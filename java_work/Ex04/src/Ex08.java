import java.util.Scanner;

public class Ex08 {
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			int numOfApples= sc.nextInt();
			int sizeOFBucket= sc.nextInt();
			
			
			int numOFBucket = (numOfApples%sizeOFBucket == 0 ? numOfApples/sizeOFBucket :numOfApples/sizeOFBucket + 1);
			
	
			
			
			System.out.println("필요한 바구니의 수" + numOFBucket);
			
					
			
			
		
		}
}

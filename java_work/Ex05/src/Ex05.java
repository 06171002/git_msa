
public class Ex05 {
		public static void main(String[] args) {
			
			
			for(int num = 1; num<100; num++ ) {
				if( num%3 == 0 && num%4 == 0) {
					System.out.println("3,4의 최소공배수 =" +num);
					break;
				}
			}
		}
}

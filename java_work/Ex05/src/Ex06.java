
public class Ex06 {
		public static void main(String[] args) {
			int num = 1;
			while(num<100) {
				if(num%3==0 && num%4==0) {
					break;
					
					
				}num++;
			}
			System.out.println("3,4의 최소공배수 =" +num);
		}
}


public class Ex07 {

	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		while ((num++)<100) {
			if(num%6!=0 || num%8!=0) 
				continue;
				count++;
				System.out.println(num);
				
				
			
		}
		System.out.println(count);
	}
}

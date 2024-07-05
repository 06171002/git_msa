package exam;

public class Ex02 {
    public static void main(String[] args) {
        // boolean prime = true;
        // for(int i = 2; i<=100; i++){
        //     prime = true;
        //     for(int j = 2; j<i; j++ ){
        //         if(i%j !=0){
        //             continue;
        //         } else{
        //             prime = false;
        //             break;
        //         }
        //     }
        //     if(prime == false){
        //         System.out.println(i + "는 소수가 아닙니다.");
        //     }else {
        //         System.out.println(i + "는 소수입니다.");
        //     }
        
        // }
        boolean flag = true;
        for(int i = 0; i<=100; i++){
            
            for(int j = 1; j<100; j++){
                if(j == 5){
                    flag = false;
                    break;
                }

                System.out.println(i + " " + j);
            } if(flag == false) break;
        }
    }
    
    
}

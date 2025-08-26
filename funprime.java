
import java.util.Scanner;

public class funprime {
    public static boolean isPrime(int n){
        if(n==2){
            return  true;
        }
        //boolean isPrime = true; also can 
        for(int i = 2; i <= /*n-1*/ Math.sqrt(n); i++){
            if(n % i == 0){
                //isPrime = false;
                //break;
                return false;
            }
        }
        //return isPrime; also can
        return true;

        
    }

    //prime in range
    public static void primeinrange(int n){
            for(int i= 2; i <=n; i++){
                if(isPrime(i)){
                System.out.print(i +", ");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        primeinrange(n);

        sc.close();
    }
}

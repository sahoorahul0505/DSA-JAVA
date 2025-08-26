
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr a number : ");
        int n = sc.nextInt();

        if( n == 2){
            System.out.println("the number is prime");
        }
        else{
           boolean isPrime = true;
        for (int i = 2; i < /*n-1*/ Math.sqrt(n); i++) {
            if( n % i == 0){ // n is multiple if i (i not equal to 1 or n)
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("the numer is prime");
        }
        else{
            System.out.println("the number is not prime");
        } 
        }

        sc.close();
    }
}

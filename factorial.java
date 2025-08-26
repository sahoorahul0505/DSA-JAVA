
import java.util.Scanner;

public class factorial {
    
    public static void  facto(int n){
        int f = 1;
        for (int i = 1; i <=n; i++) { // factorial of n means (n! = 1 x 2 x 3 x 4 x ........ x n)
                f= f * i;             // let f = 1, so i = 1 ; f = 1 x 1 = 1
                                      //               i = 2 ; f = 1 x 2 = 2...... so on;
        }
        System.out.println("factorial of " + n + " is "+ f);
       // return f;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your value : ");
        int n = sc.nextInt();
        /*int f = */facto(n);
        //System.out.println("factorial of " + n + " is "+ f);

        sc.close();
    }
}

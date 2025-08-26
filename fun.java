
import java.util.*;

public class fun {
    public static int calcutate(int num1, int num2){ // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calcutate(a, b); // arguments or actual parameters
        System.out.println("sum is :" + sum);

        sc.close();
    }
}

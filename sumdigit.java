
import java.util.Scanner;

public class sumdigit {
    public static int countdigit(int num){
        int sum = 0;
        while(num > 0){
            int ld = num %10;
            sum =sum + ld;
            num= num/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit : ");
        int n = sc.nextInt();
        System.out.println("sum = "+ countdigit(n));

        sc.close();

    }
}

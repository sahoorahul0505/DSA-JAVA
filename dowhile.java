
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        
        // print number until user not enter multiple of 10
        Scanner sc = new Scanner(System.in);
       

        do{
            System.out.print("enter number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("you entered : "+n);
            sc.close();
        }
        while (true);{
            System.out.println("you entered multiple of 10");
        }
    }
}

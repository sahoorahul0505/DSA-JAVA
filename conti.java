import java.util.Scanner;

public class conti {

    // display all nubers entered by user expected multiple of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("you entered multiple of 10");
                continue;
            }
            System.out.println("You entered : "+n);
            sc.close();
        } 
        while (true);
    }
}

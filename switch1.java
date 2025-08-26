import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your choice : ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("you entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("You entered wrong key!");
                break;
        }
        sc.close();
    }
}

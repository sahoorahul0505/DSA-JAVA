import java.util.Scanner;

public class calcy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operand 1:");
        int a = sc.nextInt();
        System.out.println("enter operand 2:");
        int b = sc.nextInt();
        System.out.println("enter operation you want ( +, - , /, *, % ) :");
        char ch = sc.next().charAt(0); // sc.next() returns string value so make it char

        switch (ch) {
            case '+':
                System.out.println("the addition is " + (a+b));
                break;
            case '-':
                System.out.println("the substaction is " + (a-b));
                break;
            case '*':
                System.out.println("the multiplication is " + (a*b));
                break;
            case '/':
                System.out.println("the the division  is " + (a/b));
                break;
            case '%':
                System.out.println("the modulo is " + (a%b));
                break;
            default:
                System.out.println("warning !, key missmacth");
                break;
        }

        sc.close();
    }
}

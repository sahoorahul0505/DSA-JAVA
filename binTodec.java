
import java.util.Scanner;

public class binTodec {
    public static int  bin_to_dec(int binNum){
        int mybin = binNum;
        int pow = 0;
        int decNum = 0; // to store decimal value
        while(binNum > 0){
            int LD = binNum % 10;
            decNum = decNum + (LD * (int)Math.pow(2, pow));// math.pow returns double value so we need to type cast to int
            binNum = binNum / 10;
            pow ++;

        }
        System.out.print("decimsl of "+ mybin+ " = "+ decNum);
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a binary number : ");
        int binNum = sc.nextInt();
        bin_to_dec(binNum);
        //int result = bin_to_dec(n);
        //System.out.print("decimal of "+ n + " = " + result);

        sc.close();
    }
}
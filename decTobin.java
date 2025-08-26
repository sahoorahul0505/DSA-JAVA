
import java.util.Scanner;
                                                                    // 0th place --> rem x 10 power 0
                                                                    // 10th place --> rem x 10 power 1
                                                                    // 100 place --> rem x 10 power 2....
public class decTobin {
    public static int dec_to_bin(int dec_Num){
        int mydec = dec_Num;
        int pow = 0;
        int bin_Num = 0;
        while(dec_Num > 0){
            int rem = dec_Num % 2; // to find rementer
            bin_Num = bin_Num + (rem * (int)Math.pow(10, pow)); // for placing (0 to n)th place to rem multiply it with 10 power of 0,1,2,3...n
            pow ++;
            dec_Num = dec_Num / 2;
        }
        System.out.print("binary of "+ mydec + " = " + bin_Num);
        return dec_Num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal number : ");
        int dec_Num = sc.nextInt();
        dec_to_bin(dec_Num);

        sc.close();
    }
}

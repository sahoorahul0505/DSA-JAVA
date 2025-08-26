import java.util.Scanner;

// Binomial Coefficient formula n!/r!*(n-r)!

public class bincofficient {
    public static int factor(int m){
        int f = 1;
        for(int i = 1 ; i <= m; i++){
            f = i * f;
        }
        return  f;// factorial of n
    }
    public static int bincoff(int n , int r){
        int fact_n = factor(n);
        int fact_r = factor(r);
        int fact_nmr = factor(n-r);

        int bc = (fact_n / fact_r *(fact_nmr));
        return bc;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        System.out.print("enter value of r : ");
        int r = sc.nextInt();

        System.out.println( "binomial cofficient of " + n + " & "+ r + " is " + bincoff(n, r));
        sc.close();
    }

}


import java.util.Scanner;

public class rangeeven {
    public static void rngeven(int n){
        for (int i = 2; i <= n; i++){
            if( i % 2 ==0 ){
                System.out.print(i + ", ");
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range :");
        int n = sc.nextInt();
        
        System.out.print("even numbers : ");
        rngeven(n);
        
        sc.close();
    }

}

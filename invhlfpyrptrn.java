public class invhlfpyrptrn {

    // INVERSE HALF PYRAMID 90 DEGREE ROTATE

// * * * * 
// * * *
// * *
// *

    public static void ihpp(int n){
        // // inner loop
        // for(int i = 1; i <= n ; i++){
        //     // outer loop
        //     for(int j = i; j <= n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // outer loop
        for(int i = n; i>= 1; i--){ // decrement of i
            // outer loop
            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ihpp(4);
    }
}

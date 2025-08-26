public class inv180dpyrmd {

    // REVERSE HALF PYRAMID 180 DEGREE ROTATE

//       *
//     * *
//   * * *
// * * * *

    public static void pyramid180roted(int n){
        //outer loop
        for(int i = 1; i <=n; i++){
            // Inner loop --> space print
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            // inner loop star ptint
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid180roted(4);
    }
}

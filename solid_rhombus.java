public class solid_rhombus {

//         * * * * * 
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

    public static void SolidRhombus(int n){
        // outer loop row
        for(int i = 1; i <= n; i++){
            // space = n-i
            int space = n-i;
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            // inner loop column
            for(int j =1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        SolidRhombus(5);
    }
}

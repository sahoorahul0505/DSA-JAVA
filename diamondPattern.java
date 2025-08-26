public class diamondPattern {

//       * 
//     * * *       
//   * * * * *
// * * * * * * * ----------> upper part 
// * * * * * * *     ------> lower part
//   * * * * *   
//     * * *
//       *

    public static void DiamondPattern(int n){
        // upper part
        for(int i = 1; i <= n; i++){
            // spaces
            int space = n-i;
            for(int j = 1 ; j <= space; j++){
                System.out.print("  ");
            }
            // stars
            int star = 2 * i - 1;
            for(int j = 1; j <= star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part
        for(int i = n; i >= 1; i--){
            // spaces
            int space = n-i;
            for(int j = 1 ; j <= space; j++){
                System.out.print("  ");
            }
            // stars
            int star = 2 * i - 1;
            for(int j = 1; j <= star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        DiamondPattern(4);
    }
}

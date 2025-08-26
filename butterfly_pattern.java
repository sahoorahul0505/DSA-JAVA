public class butterfly_pattern {
// *             * \
// * *         * *  \  upper half 
// * * *     * * *  /
// * * * * * * * * /
// * * * * * * * * \
// * * *     * * *  \
// * *         * *  /  lower half
// *             * /

    public static void butterfly_ptrn(int n){

        // upper half 
        // outer loop
        for(int i = 1; i <= n; i++){
            // first part of star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // spaces
            int spaces = 2*(n-i);
            for(int j = 1; j<= spaces; j++){
                System.out.print("  ");
            }

            // 2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower half 
        // outer loop
        for(int i = n; i >= 1; i--){
            // first part of star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // spaces
            int spaces = 2*(n-i);
            for(int j = 1; j<= spaces; j++){
                System.out.print("  ");
            }

            // 2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        butterfly_ptrn(4);
    }
}

public class triangle_0_1 {

    // 0-1 TRIANGLE PATTERN

// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

    public static void triangle01(int n){
        // outer loop row
        for(int i = 1; i <= n; i++){
            // inner loop column
            for(int j = 1; j <= i; j++){
                //cell even= 1 // odd = 0 print
                if((i+j) % 2 == 0){ // for EVEN print "1"
                    System.out.print("1 ");
                }
                else{ // for ODD print "0"
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle01(5);
    }
}

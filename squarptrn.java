
public class squarptrn {
    // public static void main(String[] args) {
    //     for(int i = 1; i <=4; i++){ //    for column ---<if i true it jumps to inner loop to j>
    //         for(int j =1; j <=5; j++){ //    for row <if j true it print> 
    //             System.out.print("*");
    //         }
    //         System.out.println(); // for next line 
    //     }
    // }

    // SOLID SQUARE PATTERN

// * * * * * 
// * * * * *
// * * * * *
// * * * * *

    public static void recptrn(int r, int c){
        // Outer loop // rows --> outer loop
        for(int i = 1; i <= r; i++){
            // Inner loop for row // column --> Inner lopp
            for(int j = 1; j <= c; j++){
                System.out.print("* "); // for single line print
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        recptrn(4, 5);
    }
}
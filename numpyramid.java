public class numpyramid {

//      1      ---> 1st row --> 4 spaces \
//     2 2     ---> 2nd row --> 3 spaces  \
//    3 3 3    ---> 3rd row --> 2 spaces   > print  ( i + " " ) // for spaces in between numbers  
//   4 4 4 4   ---> 4th row --> 1 spaces  /
//  5 5 5 5 5  ---> 5th row --> 0 spaces /

    public static void NumPyramid(int n){
        // outer loop
        for(int i = 1; i <= n; i++){
            // spaces
            int spacess = n-i;
            for(int j = 1; j <= spacess; j++){
                System.out.print(" ");
            }
            // numbers --> print row no, row no. times
            for(int j = 1; j <= i; j++){
                System.out.print(i + " "); // " " for print spaces in between numbers
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumPyramid(5);
    }
}

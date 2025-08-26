public class PalindromicPattern {

//          | ------> 1st part numbers --> i to 1; backward
//         1| 
//       2 1||2 -------> 2nd part --> 2 to i; forward
//     3 2 1||2 3
//   4 3 2 1||2 3 4
// 5 4 3 2 1||2 3 4 5

    public static void palindrompattern(int n){
        // outer loop
        for(int i = 1; i <= n; i++){
            // spaces
            int spaces = n-i;
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }

            // 1st half numbers
            for(int j = i; j >= 1; j--){ // backward
                System.out.print(j+ " ");
            }

            // 2nd half numbers
            for(int j = 2; j <= i; j++){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindrompattern(5);
    }
}

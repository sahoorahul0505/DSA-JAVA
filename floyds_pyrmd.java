public class floyds_pyrmd {

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

    public static void floydspyramid(int n){
        int number = 1;
        // outer loop
        for(int i = 1 ; i<= n; i++){
            // outer loop
            for(int j = 1; j <= i; j++){ // count only number of column
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydspyramid(5); // rows = 5
    }
}

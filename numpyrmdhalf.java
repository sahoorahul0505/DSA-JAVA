public class numpyrmdhalf {

    // HALF PYRAMID USING NUMBERS

// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

    public static void numpyrmd(int n){
        //outer loop
        for(int i = 1; i<= n; i++){
            // inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        numpyrmd(5);
    }
}



public class hollowptrn {

// HOLLOW SQUAR

// * * * * * 
// *       *
// *       *
// * * * * *
    public static void holowptrn(int r, int c){
        // outer loop (row)
        for (int i = 1; i <= r ; i++) {
            // Inner loop (Column)
            for(int j = 1; j <= c; j++){
                // cell --> (i,j) condition is (i=1 or j=1 or i=r or j=c)
                if(i == 1 || j == 1 || i == r || j == c){
                    System.out.print("* "); // print for single line print
                }
                else{
                    System.out.print("  "); // spacing 
                }
            } 
            System.out.println(); // for outer next line
        }
    }

    public static void main(String[] args) {
        holowptrn(4, 5);
    }
}

public class pairArray {
    public static void PrintPair(int numbers[]) {
        // outer loop
        int totalPairs = 0;
        for(int i = 0; i < numbers.length; i++){
            int current = numbers[i]; // 2, 4, 6, 8, 10
            for(int j = i+1 ; j < numbers.length; j++){ // j starts with index 1
                System.out.print( "(" + current + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        } 
        System.out.println("total pairs is = "+totalPairs);
    }


    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        PrintPair(numbers);

        // output will 
        // (2,4) (2,6) (2,8) (2,10) 
        // (4,6) (4,8) (4,10)
        // (6,8) (6,10)
        // (8,10)
    }
}

public class SubArray {
    // print Sub Arrays
    public static void subArrays(int numbers[]) {
        // start
        int totalsubarr = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            // end
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                totalsubarr++;
                int sum = 0;
                // print
                for(int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+","); // sub arrays
                    sum = sum + numbers[k];
                }
                System.out.println(" ---> sum = " + sum);

                // update the max and min sum
                if(sum > maxsum) {
                    maxsum = sum;
                }
                if(sum < minsum) {
                    minsum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+ totalsubarr);
        System.out.println("maximum sum of sub arrays = " + maxsum);
        System.out.println("minimum sum of sub arrays = " + minsum);
        
    }


    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArrays(numbers);
    }
}

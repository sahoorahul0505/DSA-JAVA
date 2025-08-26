public class MaxMinSubArrSum {
    public static void max_min_sub_arr_sum(int numbers[]) {
        // start
        int TS = 0;
        
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            //end
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                TS++;
                int sum = 0;
                // print sun array
                for(int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + ", ");
                    sum = sum + numbers[k];
                }
                System.out.println(" ----> sum = "+sum);

                if(sum > maxsum) {
                    maxsum = sum;
                }
                if(sum < minsum) {
                    minsum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("maximum sum of sub arrays = "+maxsum);
        System.out.println("minimum sum of sub arrays = "+minsum);
        System.out.println("total number of sub array = "+TS);
    }


    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        max_min_sub_arr_sum(numbers);
    }
}

public class MaxSumSubArray_2 {
    public static void max_min_sub_arr_sum_2(int numbers[]) {

        int Currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int prefix[] = new int[numbers.length];

        // calculate prefix array
        prefix[0] = numbers[0]; // sum of 0 index = numbers[] of 0 index
        for(int i = 1 ; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // start
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                Currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // if start = 0 then currsum will prefix[end]

                // comparing currsum with maxsum
                if(Currsum > maxsum) {
                    maxsum = Currsum;
                }
                if(Currsum < minsum) {
                    minsum = Currsum;
                }
            }
        }
        System.out.println("maximum sum of sub arrays = "+maxsum);
        System.out.println("minimum sum of sub arrays = "+minsum);
    }


    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        max_min_sub_arr_sum_2(numbers);
    }
}
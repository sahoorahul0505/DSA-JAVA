public class reverseArray {
    public static void RevArr(int nums[]){
        int first = 0, last = nums.length - 1;

        while(first < last){
            // swapp
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first ++;
            last --;
        }
    }


    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        RevArr(nums);
        // print values
        for(int i = 0; i < nums.length; i++){
            System.err.print(nums[i] +" ");
        }
    }
}

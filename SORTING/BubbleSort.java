public class BubbleSort{

    public static void bubbleSort(int arr[]) {
        // Outer loop: runs (n-1) times in the worst case.
        // After each pass, the largest element among the unsorted part
        // "bubbles up" to its correct position at the end.
        for (int iteration = 0; iteration < arr.length - 1; iteration++) {

            int swap = 0; // Counts swaps in this pass; used to detect if array is already sorted.

            // Inner loop: compares adjacent elements and swaps them if they are in the
            // wrong order.
            // The range decreases by 'iteration' each time since the last elements are
            // already sorted.
            for (int j = 0; j < arr.length - 1 - iteration; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap++; // Increment swap count for this pass
                }
            }

            // Optimization: if no swaps occurred in this entire pass,
            // the array is already sorted → break early to avoid useless iterations.
            if (swap == 0)
                break;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }


    public static void main(String args[]){
        int arr[] = {5,4,1,3,2,6,7,8,9};
        int orderedArr[] = {1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
}
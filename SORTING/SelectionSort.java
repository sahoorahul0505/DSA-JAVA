public class SelectionSort {

    public static void selectionSort(int arr[]){
        // ouert loop for iteration
        for(int i = 0; i < arr.length -1; i++){ // from index 0 to last 2nd index of arr
            int minPos = i;
            for(int j = i+1; j< arr.length; j++){ // from i+1 to last index od array
                // check smallest
                if (arr[minPos] > arr[j]) { // for increasing order arr[minPos] > arr[j]
                                            // for decreasing oredr arr[minPos] < arr[j]
                    minPos = j;
                }
            }
            // swap here in outer loop
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}

public class BubbleSort{

    public static void bubbleSort(int arr[]){
        // iteration 1
        for(int iteration = 0; iteration < arr.length - 1; iteration++){ // outer loop
            int swap = 0;
            for(int j = 0; j<arr.length - 1 - iteration; j++){ // inner loop
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
            if (swap == 0) break; // checkes any swapp happen if not stope loop for better time complexcity
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
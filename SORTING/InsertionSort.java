public class InsertionSort {
    public static void insertionSort(int arr[]){
        // loop to define from where and kis tak loop sort karna he
        for(int i = 1; i <arr.length;i++){
            int curr = arr[i]; // temp memory to store curr element
            int prev = i-1; // previouse index
            // Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) { // back tracking, comparision with curr element, the prev index must me greater than 0 or eual 0
                // shift the greater to right   
                arr[prev + 1] = arr[prev]; // prev + 1, means the next or right index 
                prev--; // before prev = i - 1 then after increament i-1-1 = i-2, so we move backward as the prev is shifetd to right
            }
            // Insertion
            arr[prev+1] = curr; // prev + 1, because every shift the prev get 1 step back so we need to correct this, insert the curr element  in to prev empty spot
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
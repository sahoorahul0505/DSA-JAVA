public class BinarySearch {
    // Binary Search
    public static int BinSearch(int number[], int key){
        int start = 0, end = number.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            // comparision
            if (number[mid] == key) { // founded
                return mid;
            }
            if(number[mid] > key){ // left value
                end = mid - 1;
            } else { // right value
                start = mid + 1;
            }
        }
        return -1; // not exist
    }



    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int index = BinSearch(numbers,key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println(" key present at index : "+ index);
        }
    }
}
